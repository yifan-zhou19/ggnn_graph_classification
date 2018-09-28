package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int x;
		int y;
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		int total1 = 0;
		int hu = 0;
		int total2 = 0;
		String name = new String(new char[20]);
		String j = new String(new char[20]);
		char ch1;
		char ch2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= x;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				ch1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				ch2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				y = Integer.parseInt(tempVar7);
			}
			if (m > 80 && y >= 1)
			{
				a = 8000;
			}
			else
			{
				a = 0;
			}
			if (m > 85 && n > 80)
			{
				b = 4000;
			}
			else
			{
				b = 0;
			}
			if (m > 90)
			{
				c = 2000;
			}
			else
			{
				c = 0;
			}
			if (m > 85 && ch2 == 'Y')
			{
				d = 1000;
			}
			else
			{
				d = 0;
			}
			if (n > 80 && ch1 == 'Y')
			{
				e = 850;
			}
			else
			{
				e = 0;
			}
			total1 = a + b + c + d + e;
			if (total1 > hu)
			{
				hu = total1;
				j = name;
			}
			total2 += total1;
		}
		System.out.printf("%s\n%d\n%ld\n",j,hu,total2);
	}

}

