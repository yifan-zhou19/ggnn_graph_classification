package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		char c;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a[0] = 1;
		for (int i = 1;i < 100;i++)
		{
			char b;
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (b == c)
			{
			a[i] = 1;
			}
			else
			{
			a[i] = -1;
			}
		}
		for (int j = 0;j < 100;j++)
		{
			if (a[j] == -1)
			{
				for (int k = j - 1;k >= 0;k--)
				{
					if (a[k] == 1)
					{
					System.out.print(k);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
					a[k] = 0;
					a[j] = 0;
					break;
					}
				}
			}
		}

		return 0;
	}


}

