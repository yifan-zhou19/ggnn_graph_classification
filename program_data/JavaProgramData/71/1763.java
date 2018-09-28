package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int d;
		int totalb = 0;
		int totalc = 0;
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
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < b[i];j++)
			{
				if ((j == 1) || (j == 3) || (j == 5) || (j == 7) || (j == 8) || (j == 10) || (j == 12))
				{
					totalb += 31;
				}
				else if ((j == 4) || (j == 6) || (j == 9) || (j == 11))
				{
					totalb += 30;
				}
				else
				{
					if (((a[i] % 4 == 0) && (a[i] % 100 != 0)) || (a[i] % 400 == 0))
					{
						totalb += 29;
					}
					else
					{
						totalb += 28;
					}
				}
			}
			for (j = 1;j < c[i];j++)
			{
				if ((j == 1) || (j == 3) || (j == 5) || (j == 7) || (j == 8) || (j == 10) || (j == 12))
				{
					totalc += 31;
				}
				else if ((j == 4) || (j == 6) || (j == 9) || (j == 11))
				{
					totalc += 30;
				}
				else
				{
					if (((a[i] % 4 == 0) && (a[i] % 100 != 0)) || (a[i] % 400 == 0))
					{
						totalc += 29;
					}
					else
					{
						totalc += 28;
					}
				}
			}
			d = Math.abs(totalb - totalc);
			if (d % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			totalb = totalc = 0;
		}
	}



}

