public class student
{
	public String name = new String(new char[20]);
	public int score1;
	public int score2;
	public char mon;
	public char west;
	public int paper;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		student p1;
		student p2;
		student head;
		int many;
		int n1;
		n1 = n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		head = null;
		many = 0;
		while (many < n1)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.name = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.score1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.score2 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar4 != null)
			{
				p1.mon = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p1.west = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.paper = Integer.parseInt(tempVar6);
			}
			many++;
			if (many == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
		}
		p2.next = null;
		return (head);
	}

	public static void print(student head)
	{
		student p;
		student pmax;
		p = head;
		int total = 0;
		int max = 0;
		if (head != null)
		{
			do
			{
				p.sum = 0;
				if (p.score1 > 80 && p.paper >= 1)
				{
					p.sum = p.sum + 8000;
				}
				if (p.score1 > 85 && p.score2 > 80)
				{
					p.sum = p.sum + 4000;
				}
				if (p.score1 > 90)
				{
					p.sum = p.sum + 2000;
				}
				if (p.score1 > 85 && p.west == 'Y')
				{
					p.sum = p.sum + 1000;
				}
				if (p.score2 > 80 && p.mon == 'Y')
				{
					p.sum = p.sum + 850;
				}
				total = total + p.sum;
				p = p.next;
			}while (p != null);
		}
			p = head;
			do
			{
				if (p.sum > max)
				{
					max = p.sum;
					pmax = p;
				}
				p = p.next;
			}while (p != null);
			System.out.printf("%s\n%d\n%d\n",pmax.name,max,total);
	}

	public static void Main()
	{
		int n;
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		print(head);
	}





}

