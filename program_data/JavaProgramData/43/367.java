package <missing>;

public class GlobalMembers
{
	public static int[] ss = new int[70000];
	public static void ps()
	{
		int i;
		int j;
		for (i = 2;i < 70000;i++)
		{
			if (ss[i] == 0)
			{
			for (j = i * 2;j < 70000;j = j + i)
			{
				ss[j] = 1;
			}
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ss,0,(Integer.SIZE / Byte.SIZE));
		ps();
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= n / 2;i++)
		{
		if (ss[i] == 0 && ss[n - i] == 0)
		{
		System.out.print(i);
		System.out.print(' ');
		System.out.print(n - i);
		System.out.print("\n");
		}
		}
	}

}

