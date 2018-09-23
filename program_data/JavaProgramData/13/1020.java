package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int end;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (a[i] == a[j])
				{
					b[j] = 1;
				}
			}
		}
		for (int i = n - 1; i >= 0; i--)
		{
			if (b[i] == 0)
			{
				end = i;
				b[i] = 1;
				break;
			}
		}
	if (end != 0)
	{
			for (int i = 0; i < n; i++)
			{
			if (b[i] == 0)
			{
			System.out.print(a[i]);
			System.out.print(" ");
			}
			}
	}
		System.out.print(a[end]);
		System.out.print("\n");
		return 0;

	}
}

