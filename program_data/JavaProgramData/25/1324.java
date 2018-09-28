package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????2?N??   **
	//*?????? 1300012861 **
	//*???2013.11.17  **
	//********************************
	public static int Main()
	{
		int N;
		int i;
		int j;
		int len;
		int t;
		final int MAX_LEN = 200;
		int[] num = new int[MAX_LEN];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0, (Integer.SIZE / Byte.SIZE)); //????
		num[0] = 2;
		len = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			for (i = 2; i <= N; i++)
			{
				t = 0;
				for (j = 0; j < len; j++)
				{
					num[j] = 2 * num[j] + t;
					t = num[j] / 10;
					num[j] %= 10;
				}
				if (t > 0)
				{
					num[len] = t;
					len++;
				}
			}
			j = len;
			while (num[j] == 0)
			{
				j--;
			}
			for (; j >= 0; j--)
			{
				System.out.print(num[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

