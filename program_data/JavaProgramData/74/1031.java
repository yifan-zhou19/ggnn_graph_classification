package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k = 0;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int[] p = new int[1000];
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
		for (a = m;a <= n;a++)
		{
			i = 2;
			do
			{
				b = a % i;
				i++;
			} while (b != 0 && i < a);
			if (i == a)
			{
				b = 0;
				d = a;
				do
				{
					c = d % 10;
					b = b * 10 + c;
					d = d / 10;
				} while (d != 0);
				if (a == b)
				{
					k = k + 1;
					p[k] = a;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
		for (i = 1;i <= k - 1;i++)
		{
			System.out.printf("%d,",p[i]);
		}
		System.out.printf("%d",p[k]);
		}
	}






}

