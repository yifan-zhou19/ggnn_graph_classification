public class stu
{
	public String n = new String(new char[30]);
	public int a;
	public int b;
	public char c;
	public char d;
	public int e;
	public int sum;
	public stu next;
}
	i = 0;
	i = 0;
	i = 0;
	i = 0;

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int max = 0;
		int sum;
		stu head;
		stu p1;
		stu p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = p2 = (stu)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.a = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.b = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.c = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.d = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.e = Integer.parseInt(tempVar7);
		}
		p1.sum = 0;
		for (i = 0;i < n - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.n = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.a = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.b = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.c = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar12 != null)
			{
				p1.d = tempVar12.charAt(0);
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				p1.e = Integer.parseInt(tempVar13);
			}
			p1.sum = 0;
			p2.next = p1;
			p2 = p1;
		}
		p1.next = null;
		p1 = p2 = head;
		for (i = 0;i < n;i++,p1 = p1.next)
		{
			if (p1.a > 80 && p1.e > 0)
			{
				p1.sum += 8000;
			}
			if (p1.a > 85 && p1.b > 80)
			{
				p1.sum += 4000;
			}
			if (p1.a > 90)
			{
				p1.sum += 2000;
			}
			if (p1.a > 85 && p1.d == 'Y')
			{
				p1.sum += 1000;
			}
			if (p1.b > 80 && p1.c == 'Y')
			{
				p1.sum += 850;
			}
		}
		p1 = head;
		for (i = 0;i < n;i++,p1 = p1.next)
		{
			if (max < p1.sum)
			{
				max = p1.sum;
			}
		}
		p1 = head;
		sum = 0;
		for (i = 0;i < n;i++,p1 = p1.next)
		{
			sum += p1.sum;
		}
		p1 = head;
		for (i = 0;i < n;i++,p1 = p1.next)
		{
			if (p1.sum == max)
			{
				System.out.printf("%s\n%d\n",p1.n,p1.sum);
				break;
			}
		}
			System.out.printf("%d",sum);
	}
}

