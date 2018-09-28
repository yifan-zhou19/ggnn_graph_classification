package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i;
		int num;
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 999; i++)
		{
			a[i] = 0;
		}
		a[999] = 1;
		for (; N > 0; N--)
		{
			for (i = 999, num = 0; i > 0; i--)
			{
				num = a[i] * 2 + num / 10;
				a[i] = num % 10;
			}
		}
		for (i = 0; a[i] == 0; i++)
		{
			;
		}
		for (; i < 1000; i++)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

