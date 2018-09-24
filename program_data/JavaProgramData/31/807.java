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
			p1 = null;
				   p = p2;
				   for (;p.former != null;)
				   {
					 if (p.score == (int)(p.score))
					 {

					 System.out.printf("%s %s %c %d %d %s\n",p.num,p.name,p.sex,p.age,(int)(p.score),p.address);
					 }

					 else
					 {
						 System.out.printf("%s %s %c %d %.1lf %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
					 }
					 p = p.former;
				   }
		  p1 = p2;
		  for (;p1.former != null;)
		  {
		   p2 = p1;
		   p1 = p2.former;
		   p2 = null;
		  }
		   p1 = null;

	}

}

