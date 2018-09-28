package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int n;
		int m;
		int[] A = new int[100];
		int a = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = A;
		for (int i = 0;i < n;i++)
		{
			p[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 0;i < m;i++)
		{
			a = (p + n - 1);
			for (int j = n - 1;j > 0;j--)
			{
				p[j] = (p + j - 1);
			}
			p[0] = a;
		}
		for (int i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.print((p + i));
			}
			else
			{
				System.out.print(" ");
				System.out.print((p + i));
			}
		}
		return 0;
	}
}

