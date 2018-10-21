package <missing>;

public class GlobalMembers
{
	public static int[] flag = new int[10000];
	public static int[] num = new int[10000];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a = 1;
		int b = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0, (Integer.SIZE / Byte.SIZE));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a != 0) || (b != 0))
		{
			flag[a] = 1;
			num[b]++;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int i;
		int j = 0;
		for (i = 0; i < n; i++)
		{
			if (flag[i] == 0 && num[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				j = 1;
			}
		}
		if (j == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

