package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		int t;
		int rev;
		int s;
		int f = 0;
		int g = 0;
		int su;
		int hui;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			su = 1;
			hui = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					su = 0;
					break;
				}
			}
			t = 1;
			while (t < i)
			{
				t = t * 10;
			}
			t = t / 10;
			p = i;
			s = 1;
			rev = 0;
			while (t != 1)
			{
				rev = rev + (p / t) * s;
				p = p % t;
				t = t / 10;
				s = s * 10;
			}
			rev = rev + p * s;
			if (rev == i)
			{
				hui = 1;
			}
			if (su == 1 && hui == 1)
			{
				if (f == 0)
				{
					System.out.printf("%d",i);
					f = 1;
					g = 1;
				}
				else
				{
				System.out.printf(",%d",i);
				}
			}
		}
		if (g == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}
}

