package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] in = new int[200000];
		int[] out = new int[200000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(in,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(out,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int to;
		int from;
		while ((to = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (from = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (to == 0 && from == 0)
			{
				break;
			}
			in[from]++;
			out[to]++;
		}
		for (int i = 0 ; i < n; i++)
		{
			if (in[i] == n - 1 && out[i] == 0)
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

