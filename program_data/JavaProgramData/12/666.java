package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int n = 0;
		int i;
		int m;
		int j;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (a[0] != (-1))
			{
				for (i = 1;i <= 15;i++)
				{
					 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[i] == 0)
					{
						break;
					}
				}
				for (j = i - 1;j >= 0;j--)
				{
					for (m = i - 1;m >= 0;m--)
					{
						if (a[j] == 2 * a[m])
						{
							n++;
						}
					}
				}
				System.out.print(n);
				System.out.print("\n");
				n = 0;
			}
			else
			{
				break;
			}
		}
		return 0;
	}

}

