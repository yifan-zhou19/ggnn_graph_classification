package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int win = 0;
		int lose = 0;
		int[] a = new int[200];
		int[] b = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
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
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == b[i])
			{
				;
			}
			else
			{
				if (a[i] == 0)
				{
					if (b[i] == 1)
					{
						win++;
					}
					else
					{
						lose++;
					}
				}
				if (a[i] == 1)
				{
					if (b[i] == 0)
					{
						lose++;
					}
					else
					{
						win++;
					}
				}
				if (a[i] == 2)
				{
					if (b[i] == 0)
					{
						win++;
					}
					else
					{
						lose++;
					}
				}
			}
		}
		if (win == lose)
		{
			System.out.print("Tie\n");
		}
		if (win > lose)
		{
			System.out.print("A\n");
		}
		if (win < lose)
		{
			System.out.print("B\n");
		}
	}
}

