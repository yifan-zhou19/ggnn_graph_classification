package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 100;
		int[] nfa = new int[n];
		int[][] a = new int[n][16];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,-100,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(nfa,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 16;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][0] == -1)
				{
					n = i;
				break;
				}
				if (a[i][j] == 0)
				{
					break;
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int k = 0;k < 16;k++)
			{
				for (int j = 0;j < 16;j++)
				{
				   if (a[i][j] == 2 * a[i][k])
				   {
					   nfa[i]++;
				   }
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			System.out.print(nfa[i] - 1);
			System.out.print("\n");
		}
		return 0;
	}
}

