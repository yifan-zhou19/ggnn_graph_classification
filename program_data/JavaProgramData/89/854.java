package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100000][2];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		int[] b = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i][0] == 0 && a[i][1] == 0)
			{
			break;
			}
		}
		int c = i - 1;
		for (i - 1;i >= 0;i--)
		{
			b[a[i][1]]++;
		}
		int j;
		int flag = 1;
		int fg = 1;
		for (i = 0;i <= n;i++)
		{
			if (b[i] == n - 1)
			{
				for (j = 0;j < c;j++)
				{
					if (a[j][0] == i)
					{
					break;
					}
				}
				if (j == c)
				{
					System.out.print(i);
					System.out.print("\n");
					fg = 0;
				}
				else
				{
				if (flag != 0)
				{
					System.out.print("NOT FOUND");
					System.out.print("\n");
					flag = 0;
				}
				}
			}
		}
					  if (fg != 0)
					  {
				System.out.print("NOT FOUND");
				System.out.print("\n");

					  }

		return 0;
	}


}

