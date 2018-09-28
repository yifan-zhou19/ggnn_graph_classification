package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int j;
		int a;
		int b;
		int[] s = new int[100];
		int[][] f = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
		int p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (j = 0;j < a;j++)
				{
					for (k = 0;k < b;k++)
					{
						f[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
				}
				for (j = 0;j < a;j++)
				{
						p = f[j];
						s[i] += p;
						p = f[j] + b - 1;
						s[i] += p;
				}
				for (k = 1;k < b - 1;k++)
				{
						p = f[0] + k;
						s[i] += p;
						p = f[a - 1] + k;
						s[i] += p;
				}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(s[i]);
			System.out.print("\n");
		}

		return 0;
	}

}

