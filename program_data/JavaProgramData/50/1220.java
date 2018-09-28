package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int[] a = new int[13];
		int sum;
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= 12; i++)
		{
			for (int j = 1; j < i; j++)
			{
				a[i] += b[j];
			}
			a[i] = a[i] + 13;
			if ((a[i] % 7 - 1 + w) % 7 == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

