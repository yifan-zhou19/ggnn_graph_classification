package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int h = 0;
		int[] y = new int[200];
		int[] n1 = new int[200];
		int[] n2 = new int[200];
		int[] m1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] m2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				n2[i] = Integer.parseInt(tempVar4);
			}
			if (((y[i] % 4 == 0) && (y[i] % 100 != 0)) || y[i] % 400 == 0)
			{
				h = 0;
				if (n1[i] < n2[i])
				{
					for (j = n1[i];j < n2[i];j++)
					{
						h += m2[j];
					}
					if (h % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else if (h % 7 != 0)
					{
						System.out.print("NO\n");
					}
				}
				else if (n1[i] > n2[i])
				{
					for (j = n2[i];j < n1[i];j++)
					{
						h += m2[j];
					}
					if (h % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else if (h % 7 != 0)
					{
						System.out.print("NO\n");
					}
				}
			}
			else
			{
				h = 0;
				if (n1[i] < n2[i])
				{
					for (j = n1[i];j < n2[i];j++)
					{
						h += m1[j];
					}
					if (h % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else if (h % 7 != 0)
					{
						System.out.print("NO\n");
					}
				}
				else if (n1[i] > n2[i])
				{
					for (j = n2[i];j < n1[i];j++)
					{
						h += m1[j];
					}
					if (h % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else if (h % 7 != 0)
					{
						System.out.print("NO\n");
					}
				}
			}
		}
		return 0;
	}
}

