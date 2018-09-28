public class student
{
 public String num = new String(new char[10]);
 public String name = new String(new char[20]);
 public String sex = new String(new char[2]);
 public int age;
 public float score;
 public String address = new String(new char[40]);
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   student p;
	   student p1;
	   student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p1 = (student)malloc(len);
	   p1.next = null;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   p1.num = tempVar.charAt(0);
	   }
		   while (p1.num.charAt(0) != 'e')
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   p1.name = tempVar2.charAt(0);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   p1.sex = tempVar3.charAt(0);
			   }
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   p1.age = Integer.parseInt(tempVar4);
			   }
			   String tempVar5 = ConsoleInput.scanfRead();
			   if (tempVar5 != null)
			   {
				   p1.score = Float.parseFloat(tempVar5);
			   }
			   String tempVar6 = ConsoleInput.scanfRead();
			   if (tempVar6 != null)
			   {
				   p1.address = tempVar6.charAt(0);
			   }
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			p1.next = p2;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		   }
		   if (p2.next != null)
		   {
	   for (p = p2;p.next != null;p = p.next)
	   {
		   System.out.printf("%s %s %s %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
	   }
		   System.out.printf("%s %s %s %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
		   }
		   if (p2.next = null)
		   {

	   System.out.printf("%s %s %s %d %g %s\n",p2.num,p2.name,p2.sex,p2.age,p2.score,p2.address);
		   }
	}
}

