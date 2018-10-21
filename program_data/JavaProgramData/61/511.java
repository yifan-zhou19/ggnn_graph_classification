package <missing>;

public class GlobalMembers
{
	public static int[] f = new int[25];

	public static int cal(int t)
	{
		if (t == 1 || t == 2)
		{
			f[t] = 1;
			return 1;
		}
		if (f[t] < 0)
		{
			f[t] = cal(t - 1) + cal(t - 2);
		}
		return f[t];
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(f,-1,(Integer.SIZE / Byte.SIZE));
		while (n-- != 0)
		{
			int t;
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(cal(t));
			System.out.print("\n");
		}
		return 0;
	}
}

