package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int a;
		int b;
		int c;
		int x;
		int y = -1;
		int sum = 0;
		String N = new String(new char[21]);
		String A = new String(new char[21]);
		char d;
		char e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				N = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				d = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				e = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				c = Integer.parseInt(tempVar7);
			}
					  x = 0;
			if (a > 80 && c >= 1)
			{
				x = x + 8000;
			}
			if (a > 85 && b > 80)
			{
				x = x + 4000;
			}
			if (a > 90)
			{
				x = x + 2000;
			}
			if (a > 85 && e == 'Y')
			{
				x = x + 1000;
			}
			if (b > 80 && d == 'Y')
			{
				x = x + 850;
			}
				sum = sum + x;
			if (x > y)
			{
				y = x;
				A = N;
			}
			i++;
		} while (i <= n);
		System.out.printf("%s\n",A);
		System.out.printf("%d\n",y);
		System.out.printf("%d\n",sum);
		return 0;
	}
}

