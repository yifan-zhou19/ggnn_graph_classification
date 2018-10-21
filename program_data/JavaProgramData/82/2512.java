package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		int j;
		int a = 0;
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
			{
				a = a + 1;
				b[i] = a;
			}
			else
			{
				b[i] = a;
				a = 0;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[i] < b[j])
				{
					swap(b[i],b[j]);
				}
			}
		}
		System.out.print(b[0]);
		System.out.print("\n");
		return 0;
	}
}

