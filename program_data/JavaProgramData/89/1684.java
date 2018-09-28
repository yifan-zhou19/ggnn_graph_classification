package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] c = new int[10000];
		int n;
		int a;
		int b;
		int answer = 20000;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, 100);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b != 0 && (a + b != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			c[a] = 1;
		}
		for (int i = 0; i < n; i++)
		{
			if (c[i] == 0)
			{
				answer = i;
			}
		}
		if (answer != 20000)
		{
			System.out.print(answer);
			System.out.print("\n");
		}
		else
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}


}

