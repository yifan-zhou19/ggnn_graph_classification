package <missing>;

public class GlobalMembers
{
	//?????
	public static int Main()
	{
		int n; //n?????
		int x;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < 100;k++)
		{
			a[k] = 0;
		}
		for (int i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 10;j < 100;j++)
			{

				if (x == j)
				{
					a[j] = a[j] + 1;
				}
			}
			if (a[x] == 1)
			{
				if (i != 0)
				{
					System.out.print(" ");
					System.out.print(x);
				}
				else
				{
					System.out.print(x);
				}
			}
		}
		return 0;
	}
}

