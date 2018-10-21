package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 0;
		int j;
		int n = 0;
		int max2 = 0;
		int t;
		char c;
		while (i < 300)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			i++;
			n++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ',')
			{
				break;
			}
		}
		if (n == 1)
		{
					System.out.print("No\n");
		}
		else
		{
			for (i = 1;i < n;i++)
			{
						for (j = 0;j < n - i;j++)
						{
									if (a[j] < a[j + 1])
									{
											t = a[j + 1];
											a[j + 1] = a[j];
											a[j] = t;
									}
						}
			}

			if (a[n - 1] == a[0])
			{
				System.out.print("No\n");
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					if (a[i] < a[0])
					{
						max2 = a[i];
						break;
					}
				}
				System.out.printf("%d\n",max2);
			}
		}
		return 0;
	}
}

