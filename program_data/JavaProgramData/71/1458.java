package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int m;
		int sum = 0;
		int[] an = new int[200];
		int[] bn = new int[200];
		int[] cn = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;k < n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				an[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bn[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				cn[i] = Integer.parseInt(tempVar4);
			}
			k++;
			if (bn[i] > cn[i])
			{
				m = bn[i];
				bn[i] = cn[i];
				cn[i] = m;
			}
			for (j = bn[i];j < cn[i];j++)
			{
				if (j == 2)
				{
					if ((an[i] % 400 == 0 || (an[i] % 4 == 0 && an[i] % 100 != 0)))
					{
						sum += 29;
					}
					else
					{
						sum += 28;
					}
				}
				else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
					sum += 31;
				}
				else if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					sum += 30;
				}
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else if (sum % 7 != 0)
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}

}

