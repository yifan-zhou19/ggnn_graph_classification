package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int j;
		int al = 1;
		int N;
		int zhong;
		int[] a = {4, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = new int[200];

		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N <= 10)
		{
			for (i = 1;i <= N;i++)
			{
		al = al * 2;
			}
		System.out.print(al);
		System.out.print("\n");
			;
			return 0;
		}
		for (i = 1;i <= N - 10;i++)
		{
			zhong = 0;
			for (j = 0;j <= 199;j++)
			{
				b[j] = (a[j] * 2) % 10 + zhong;
				zhong = (a[j] * 2) / 10;
			}
			for (j = 0;j <= 199;j++)
			{
				a[j] = b[j];
			}
		}
		for (i = 199;b[i] == 0;i--)
		{
			;
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(b[j]);
		}
		System.out.print("\n");
		return 0;
	}









}

