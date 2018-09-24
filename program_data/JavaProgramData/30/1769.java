package <missing>;

public class GlobalMembers
{
	public static int[] res = new int[102];
	public static int n;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(res, 0, (Integer.SIZE / Byte.SIZE));
		for (int i = 1; i <= 100; i++)
		{
			if (i % 10 == 7 || i % 7 == 0 || i / 10 == 7)
			{
				res[i] = res[i - 1];
			}
			else
			{
				res[i] = res[i - 1] + i * i;
			}
		}
		System.out.print(res[n]);
		System.out.print("\n");
		return 0;
	}
}

