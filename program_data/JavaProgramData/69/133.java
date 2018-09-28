package <missing>;

public class GlobalMembers
{
	public static final String plus1 = "";
	public static final String plus2 = "";
	public static int[] p1 = new int[SIZE + 10];
	public static int[] p2 = new int[SIZE + 10];
	public static int[] result = new int[SIZE + 10];
	public static int Main()
	{
		int i = 0;
		int end = -1;
		plus1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		plus2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = plus1.length() - 1; i >= 0; i--)
		{
			p1[plus1.length() - 1 - i] = plus1.charAt(i) - '0';
		}
		for (i = plus2.length() - 1; i >= 0; i--)
		{
			p2[plus2.length() - 1 - i] = plus2.charAt(i) - '0';
		}
		for (i = 0; i < SIZE + 5; i++)
		{
			result[i] = result[i] + p1[i] + p2[i];
			if (result[i] >= 10)
			{
				result[i + 1]++;
				result[i] = result[i] - 10;
			}
			if (result[i] != 0)
			{
				end = i;
			}
		}
		if (end == -1)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (i = end; i >= 0; i--)
			{
				System.out.print(result[i]);
			}
		}
		return 0;
	}

}

