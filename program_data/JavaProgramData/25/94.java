package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[MAXN];
	public static int n;
	public static int i;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		while (n-- != 0)
		{
			for (i = 0;i < MAXN;i++)
			{
			a[i] *= 2;
			}
			for (i = 0;i < MAXN - 1;i++)
			{
				a[i + 1] += a[i] / 10;
				a[i] %= 10;
			}
		}
		for (i = MAXN - 1;i > 0 && a[i] == 0;i--)
		{
			; //????? ?????????
		}
		for (;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
			System.out.print("\n");
		 return 0;


	}

}

