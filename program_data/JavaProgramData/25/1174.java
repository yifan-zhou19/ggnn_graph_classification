package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int t;
		int[] a = new int[100];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		t = 0;
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[j] = a[j] * 2;
				a[j] = a[j] + t;
				t = 0;
				if (a[j] > 9)
				{
					a[j] = a[j] - 10;
					t = 1;
				}
			}
		}
		for (i = 99;i >= 0;i--)
		{
			if (a[i] > 0)
			{
				t = i;
				break;
			}
		}
		for (i = t;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}
}

