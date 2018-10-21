public class student
{
	public String s = new String(new char[10]);
	public String name = new String(new char[30]);
	public char sex;
	public String age = new String(new char[3]);
	public String score = new String(new char[6]);
	public String place = new String(new char[15]);
	public student next;
	public student last;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head1;
		student head2;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(100);
		head1 = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.s = tempVar.charAt(0);
		}
		do
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
				p1.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.place = tempVar6.charAt(0);
			}
			n = n + 1;
			if (n == 1)
			{
				head1 = p1;
				p1.last = null;
			}
			else
			{
				p2.next = p1;
				p1.last = p2;
			p2 = p1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(100);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.s = tempVar7.charAt(0);
			}
		}while (p1.s.charAt(0) != 'e');
		head2 = p2;
		p2.next = null;
		return (head2);
	}
	public static void Main()
	{
		student p1;
		p1 = creat();
		do
		{
			System.out.printf("%s %s %c %s %s %s\n",p1.s,p1.name,p1.sex,p1.age,p1.score,p1.place);
			p1 = p1.last;
		}while (p1 != null);
	}
}

