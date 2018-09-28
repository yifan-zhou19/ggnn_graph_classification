package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[a];
		int[] c = new int[a];
		int d;
		for (int i = 0;i < a;i++)
		{
			c[i] = 0;
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < a;i++)
		{
			for (int j = i + 1;j < a;j++)
			{
				if (b[j] == b[i])
				{
					c[j]++;
				}
			}
		}
		for (int i = 0;i < a;i++)
		{
			if (c[i] == 0)
			{
				d = i;
			}
		}
		for (int i = 0;i < d;i++)
		{
			if (c[i] != 0)
			{
				i = i;
			}
			else
			{
				System.out.print(b[i]);
				System.out.print(",");
			}
		}
		System.out.print(b[d]);
		return 0;
	}
}

