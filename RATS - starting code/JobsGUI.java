import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


/**
 * Provide a GUI interface for the job submission system.
 * Only shows a selection of possible functions: add job, list jobs 
 * waiting record job done.
 * 
 * @author 14114580 
 * @version 1.00
 */
public class JobsGUI 
{
    private static Manager mmm ;
    private JFrame myFrame = new JFrame("Jobs GUI");
    JFrame jobFrame = new JFrame("Job");
    JTextArea textArea = new JTextArea(60, 30);
    
    private Container contentPane = myFrame.getContentPane();
    
    private JButton quitButton = new JButton("Quit");
   
    
    private JPanel eastPanel = new JPanel();
    private JPanel westPanel = new JPanel(); 
    private JPanel centerPanel = new JPanel();
    private JPanel northPanel = new JPanel();
    private JPanel southPanel = new JPanel();
    
    
    
    private  static String cName;
    private  static Boolean onSiteBoo;
    private  static Boolean sHandBoo;
    private  static String langString;
    
    JTextArea custName = new JTextArea(2, 30);
    JCheckBox sHand = new JCheckBox("Shorthand", false);
    JCheckBox lang = new JCheckBox();
    JCheckBox onSite = new JCheckBox();
    
  
 
    
    public JobsGUI()
    {
        mmm = new Branch("Watford");
        addAllStaff();
        makeFrame();
        makeMenus(myFrame);
    }
    
     public Manager getMMM(){
        return mmm;
    }
    
    private void addAllStaff()
    {
        // add all branch staff
//         mmm.addStaff("CL1","Ann");
//         mmm.addStaff("CL2","Bob");
//         mmm.addStaff("TY1","Che", true, true);
//         mmm.addStaff("TY2","Dan", true, false);
//         mmm.addStaff("TY3","Eve", false, true);
//         mmm.addStaff("TY4","Fez", false, false);
//         mmm.addStaff("TR1","Gil", true, true,"French", 15.50);
//         mmm.addStaff("TR2","Han", true, false,"French", 16.50);
//         mmm.addStaff("TR3","Kit", false, true,"German", 17.50);
//         mmm.addStaff("TR4","Lil", false, false,"German", 18.50);

     //Adds 10 Staffs to the Branch, mmms Clerk, Typist and Translator Methods to add staff
        
        mmm.addStaff("CL1","Ann");
        mmm.addStaff("CL2","Bob");
        mmm.addStaff("TY1","Che", true, true);
        mmm.addStaff("TY2","Dan", true, false);
        mmm.addStaff("TY3","Eve", false, true);
        mmm.addStaff("TY4","Fez", false, false);
        mmm.addStaff("TR1","Gil", true, true,"French", 15.50);
        mmm.addStaff("TR2","Han", true, false,"French", 16.50);
        mmm.addStaff("TR3","Kit", false, true,"German", 17.50);
        mmm.addStaff("TR4","Lil", false, false,"German", 18.50);
        
            

        // Add 15 jobs, from 15 Customers
        mmm.addJob("CST1", true, true, "English");
        mmm.addJob("CST2", true, true, "English");
        mmm.addJob("CST3", true, true, "French");
        mmm.addJob("CST5", true, false, "English");
        mmm.addJob("CST4", true, true, "Spanish");
        mmm.addJob("CST7", true, true, "Portuguese");
        mmm.addJob("CST6", true, true, "English");
        mmm.addJob("CST8", true, true, "French");
        mmm.addJob("CST9", true, false, "English");
        mmm.addJob("CST10", true, true, "Mandarin");
        mmm.addJob("CST11", true, true, "English");
        mmm.addJob("CST12", true, true, "English");
        mmm.addJob("CST13", true, true, "French");
        mmm.addJob("CST14", true, false, "English");
        mmm.addJob("CST15", true, false, "English");
        
        //Sets email for one Typist
        mmm.setEmail("TY1", "dan.typist@watfordbranch.com");
        
        //Display Branch, Staff, Customer and Jobs.
        System.out.println(mmm.toString() );
        
        //5 jobs should be waiting as there are 10 Staff avaialble
        System.out.println("//5 jobs should be waiting as there are 10 Staff avaialble");
        System.out.println(mmm.getJobsWaiting() );
        System.out.println("*****************"+"\n" );
        
        
        
        // mmm if ID identifies Staff. CL1 should be true, XL1 should be false.
         System.out.println("// mmm if ID identifies Staff. CL1 should be true, XL1 should be false." );
         System.out.println("Is CL1 identified "+mmm.isStaff("CL1") );
         System.out.println("Is XL1 identified "+mmm.isStaff("XL1")+"\n"+"\n"  );
        
       
         
         //Remove Staff CL1,Staff CL1 should be deleted from the system 
         System.out.println("//Remove Staff CL1,Staff CL1 should be deleted from the system  " );
         System.out.println("//Staff CL1 should be deleted from the system "+"\n"  );
         mmm.removeStaff("CL1");
         System.out.println(mmm.getAllStaff() );
         
         //Set Job 100 ,106 and 108 as done in  4, 2 and 3 hours respectively 
         //Returns a value of 0 when done.
         System.out.println("//Set Job 100 and 106 as done in 30 hours respectively "+"\n" );
         System.out.println("Set Job 100 as done : Returns value :" + mmm.setJobDone(100,4));
         System.out.println("Set Job 100 as done : Returns value :" + mmm.setJobDone(106,2));
         System.out.println("Set Job 106 as done : Returns value :" + mmm.setJobDone(108,3));
         
         
         //Get the cost of  Job 100 and 106 as done in  40 and 30 hours respectively
         // (rate*hours)+fee+charge;
         //Fixed charge is £20 if it requres shorthand
         // Job 100 was carried out by Typist(rate =12)(Staff TY3 , rate =12) thre fore cost is £525
         // Job 106 was carried out by Translator  (Staff TR4, rate =18.50) thre fore cost is £415
         // Job 108 requires no shorthand and was carried out by Translator  (Staff TR3, rate =17.50) therefore cost is £550

         System.out.println("The Job Cost for 100 is £" + mmm.getJobCost(100) );
         System.out.println("The Job Cost for 106 is £"+mmm.getJobCost(106) );
         System.out.println("The Job Cost for 108 is £"+mmm.getJobCost(108) );
         
       // Get the cost of a job which is not completed (waiting) should return a value of 0.0 as it has not been completed.
       System.out.println("Th Cost for waiting Job 114 is £"+mmm.getJobCost(114) );
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
        toDoItem.addActionListener(new AddJobButton());
        fileMenu.add(toDoItem);
       
        
        JMenuItem doneItem = new JMenuItem("Job Done");
        doneItem.addActionListener(new DoneHandler());
        fileMenu.add(doneItem);
        
        JMenuItem waitItem = new JMenuItem("List Waiting");
        waitItem.addActionListener(new ListButtonHandler());
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
        
        final int frameWidth = 700;
        final int frameHeight = 400;
        
        contentPane.setLayout(new BorderLayout());
        
        contentPane.add(eastPanel, BorderLayout.EAST);
        contentPane.add(southPanel, BorderLayout.SOUTH);
        contentPane.add(westPanel, BorderLayout.WEST);
        contentPane.add(centerPanel, BorderLayout.CENTER);
        
        // set panel layout and add components
        centerPanel.add(textArea);
        textArea.setEditable(false);
        southPanel.add(quitButton);
        quitButton.setVisible(true);
        quitButton.addActionListener(new QuitButtonHandler());
        
        
     
        
        //name.setText("Name");
        
        //set up Layout column and rows
        eastPanel.setLayout(new GridLayout(4,1) );
        
        
        //set up "Add Job" button
        JButton addJob = new JButton("Add Job"); 
        eastPanel.add(addJob);
        
        addJob.addActionListener(new AddJobButton());
        addJob.setVisible(true);
        
        
        //set up "Clear List" button
        JButton clearList = new JButton("Clear List"); 
        eastPanel.add(clearList);
        clearList.addActionListener(new ClearListButtonHandler());
        clearList.setVisible(true);
        
        //set up  Text Area
        //JTextArea textArea = new JTextArea(5, 30);
       // centerPanel.add(textArea);
        
         // set up parameter labels and fields

        //jobs.put ((new JLabel("Name"), new JTextField()) ;
        
        
        myFrame.setSize(frameWidth,frameHeight);

        // building is done - arrange the components and show        
        //myFrame.pack();
        myFrame.setVisible(true);
    }
    
    /**
     * Builds the Panels on the frame.
     */
     private void makeTypes()
        {
            westPanel.setVisible(true);
            centerPanel.setVisible(false);
            northPanel.setVisible(false);
            contentPane.add(westPanel, BorderLayout.WEST);
            contentPane.add(centerPanel, BorderLayout.CENTER);
            contentPane.add(northPanel, BorderLayout.NORTH);
            
            // set panel layout and add components
            centerPanel.setLayout(new FlowLayout());
            northPanel.setLayout(new GridLayout(4,1));
    
        }
    
/**
 * Action Listener for the Job done button(menu)
 */
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
    
    
    /**
     * Clears the list after the Clear List button - Action Listener
     */
        private class ClearListButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
           textArea.setText("");   
        }
    }
    
    
    /**
     * Listens to the action from the Close Button
     */
        private class CloseButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
        	jobFrame.dispose();
        	eastPanel.removeAll();
        	westPanel.removeAll();
        	centerPanel.removeAll();
        	southPanel.removeAll();
        	//myFrame.removeAll();
        	makeFrame();
        }
    }
    
    
    /**
     * Clears the text Area 
     */
        private class ListButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 

		textArea.setText(mmm.getJobsWaiting());
		
        }
    }
    /**
     * Action Listener for the Quit Button.
     */
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
    
    /**
     * Controls the Add job buttons on frames
     */
    private class AddJobButton implements ActionListener {
    	
    	public void actionPerformed(ActionEvent a){ 
    		
    		//Job jb = new Job();

    		//JFrame jobFrame = new JFrame("Job");
    		Container contentPane = jobFrame.getContentPane();
    		//jobFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		
    		jobFrame.setSize(320, 400);
    		jobFrame.setVisible(true);
    		
      	        
	        contentPane.setLayout(new BorderLayout());
	      	contentPane.add(northPanel, BorderLayout.NORTH);
	      	contentPane.add(westPanel, BorderLayout.WEST);
	      	contentPane.add(southPanel, BorderLayout.SOUTH);
	      	contentPane.add(eastPanel, BorderLayout.EAST);
    		
    		  // northPanel.add(northPanel);
            JLabel name = new JLabel();
            northPanel.removeAll();
            westPanel.removeAll();
            name.setText("Enter Customer  Name");
            name.setVisible(true);
            northPanel.setLayout(new GridLayout(4,1) );
            northPanel.add(name);
            
            //JTextArea custName = new JTextArea(2, 30);
            custName.setVisible(true);
            northPanel.add(custName);
            
            //String cName = custName.getText();
            
            
            JLabel jobLabel = new JLabel();
            jobLabel.setText("Job Requirements");
            jobLabel.setVisible(true);
            westPanel.setLayout(new GridLayout(4,4) );
            westPanel.add(jobLabel);
            
            // Add check boxes for Job requirements
            
            onSite.setText("On Site");
            onSite.setVisible(true);
            westPanel.add(onSite);

            
            //sHand.setText("Shorthand");
            sHand.setVisible(true);
            westPanel.add(sHand);

            lang.setText("Translation");
            lang.setVisible(true);
            westPanel.add(lang);
            
        
          //set up "Add Job" button
            JButton addJobIn = new JButton("Add Job"); 
            eastPanel.removeAll();
            eastPanel.add(addJobIn);
            addJobIn.addActionListener(new JobHandler());
                       
            addJobIn.removeAll();
         
            addJobIn.setVisible(true);
            addJobIn.setEnabled(true);
            
            
          //set up "Add Job" button
            JButton closeButton = new JButton("Close"); 
            southPanel.removeAll();
            southPanel.add(closeButton);
            closeButton.addActionListener(new CloseButtonHandler());

         
        }
 	
    }
    /**
     * Job Listner for the Add job on pop up Frame 
     */
    private class JobHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
        	 if(sHand.isSelected()){
             	
   			   sHandBoo = true;
   			   
   		            }else {
   		            	sHandBoo = false;
   		            	
   		            }
   		            
        	 if(lang.isSelected()){
      		   	
    			  String inputValue = JOptionPane.showInputDialog("What Language ?");
    			  langString = inputValue;
    		   }else {
    			   
    			  langString = "English";
    			  
    		   	
    		   }
               
    		   if(onSite.isSelected()==true){
              	
              	onSiteBoo = true;
              }else {
              	onSiteBoo = false;
              	System.out.println(onSiteBoo);
              }
        	 
              //Makes sure the Customer Name Text Field is not empty before adding a job for customer.
        	String cName = custName.getText();
        	int no = cName.length();
        	
        	if(no==0){
        	    System.out.println("Empty Name");
        	    JOptionPane.showMessageDialog(myFrame, "Enter Customer Name");
        	   } else{
        	       String result = 	mmm.addJob(cName, onSiteBoo, sHandBoo, langString);
        	       JOptionPane.showMessageDialog(myFrame, result);
        	   }
        	
        	
        	
        	
        	
        	clearForm();
 
            
          
        }
    }
    
    /**
     * Clears Form fields and prepares frame.
     */
 public void clearForm(){
        
       custName.setText("");
       onSite.setSelected(false);
       sHand.setSelected(false);
       lang.setSelected(false);
       myFrame.getContentPane();

       
    }
    

}
   
