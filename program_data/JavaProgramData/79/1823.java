package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int Main()
	{
		while (true)
		{
			int n;
			int m;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((n == 0) && (m == 0))
			{
				return 0;
			}
			m--;
			for (int i = 0;i < n;i++)
			{
				a[i] = i + 1;
			}
			int t = 0;
			for (int i = 0;i < n - 1;i++)
			{
				t += m;
				t %= n - i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
				memcpy(a[t],a[t + 1],(Integer.SIZE / Byte.SIZE) * (n - i - t));
			}
			System.out.print(a[0]);
			System.out.print("\n");
		}
	}

}

