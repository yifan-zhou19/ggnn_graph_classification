package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100];
		int m;
		int n;
		int i;
		int j;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < m;j++)
		{

			t = num[n - 1];

			for (i = n - 1;i > 0;i--)

			{

				num[i] = num[i - 1];

			}
			num[0] = t;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[n - 1]);
		System.out.print("\n");
		return 0;
	}



}

