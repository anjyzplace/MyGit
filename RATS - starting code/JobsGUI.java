import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * Provide a GUI interface for the job submission system.
 * Only shows a selection of possible functions: add job, list jobs 
 * waiting record job done.
 * 
 * @author A.A.Marczyk
 * @version 27/02/08
 */
public class JobsGUI 
{
    private Manager mmm ;
    private JFrame myFrame = new JFrame("Jobs GUI");
    private Container contentPane = myFrame.getContentPane();
    
    private JButton quitButton = new JButton("Quit");
    
    private JPanel eastPanel = new JPanel();
    private JPanel westPanel = new JPanel(); 
    private JPanel centerPanel = new JPanel();
    private JPanel northPanel = new JPanel();
    private JPanel southPanel = new JPanel();
    
    public JobsGUI()
    {
        mmm = new Branch("Watford");
        addAllStaff();
        makeFrame();
        makeMenus(myFrame);
    }
    
    private void addAllStaff()
    {
        // add all branch staff
        mmm.addStaff("CL1","Ann");
        mmm.addStaff("CL2","Bob");
        mmm.addStaff("TY1","Che", true, true);
        mmm.addStaff("TY2","Dan", true, false);
        mmm.addStaff("TY3","Eve", false, true);
        mmm.addStaff("TY4","Fez", false, false);
//         mmm.addStaff("TR1","Gil", true, true,"French", 15.50);
//         mmm.addStaff("TR2","Han", true, false,"French", 16.50);
//         mmm.addStaff("TR3","Kit", false, true,"German", 17.50);
//         mmm.addStaff("TR4","Lil", false, false,"German", 18.50);
    }
    
    /**
     * Create the main frame's menu bar.
     */
    private void makeMenus(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // create the File menu
        JMenu fileMenu = new JMenu("Jobs");
        menubar.add(fileMenu);
        
         JMenuItem toDoItem = new JMenuItem("Add Job");
        toDoItem.addActionListener(new DoneHandler());
        fileMenu.add(toDoItem);
        
        JMenuItem doneItem = new JMenuItem("Job Done");
        doneItem.addActionListener(new DoneHandler());
        fileMenu.add(doneItem);
        
        JMenuItem waitItem = new JMenuItem("List Waiting");
        waitItem.addActionListener(new DoneHandler());
        fileMenu.add(waitItem);
                
    }

    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {    
        final int horizMargin = 10;
        final int vertMargin = 10;
        
        final int floorRows = 2;
        final int floorColumns = 1;
        
        final int frameWidth = 320;
        final int frameHeight = 400;
        
        contentPane.setLayout(new BorderLayout());
        contentPane.add(eastPanel, BorderLayout.EAST);
        contentPane.add(southPanel, BorderLayout.SOUTH);
        contentPane.add(westPanel, BorderLayout.WEST);
        contentPane.add(centerPanel, BorderLayout.CENTER);
        // set panel layout and add components

        southPanel.add(quitButton);
        quitButton.setVisible(true);
        quitButton.addActionListener(new QuitButtonHandler());
        
        myFrame.setSize(frameWidth,frameHeight);

        // building is done - arrange the components and show        
        //myFrame.pack();
        myFrame.setVisible(true);
    }

    private void makeTypes()
    {
        westPanel.setVisible(false);
        centerPanel.setVisible(false);
        northPanel.setVisible(false);
        contentPane.add(westPanel, BorderLayout.WEST);
        contentPane.add(centerPanel, BorderLayout.CENTER);
        contentPane.add(northPanel, BorderLayout.NORTH);
        // set panel layout and add components
        centerPanel.setLayout(new FlowLayout());
        northPanel.setLayout(new GridLayout(4,1));

    }
    

    private class DoneHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            String result = "";
            String inputValue = JOptionPane.showInputDialog("Job No ?");
            int jNo = Integer.parseInt(inputValue);
            String hrsValue = JOptionPane.showInputDialog("Hours ?: ");
            int hrs = Integer.parseInt(hrsValue);
            if(mmm.setJobDone(jNo,hrs)== -1)
            {
                result = "No such job";
            }
            else
            {
                result = "Job Done.Cost of job is :£" + 
                            (mmm.getJobCost(jNo));
            }
           
            JOptionPane.showMessageDialog(myFrame,result);    
        }
    }
    

    private class QuitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            int answer = JOptionPane.showConfirmDialog(myFrame,
                "Are you sure you want to quit?","Finish",
                JOptionPane.YES_NO_OPTION);
            // closes the application
            if (answer == JOptionPane.YES_OPTION)
            {
                System.exit(0); //closes the application
            }              
        }
    }
}
   
