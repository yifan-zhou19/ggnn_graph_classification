package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int Main()
	{
		int m;
		int k;
		int i;
		int j;
		int Flag = 1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m - 1 && Flag != 0;i++)
		{
			for (j = i + 1;j < m && Flag != 0;j++)
			{
				if (a[i] + a[j] == k)
				{
						System.out.print("yes");
						Flag = 0;
				}
			}
		}
		if (Flag != 0)
		{
			System.out.print("no");
		}
	}
}

