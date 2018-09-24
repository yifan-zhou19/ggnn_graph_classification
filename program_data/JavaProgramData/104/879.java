package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int j;
		int max;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = x;
		b[0] = y;
		for (i = 1;i < 10;i++)
		{
				a[i] = a[i - 1] / 2;
				b[i] = b[i - 1] / 2;
		}
		for (i = 9;i >= 0;i--)
		{
			for (j = 0;j < 10;j++)
			{
				if (a[i] == b[j])
				{
					max = a[i];
				}
			}
		}
			System.out.print(max);
			System.out.print("\n");
		return 0;
	}


}

