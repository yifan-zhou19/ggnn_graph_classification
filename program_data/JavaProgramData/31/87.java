public class student
{
	public String xuehao = new String(new char[50]);
	public String name = new String(new char[50]);
	public char gender;
	public int age;
	public float score;
	public String add = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static char[] a = {'e', 'n', 'd'};
	public static int m;
	public static student head;
	public static student creat()
	{
		student p1;
		student p2;
		m = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.xuehao = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.gender = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.score = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.add = tempVar6.charAt(0);
		}
		head = null;
		while (strcmp(p1.xuehao,a) != 0)
		{
			m = m + 1;
			if (m == 1)
			{
				p2.next = null;
			}
			else
			{
				p1.next = p2;
			}
			p2 = p1;
			head = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.xuehao = tempVar7.charAt(0);
			}
			if (strcmp(p1.xuehao,a) != 0)
			{
				String tempVar8 = ConsoleInput.scanfRead(" ");
				if (tempVar8 != null)
				{
					p1.name = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar9 != null)
				{
					p1.gender = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p1.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ");
				if (tempVar11 != null)
				{
					p1.score = Float.parseFloat(tempVar11);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p1.add = tempVar12.charAt(0);
				}
			}
		}
			if (strcmp(p1.xuehao,a) == 0)
			{
				p1.next = head;
			}
			return (head);
	}
	public static void Main()
	{
			creat();
			student p1;
			 for (p1 = head;p1 != null;p1 = p1.next)
			 {
				System.out.printf("%s %s %c %d %g %s\n",p1.xuehao,p1.name,p1.gender,p1.age,p1.score,p1.add);
			 }

	}





}

