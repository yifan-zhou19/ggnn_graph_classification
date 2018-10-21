public class student
{
	public String id = new String(new char[100]);
	public String name = new String(new char[100]);
	public char sex;
	public int age;
	public String score = new String(new char[100]);
	public String addr = new String(new char[100]);
	public student pre;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p2;
		student head1;
		student head2;

		int n = 0;
		String temp = new String(new char[100]);
		head1 = null;
		p1 = p2 = null;
		while (scanf("%s",temp),strcmp(temp,"end") != 0)
		{
			n = n + 1;
			p1 = new student();
			p1.pre = null;
			p1.next = null;

			p1.id = temp;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.name = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar2 != null)
			{
				p1.sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.age = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.score = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.addr = tempVar5.charAt(0);
			}
			if (n == 1)
			{
				head1 = p1;
			}
			else
			{
				p2.next = p1;
				p1.pre = p2;
			}
			p2 = p1;
		}

		head2 = p2;
		while (p2 != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p2.id,p2.name,p2.sex,p2.age,p2.score,p2.addr);
			p2 = p2.pre;
		}
	}
}

