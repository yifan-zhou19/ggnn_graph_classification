public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String mark = new String(new char[20]);
	public String add = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student creat = new student();
		student p;
		int m = 0;
		p = creat();
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.mark,p.add);
			p = p.next;
		};
	}
	public static int n;
	public static student creat()
	{
		int k;
		n = 0;
		student head;
		student p1;
		student p2;
		p2 = p1 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.mark = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.add = tempVar6.charAt(0);
		}
		while (p2 != null)
		{
			n = n + 1;
			if (n == 1)
			{
				p2.next = null;
			}
			else
			{
				p1.next = p2;
			}
			p2 = p1;
			p1 = new student();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			k = strcmp(p1.num,"end");
			if (k == 0)
			{
				break;
			}
			else if (k != 0)
			{
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
				String tempVar10 = ConsoleInput.scanfRead();
				if (tempVar10 != null)
				{
					p1.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead();
				if (tempVar11 != null)
				{
					p1.mark = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead();
				if (tempVar12 != null)
				{
					p1.add = tempVar12.charAt(0);
				}
			}
		}
		return (p2);
	}

}

