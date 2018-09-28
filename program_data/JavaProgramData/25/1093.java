package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] ans = new int[1000];
		if (n == 0)
		{
			System.out.print("1");
		}
		else if (n == 1)
		{
			System.out.print("2");
		}
		else
		{

		ans[0] = 2;
		for (i = 1;i < n;i++)
		{
			for (int j = 0;j < 1000;j++)
			{
				if (ans[j] == 0 && ans[j + 1] == 0 && ans[j + 2] == 0)
				{ //???0-(j-1)
					for (int k = 0;k <= j - 1;k++)
					{
						if (ans[k] > 9)
						{
							   ans[k + 1]++;
							   ans[k] = ans[k] % 10;
						}
					}
					break;
				}
				else
				{
					  ans[j] = ans[j] + ans[j];
				}
			}
		}

		int len;
		for (int j = 0;j < 1000;j++)
		{
			if (ans[j] == 0 && ans[j + 1] == 0 && ans[j + 2] == 0)
			{
				  len = j - 1;
				  break;
			}
		}

		for (i = len;i >= 0;i--)
		{
			System.out.print(ans[i]);
		}
		}

		return 0;
	}
}

