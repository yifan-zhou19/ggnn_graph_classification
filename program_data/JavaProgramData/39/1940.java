public class Student
{
	public String name = new String(new char[50]);
	public int cj;
	public int py;
	public int lw;
	public int sum;
	public char gb;
	public char xb;
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static Student p1;
	public static Student p2;
	public static Student head;
	public static Student p;
	public static Student ans;
	public static int Main()
	{
		int n;
		int i = 0;
		int sum = 0;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		head = null;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (Student)malloc(Len);
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.cj = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.py = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p1.gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p1.xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.lw = Integer.parseInt(tempVar7);
			}
			p1.sum = 0;
		}
		p1.next = null;

		p = head;
		do
		{
			if (p.cj > 80 && p.lw >= 1)
			{
				p.sum += 8000;
			}
			if (p.py > 80 && p.gb == 'Y')
			{
				p.sum += 850;
			}
			if (p.cj > 85 && p.py > 80)
			{
				p.sum += 4000;
			}
			if (p.cj > 85 && p.xb == 'Y')
			{
				p.sum += 1000;
			}
			if (p.cj > 90)
			{
				p.sum += 2000;
			}
			p = p.next;
		}while (p != null);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		ans = (Student)malloc(Len);
		ans.sum = 0;
		p = head;
		do
		{
			sum += p.sum;
			if (p.sum > ans.sum)
			{
				ans = p;
			}
			p = p.next;
		}while (p != null);

		System.out.printf("%s\n%d\n%d",ans.name,ans.sum,sum);
		return 0;
	}

}

