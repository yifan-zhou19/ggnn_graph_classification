package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int p = 0;
		int[] a = new int[200];
		int[] b = new int[200];
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
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != b[i])
			{
				if (a[i] + b[i] == 1)
				{
					if (a[i] > b[i])
					{
						p++;
					}
					else
					{
						m++;
					}
				}
				else if (a[i] + b[i] == 3)
				{
					if (a[i] > b[i])
					{
						p++;
					}
					else
					{
						m++;
					}
				}
				else if (a[i] + b[i] == 2)
				{
					if (a[i] > b[i])
					{
						m++;
					}
					else
					{
						p++;
					}
				}
			}
		}
			if (m > p)
			{
				System.out.print("A");
			}
			else if (m < p)
			{
				System.out.print("B");
			}
			else if (m == p)
			{
				System.out.print("Tie");
			}
			return 0;
	}

}

