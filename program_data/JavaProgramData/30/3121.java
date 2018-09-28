package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int s = 0;
		int[] a = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < 101;i++) //???7?????a[i]???0
		{
			a[i] = i;
			if (a[i] % 7 == 0)
			{
				a[i] = 0;
			}
			if (a[i] > 69 && a[i] < 80)
			{
				a[i] = 0;
			}
			if (a[i] - a[i] / 10 * 10 == 7)
			{
				a[i] = 0;
			}
		}
		for (i = 1;i <= n;i++) //??????n??7??????????
		{
			s += a[i] * a[i];
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}

