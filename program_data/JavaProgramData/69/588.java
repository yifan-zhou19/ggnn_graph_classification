package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[260]);
	public static String b = new String(new char[260]);
	public static int[] a1 = new int[260];
	public static int[] b1 = new int[260];
	public static int[] result = new int[260];
	public static int i;
	public static void add(int x)
	{
		for (i = 0;i < x;i++)
		{
			result[i] = result[i] + a1[i] + b1[i];
			if (result[i] >= 10)
			{
				result[i] = result[i] - 10;
				result[i + 1] = 1;
			}
		}
	}
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int x1 = a.length();
		int x2 = b.length();
		int x;
		x = x1 > x2 != 0 ? x1 : x2;
		for (i = 0;i < x1;i++)
		{
			a1[i] = a.charAt(x1 - 1 - i) - 48;
		}
		for (i = 0;i < x2;i++)
		{
			b1[i] = b.charAt(x2 - 1 - i) - 48;
		}
		add(x);
		for (i = x;i >= 0;i--)
		{
			if (result[i] != 0)
			{
				break;
			}
		}
			for (i = i >= 0 ? i : 0; i >= 0; i--)
			{
				System.out.print(result[i]);
			}
			System.out.print("\n");
			return 0;
	}


}

