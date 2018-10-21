public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float score;
	public String address = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int num = 0;
		head = null;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (strcmp(p1.num,"end") == 0)
			{
				p2.next = null;
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
					p1.score = Float.parseFloat(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					p1.address = tempVar6.charAt(0);
				}
				if (num == 0)
				{
					head = p1;
				}
				else
				{
					p2.next = p1;
				}
				p2 = p1;
				num++;
			}
		}
		n = num;
		return (head);
	}
	public static void print(student pt)
	{
		student p;
		student pre;
		int i;
		for (i = 1;i <= n;i++)
		{
			for (p = pre = pt;p.next != null;p = p.next)
			{
				pre = p;
			}
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
			if (p != pt)
			{
				pre.next = null;
				p = null;
			}
		}
	}
	public static int Main()
	{
		student pt;
		pt = creat();
		print(pt);
		return 0;
	}
}

