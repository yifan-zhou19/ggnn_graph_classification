package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int Main()
	{
		int i;
		int[] a = new int[20];
		int[] b = new int[20];
		int[] c = new int[20];
		int x;
		int day;
		for (i = 1;i <= 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= 5;i++)
		{
			if (a[i] % 4 == 0 && a[i] % 100 != 0 || a[i] % 400 == 0)
			{
				if (b[i] == 1)
				{
					day = c[i];
				}
				else if (b[i] == 2)
				{
					day = c[i] + 31;
				}
				else if (b[i] == 3)
				{
					day = c[i] + 31 + 29;
				}
				else if (b[i] == 4)
				{
					day = c[i] + 31 + 29 + 31;
				}
				else if (b[i] == 5)
				{
					day = c[i] + 31 + 29 + 31 + 30;
				}
				else if (b[i] == 6)
				{
					day = c[i] + 31 + 29 + 31 + 30 + 31;
				}
				else if (b[i] == 7)
				{
					day = c[i] + 31 + 29 + 31 + 30 + 31 + 30;
				}
				else if (b[i] == 8)
				{
					day = c[i] + 31 + 29 + 31 + 30 + 31 + 30 + 31;
				}
				else if (b[i] == 9)
				{
					day = c[i] + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				}
				else if (b[i] == 10)
				{
					day = c[i] + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				}
				else if (b[i] == 11)
				{
					day = c[i] + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				}
				else if (b[i] == 12)
				{
					day = c[i] + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				}
			}
			else
			{
				if (b[i] == 1)
				{
					day = c[i];
				}
				else if (b[i] == 2)
				{
					day = c[i] + 31;
				}
				else if (b[i] == 3)
				{
					day = c[i] + 31 + 28;
				}
				else if (b[i] == 4)
				{
					day = c[i] + 31 + 28 + 31;
				}
				else if (b[i] == 5)
				{
					day = c[i] + 31 + 28 + 31 + 30;
				}
				else if (b[i] == 6)
				{
					day = c[i] + 31 + 28 + 31 + 30 + 31;
				}
				else if (b[i] == 7)
				{
					day = c[i] + 31 + 28 + 31 + 30 + 31 + 30;
				}
				else if (b[i] == 8)
				{
					day = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31;
				}
				else if (b[i] == 9)
				{
					day = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				}
				else if (b[i] == 10)
				{
					day = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				}
				else if (b[i] == 11)
				{
					day = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				}
				else if (b[i] == 12)
				{
					day = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				}
			}
			System.out.printf("%d\n",day);
		}



	}
}

