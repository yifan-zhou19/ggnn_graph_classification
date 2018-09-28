public class stu
{
	public String num = new String(new char[15]);
	public String name = new String(new char[20]);
	public char sex;
	public int year;
	public String score = new String(new char[20]);
	public String adr = new String(new char[15]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu p;
	public static stu q;
	public static stu head;
	public static stu newhead;
	public static stu ne;

	public static stu creat()
	{
		String a = new String(new char[15]);
		head = null_Renamed;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		while (a.length() != 3)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (stu)malloc(l);
			p.num = a;
			String tempVar2 = ConsoleInput.scanfRead();
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
				p.year = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.adr = tempVar6.charAt(0);
			}
			if (head == null_Renamed)
			{
				q = head = p;
			}
			else
			{
				q = q.next = p;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a = tempVar7.charAt(0);
			}
		}
		q.next = null_Renamed;
		return (head);
	}

	public static stu change(stu head)
	{
		newhead = null_Renamed;
		do
		{
			q = null_Renamed;
			p = head;
			while (p.next != null_Renamed)
			{
				q = p;
				p = p.next;
			}
			if (newhead == null_Renamed)
			{
				newhead = p,ne = newhead.next = q;
			}
			ne = ne.next = q;
			q.next = null_Renamed;
		}while (head.next != null_Renamed);
		return (newhead);
	}

	public static void output(stu newhead)
	{
		p = newhead;
		while (p != null_Renamed)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.year,p.score,p.adr);
			p = p.next;
		}
	}
	public static int Main()
	{
		head = creat();
		newhead = change(head);
		output(newhead);
	}












}

