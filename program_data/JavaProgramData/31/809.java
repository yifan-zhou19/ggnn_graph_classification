public class student
{
	   public String num = new String(new char[20]);
	   public String name = new String(new char[20]);
	   public char sex;
	   public int age;
	   public double score;
	   public String address = new String(new char[20]);
	   public student next;
	   public student former;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  student p;
		  student p1;
		  student p2;
		  student header;
			header = new student();
			header.next = header.former = null;
			p2 = header;
		   for (;;)
		   {
			   p1 = new student();
			   p2.next = p1;
			   p1.former = p2;
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   p1.num = tempVar.charAt(0);
			   }
			   if (p1.num.charAt(0) == 'e' && p1.num.charAt(1) == 'n' && p1.num.charAt(2) == 'd')
			   {
				   break;
			   }
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   p1.name = tempVar2.charAt(0);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			   if (tempVar3 != null)
			   {
				   p1.sex = tempVar3.charAt(0);
			   }
			   String tempVar4 = ConsoleInput.scanfRead(" ");
			   if (tempVar4 != null)
			   {
				   p1.age = Integer.parseInt(tempVar4);
			   }
			   String tempVar5 = ConsoleInput.scanfRead(" ");
			   if (tempVar5 != null)
			   {
				   p1.score = Double.parseDouble(tempVar5);
			   }
			   String tempVar6 = ConsoleInput.scanfRead(" ");
			   if (tempVar6 != null)
			   {
				   p1.address = tempVar6.charAt(0);
			   }
			   p2 = p1;
		   }
			p2.next = null;
			//free(p1);
				   p = p2;
				   for (;p2.former != null;)
				   {
					 if (p2.score == (int)(p2.score))
					 {

					 System.out.printf("%s %s %c %d %d %s\n",p2.num,p2.name,p2.sex,p2.age,(int)(p2.score),p2.address);
					 }

					 else
					 {
						 System.out.printf("%s %s %c %d %.1lf %s\n",p2.num,p2.name,p2.sex,p2.age,p2.score,p2.address);
					 }
					 p2 = p2.former;
				   }
		 // p1=p;
		//  for(;p1->former!=NULL;)
		// {
		  // p2=p1;
		  // p1=p2->former;
		  // free(p2);
		 //  }
		  // free(p1);      

	}

}

