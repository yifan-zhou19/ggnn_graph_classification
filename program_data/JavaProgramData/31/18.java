public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String adress = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student input()
	{
		student p;
		student q;
		student head;
		int n = 0;
		p = q = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p.adress = tempVar6.charAt(0);
		}
		head = null_Renamed;
		while (strcmp(p.num,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p;
			}
			else
			{
				q.next = p;
			}
			q = p;
			p = new student();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.num = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p.sex = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p.score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p.adress = tempVar12.charAt(0);
			}
		}
		q.next = null_Renamed;
		return (head);
	}
	public static void output(student head)
	{
		student p;
		p = head;
		if (head != null_Renamed)
		{
			do
			{
				System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.adress);
				p = p.next;
			} while (p != null_Renamed);
		}
	}
	public static student exchange(student head)
	{
		student p;
		student q;
		student n;
		student nhead = null_Renamed;
		do
		{
			q = null_Renamed;
			p = head;
			while (p.next != null_Renamed)
			{
				q = p;
				p = p.next;
			}
			if (nhead == null_Renamed)
			{
				nhead = p;
				n = nhead.next = q;
			}
			n = n.next = q;
			q.next = null_Renamed;
		}while (head.next != null_Renamed);
		return (nhead);
	}
	public static int Main()
	{
		student input = new student();
		student exchange = new student(struct student *);
		void output(struct student *);
		student a;
		student b;
		a = input(); //??input???????a
		b = exchange(a);
		output(b);
		return 0;
	}
}

