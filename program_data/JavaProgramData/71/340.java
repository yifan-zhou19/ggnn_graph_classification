package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[3];
		int i;
		int[] c = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int b;
		int p;
		int q;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[2] = Integer.parseInt(tempVar4);
			}
			if ((a[0] % 4 == 0 && a[0] % 100 != 0) || a[0] % 400 == 0)
			{
				c[1] = 29;
			}
			else
			{
				c[1] = 28;
			}
			if (a[1] > a[2])
			{
				p = a[1];
				q = a[2];
				for (j = q - 1,b = 0;j < p - 1;j++)
				{
					b = b + c[j];
				}
			}
			else
			{
				p = a[2];
				q = a[1];
				for (j = q - 1,b = 0;j < p - 1;j++)
				{
					b = b + c[j];
				}
			}
			if (b % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

