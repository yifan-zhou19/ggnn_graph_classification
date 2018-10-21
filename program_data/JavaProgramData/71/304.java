package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int k;
		int l;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			l = 0;
			k = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
			if (a[i] % 4 == 0)
			{
				k = 1;
			}
			if (a[i] % 400 != 0 && a[i] % 100 == 0)
			{
				k = 0;
			}
			if (c[i] < b[i])
			{
				z = b[i];
				b[i] = c[i];
				c[i] = z;
			}
			for (j = b[i];j < c[i];j++)
			{
				if (j == 1)
				{
					l = l + 31;
				}
				if (j == 2)
				{
					l = l + 28 + k;
				}
				if (j == 3)
				{
					l = l + 31;
				}
				if (j == 4)
				{
					l = l + 30;
				}
				if (j == 5)
				{
					l = l + 31;
				}
				if (j == 6)
				{
					l = l + 30;
				}
				if (j == 7)
				{
					l = l + 31;
				}
				if (j == 8)
				{
					l = l + 31;
				}
				if (j == 9)
				{
					l = l + 30;
				}
				if (j == 10)
				{
					l = l + 31;
				}
				if (j == 11)
				{
					l = l + 30;
				}
			}
			if (l % 7 == 0)
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

