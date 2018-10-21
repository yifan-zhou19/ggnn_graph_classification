package <missing>;

public class GlobalMembers
{
	/*?????????????N(N<=100)???2?N?????
	 *????: 2012-12-10
	 *??: ??
	 */
	public static int Main()
	{
		int N;
		int i;
		int j;
		int[] res = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int len = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < len; j++)
			{
				res[j] = res[j] * 2 + res[len];
				if (res[j] > 9)
				{
					res[j] -= 10;
					res[len] = 1;
				}
				else
				{
					res[len] = 0;
				}
			}
			if (res[len] != 0)
			{
				len++;
			}
		}
		for (i = len - 1; i >= 0; i--)
		{
			System.out.print(res[i]);
		}
		return 0;
	}
}

