package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sum = new int[100000];
		int i;
		int j;
		int l = 1;
		int m;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum, 0, (Integer.SIZE / Byte.SIZE));

		sum[0] = 2;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i < n; i++)
			{
				for (j = 0; j < l; j++)
				{
					sum[j] = sum[j] * 2;
				}

				for (j = 0; j < l; j++)
				{
					if (sum[j] > 9)
					{
						sum[j] = sum[j] % 10;
						sum[j + 1]++;
					}
				}
				l++;
			}

			for (i = l; sum[i] == 0; i--)
			{
				m = i;
			}

			for (i = m - 1; i >= 0; i--)
			{
				System.out.print(sum[i]);
			}
			System.out.print("\n");
		}

		return 0;
	}

}

