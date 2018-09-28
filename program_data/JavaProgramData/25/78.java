package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[35];
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0, (Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n != 0)
		{
			num[0] = 2;
			for (i = 1; i < n; i++)
			{
				for (j = 0; j < 35; j++)
				{
					num[j] *= 2;
				}
				for (j = 0; j < 35; j++)
				{
					if (num[j] >= 10)
					{
						num[j + 1] += num[j] / 10;
						num[j] = num[j] % 10;
					}
				}
			}
			i = 34;
			while (num[i] == 0)
			{
				i--;
			}
			for (; i >= 0; i--)
			{
				System.out.print(num[i]);
			}
			System.out.print("\n");
		}
		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		return 0;
	}

}

