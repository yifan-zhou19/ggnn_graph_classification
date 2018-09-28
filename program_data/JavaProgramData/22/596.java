package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char a;
		int[] x = new int[300];
		int i;
		int m;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 1;a == ',';i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				a = tempVar4.charAt(0);
			}
		}
		i = i - 1;
		if (i >= 1)
		{
			for (n = 0;n <= i;n++)
			{
				for (m = n;m <= i;m++)
				{
					if (x[n] < x[m])
					{
						k = x[m];
						x[m] = x[n];
						x[n] = k;
					}
				}
			}
			for (m = 0;m <= i;m++)
			{
				if (x[m] != x[m + 1])
				{
					break;
				}
			}
				if (m < i)
				{
					System.out.printf("%d",x[m + 1]);
				}
				else
				{
					System.out.print("No");
				}
		}
		else
		{
			System.out.print("No");
		}
	}

}

