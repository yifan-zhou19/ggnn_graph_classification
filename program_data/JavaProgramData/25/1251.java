package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] ans = new int[101];
		int len;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ans, 0, (Integer.SIZE / Byte.SIZE));
		ans[0] = 1;
		len = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= n; ++i)
		{
			t = 0;
			for (int j = 0; j <= len; ++j)
			{
				ans[j] *= 2;
				ans[j] += t;
				if (ans[j] >= 10)
				{
						   t = 1;
						   ans[j] -= 10;
				}
				else
				{
					t = 0;
				}
			}
			ans[len + 1] += t;
			if (ans[len + 1] != 0)
			{
				++len;
			}
		}
		for (int i = len; i >= 0; --i)
		{
		  System.out.print(ans[i]);
		}
		return 0;
	}
}

