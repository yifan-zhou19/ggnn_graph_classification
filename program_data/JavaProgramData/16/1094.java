package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(0);
		}
		for (int i = 3; i >= 0; i--)
		{
			if (n / ((int)(Math.pow(10.0, i))) != 0)
			{
				for (int j = i; j >= 0; j--)
				{
					a[j] = (int)n / (int)(Math.pow(10.0,j));
					n = n - a[j] * Math.pow(10.0, j);
				}
				for (int k = 0; k <= i; k++)
				{
					System.out.print(a[k]);
				}
				break;
			}

		}
		return 0;

	}
}

