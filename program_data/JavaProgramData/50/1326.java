package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int n = 0;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[365];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

		for (int i = 0; i < 51; i++)
		{
			int n = 7 * i + 13 - w;
			a[n] = 1;
		}

		for (int i = 0; i < 12; i++)
		{
			n += b[i];
			a[n + 13] += 1;
			if (a[n + 13] == 2)
			{
			System.out.print(i + 1);
			System.out.print("\n");
			}
		}
		return 0;
	}
}

