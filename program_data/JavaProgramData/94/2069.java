package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y = 0;
		int i;
		int j;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] b = new int[100];
		for (x = 0;x < n;x++)
		{
			a[x] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[x] % 2 != 0)
			{
				b[y] = a[x];
			y++;
			}
		}
		for (i = 1;i < y;i++)
		{
			for (j = 0;j < y - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					p = b[j];
					b[j] = b[j + 1];
					b[j + 1] = p;
				}
			}
		}
				System.out.print(b[0]);
				for (i = 1;i < y;i++)
				{
					System.out.print(",");
					System.out.print(b[i]);
				}
				return 0;

	}
}

