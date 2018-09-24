package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[12];
		int i;
		int j;
		int[] b = new int[12];
		int point;
		a[0] = x;
		b[0] = y;
		for (i = 1;i < 12;i++)
		{
			a[i] = a[i - 1] / 2;
			b[i] = b[i - 1] / 2;
		}
		for (i = 11;i >= 0;i--)
		{
			for (j = 11;j >= 0;j--)
			{
				if (a[i] == b[j])
				{
					point = a[i];
				}
			}
		}
		System.out.print(point);
		System.out.print("\n");
		return 0;
	}

}

