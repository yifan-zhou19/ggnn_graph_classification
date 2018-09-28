package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int[] num = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b != 0 && !(a == 0 && b == 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			num[b]++;
		}
		for (int i = 0 ; i < n ; i++)
		{
			if (num[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("NOT FOUND");
		System.out.print("\n");
		return 0;

	}

}

