package classroomcontroller;

public class linkedlist
{
	node head=null;
	
	void insertstudent(int rn , String na)
	{
		node n=new node();
		n.rno=rn;
		n.name=na;
		n.next=null;
		
		if(head==null)
		{
			head=n;
		}
		else
		{
			node ntrav=head;
			while(ntrav.next!=null)
			{
				ntrav=ntrav.next;
			}
			ntrav.next=n;
		}
	}
	
	void showstudent()
	{
        System.out.println("----------------------CLASSROOM-----------------------------");
        
		node nshow=head;
		while(nshow.next!=null)
		{
			System.out.println("roll no:"+nshow.rno+"   name:"+nshow.name);
			nshow=nshow.next;
			
		}
		
		System.out.println("roll no:"+nshow.rno+"   name:"+nshow.name);
		System.out.println("--------------------------------------------------------------");
	}

	void removestudent()
	{
		
		 /*if(head == null)
		 {  
			 System.out.println("CLASSROOM IS EMPTY !!!!!");
			 System.exit(1);
		 }*/
		 
		 try {
		 node nremo=head;
		 node ntemp;
		 while(nremo.next!=null)
		 {
			ntemp=nremo.next;
			if(ntemp.next==null)
			{
				 System.out.println("Removing student :");
				 System.out.println("roll no:"+ ntemp.rno + "   name:" + ntemp.name);
				 nremo.next=null;
				 return ;
			}
			else
				 {  
				    nremo=nremo.next;
				 }
		 }
		 System.out.println("Removing student :");
		 System.out.println("roll no:"+ nremo.rno + "   name:" + nremo.name);
		 
		 nremo=head=null;
		 
		 }catch(NullPointerException e)
		 {System.out.println();}
	}
	
    void highlight(String nh)
    {
    	//System.out.println(nh);
    	node nhigh=head;
    	while(nhigh.next!=null)
    	{
    		
    		if(nhigh.name.equals(nh))
    		{
    			
    			nhigh.name="<<<<" + nhigh.name +">>>>";
    		}
    		nhigh=nhigh.next;
    	}
    	   
    	if(nhigh.name.equals(nh))
		{
			nhigh.name="<<<<" + nhigh.name +">>>>";
		}
		
    }
    
    void unhighlight(String nuh)
    {
    	String temp=nuh;
    	temp="<<<<"+temp+">>>>";
    	node nuhigh=head;
    	while(nuhigh.next!=null)
    	{
    		
    		if(nuhigh.name.equals(temp))
    		{
    			
    			nuhigh.name= nuh;
    		}
    		nuhigh=nuhigh.next;
    	}
    	   
    	if(nuhigh.name.equals(temp))
		{
			nuhigh.name= nuh;
		}
    }
}
