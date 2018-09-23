package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[100][15];
		int i = 0;
		int j;
		int k;
		int count;
		int t;
		for (i = 0;;i++)
		{
			count = 0;
			j = 0;
			do
			{
				n[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (n[i][j] == -1)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
				j++;
			} while (n[i][j - 1] != 0);
			for (k = 0;k < j;k++)
			{
				for (t = j - 1;t > k;t--)
				{
					if (n[i][t] == 2 * n[i][k] || 2 * n[i][t] == n[i][k])
					{
						count++;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	return 0;
	}




}

