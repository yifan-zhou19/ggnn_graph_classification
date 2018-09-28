package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j = 0;
		int k = 0;
		int t;
		float aver = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			a [i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			aver += a [i];
		}
		aver /= n;
		for (i = n - 1 ; i >= 1 ; i--)
		{
			for (j = 1 ; j <= i ; j++)
			{
				if (a [j] < a [j + 1])
				{
					t = a [j];
					a [j] = a [j + 1];
					a [j + 1] = t;
				}
			}
		}
		if (Math.abs(a [1] - aver) > Math.abs(a [n] - aver))
		{
			System.out.print(a [1]);
		}
		else
		{
			if (Math.abs(a [1] - aver) == Math.abs(a [n] - aver))
			{
				System.out.print(a [n]);
				System.out.print(",");
				System.out.print(a [1]);
			}
			else
			{
				System.out.print(a [n]);
			}
		}
		return 0;
	}
}

