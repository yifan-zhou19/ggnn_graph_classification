package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int[] b = new int[16];
		int c = 0;
		int i;
		int j;
		int k;
		for (i = 0;i <= 15;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == -1)
			{
				break;
			}
			if (a[i] != 0)
			{
				if (a[i] % 2 == 0)
				{
					b[i] = a[i] / 2;
				}
				else
				{
					b[i] = -1;
				}
			}
			else
			{
				for (j = 0;j <= i - 1;j++)
				{
					for (k = 0;k <= i - 1;k++)
					{
						if (k == j)
						{
							continue;
						}
						if (a[k] == b[j])
						{
							c++;
						}
					}
				}
				System.out.print(c);
				System.out.print("\n");
				for (j = 0;j <= i;j++)
				{
					a[j] = 0,b[j] = 0;
				}
				c = 0,i = -1;
			}
		}
		return 0;
	}

}

