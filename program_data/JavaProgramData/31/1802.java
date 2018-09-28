public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char gd;
	public int age;
	public float sc;
	public String adr = new String(new char[10]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student append()
	{
		student head;
		student p1;
		student p2 = null;
		while (true)
		{
		 p1 = new student();
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 p1.num = tempVar.charAt(0);
		 }
		 if (p1.num.charAt(0) == 'e')
		 {
			head = p2;
			break;
		 }
		 else
		 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p1.name = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		   if (tempVar3 != null)
		   {
			   p1.gd = tempVar3.charAt(0);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   p1.age = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead();
		   if (tempVar5 != null)
		   {
			   p1.sc = Float.parseFloat(tempVar5);
		   }
		   String tempVar6 = ConsoleInput.scanfRead(" ");
		   if (tempVar6 != null)
		   {
			   p1.adr = tempVar6.charAt(0);
		   }
		   p1.next = p2;
		   p2 = p1;
		 }
		}
		return head;
	}


	public static void Main()
	{
		student p;
		p = append();
		for (;p != null;p = p.next)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.gd,p.age,p.sc,p.adr);
		}
	}


}

