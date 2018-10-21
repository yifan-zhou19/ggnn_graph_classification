public class student
{
	public String id = new String(new char[50]);
	public String s = new String(new char[50]);
	public char sex;
	public int age;
	public String score = new String(new char[10]);
	public String add = new String(new char[20]);
	public student po;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p;
		student q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			q.s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			q.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			q.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			q.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			q.add = tempVar6.charAt(0);
		}
		q.po = null;
		p = q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (student)malloc(LEN);
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			q.id = tempVar7.charAt(0);
		}
		while (strcmp(q.id,"end") != 0)
		{
		 String tempVar8 = ConsoleInput.scanfRead();
		 if (tempVar8 != null)
		 {
			 q.s = tempVar8.charAt(0);
		 }
		 String tempVar9 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar9 != null)
		 {
			 q.sex = tempVar9.charAt(0);
		 }
		 String tempVar10 = ConsoleInput.scanfRead(" ");
		 if (tempVar10 != null)
		 {
			 q.age = Integer.parseInt(tempVar10);
		 }
		 String tempVar11 = ConsoleInput.scanfRead(" ");
		 if (tempVar11 != null)
		 {
			 q.score = tempVar11.charAt(0);
		 }
		 String tempVar12 = ConsoleInput.scanfRead(" ");
		 if (tempVar12 != null)
		 {
			 q.add = tempVar12.charAt(0);
		 }
		 q.po = p;
		 p = q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 q = (student)malloc(LEN);
		 String tempVar13 = ConsoleInput.scanfRead();
		 if (tempVar13 != null)
		 {
			 q.id = tempVar13.charAt(0);
		 }
		}
		System.out.printf("%s %s %c %d %s %s\n",p.id,p.s,p.sex,p.age,p.score,p.add);
		while (p.po != null)
		{
		  p = p.po;
		  System.out.printf("%s %s %c %d %s %s\n",p.id,p.s,p.sex,p.age,p.score,p.add);
		}
		return 0;
	}
}

