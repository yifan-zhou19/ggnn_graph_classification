public class stu
{
	public String num = new String(new char[20]);
 public String name = new String(new char[20]);
 public char sex;
 public int age;
 public String score = new String(new char[10]);
 public String add = new String(new char[20]);
 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu p1;
		stu p2;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		if (strcmp(p1.num,"end") == 0)
		{
			n = -1;
			p2 = null;
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
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
		}
		while (n >= 0)
		{
			n += 1;
		 if (n == 1)
		 {
			 p1.next = null;
		 }
		 else
		 {
			 p1.next = p2;
		 }
		 p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = (stu)malloc(LEN);
		 String tempVar7 = ConsoleInput.scanfRead();
		 if (tempVar7 != null)
		 {
			 p1.num = tempVar7.charAt(0);
		 }
		 if (strcmp(p1.num,"end") == 0)
		 {
			 break;
		 }
		 String tempVar8 = ConsoleInput.scanfRead();
		 if (tempVar8 != null)
		 {
			 p1.name = tempVar8.charAt(0);
		 }
		 String tempVar9 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar9 != null)
		 {
			 p1.sex = tempVar9.charAt(0);
		 }
		 String tempVar10 = ConsoleInput.scanfRead(" ");
		 if (tempVar10 != null)
		 {
			 p1.age = Integer.parseInt(tempVar10);
		 }
		 String tempVar11 = ConsoleInput.scanfRead(" ");
		 if (tempVar11 != null)
		 {
			 p1.score = tempVar11.charAt(0);
		 }
		 String tempVar12 = ConsoleInput.scanfRead(" ");
		 if (tempVar12 != null)
		 {
			 p1.add = tempVar12.charAt(0);
		 }
		}
		while (p2 != null)
		{
			printf(A,p2.num,p2.name,p2.sex,p2.age,p2.score,p2.add);
		p2 = p2.next;
		}
	}


}

