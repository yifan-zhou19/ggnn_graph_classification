package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] l = new int[10000];
		int[] r = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(l,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(r,0,(Integer.SIZE / Byte.SIZE));
		while (true)
		{
			int a;
			int b;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
				break;
			}
			l[a] = 1;
			r[b] += 1;
		}
		for (int i = 0;i < n;i++)
		{
			if (l[i] == 0 && r[i] == n - 1)
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

