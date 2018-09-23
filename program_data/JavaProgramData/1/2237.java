package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static void asd(int i,int q)
	{
		int j;
		for (j = q;j > 1;j--)
		{
			if (i % j != 0)
			{
				continue;
			}
			if (i == j)
			{
				num++;
			}
			else
			{
				q = j;
				asd(i / j, q);
			}
		}
	}
	public static int Main()
	{
		int n;
		int o;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (o = 0;o < n;o++)
		{
			num = 0;
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			asd(a, a);
			if (num == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(num);
				System.out.print("\n");
			}
		}

	}
}

