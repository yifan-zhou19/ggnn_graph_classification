package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000]; // ????
		int n; // ??2?n??
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0, (Integer.SIZE / Byte.SIZE));
		num[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (int j = 0; j < 1000; j++)
			{
				num[j] *= 2; // ????2
			}
			for (int j = 0; j < 1000; j++) // ??
			{
				if (num[j] >= 10)
				{
					num[j] -= 10;
					num[j + 1]++; // ?????
				}
			}
		}
		int x;
		for (x = 999; num[x] == 0; x--)
		{
			; // ??????
		}
		for (; x >= 0; x--) // ????
		{
			System.out.print(num[x]);
		}
		System.out.print("\n");
		return 0;
	}

}

