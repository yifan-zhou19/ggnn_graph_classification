package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] x = new int[MAX];
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int c;
		int i;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (x[i] % 4 == 0 && x[i] % 100 != 0 || x[i] % 400 == 0)
			{
				if (a[i] > b[i])
				{
					c = a[i];
					a[i] = b[i];
					b[i] = c;
				}
				if ((a[i] == 1 && b[i] == 4) || (a[i] == 2 && b[i] == 8) || (a[i] == 1 && b[i] == 7) || (a[i] == 3 && b[i] == 11) || (a[i] == 4 && b[i] == 7) || (a[i] == 9 && b[i] == 12))
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				if (a[i] > b[i])
				{
					c = a[i];
					a[i] = b[i];
					b[i] = c;
				}
				if ((a[i] == 1 && b[i] == 10) || (a[i] == 2 && b[i] == 3) || (a[i] == 2 && b[i] == 11) || (a[i] == 3 && b[i] == 11) || (a[i] == 4 && b[i] == 7) || (a[i] == 9 && b[i] == 12))
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

}

