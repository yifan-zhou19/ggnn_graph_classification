package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int hour;
		int min1;
		int min2;
		int sec1;
		int sec2;
		int result;

		while (scanf("%d%d%d%d%d%d", a, b, c, d, e, f))
		{
		if (a != 0 || b != 0 || c != 0 || d != 0 || e != 0 || f != 0)
		{
			min1 = 59 - b;
			sec1 = 60 - c;
			min2 = e;
			sec2 = f;
			hour = 12 + d - (a + 1);

			result = hour * 60 * 60 + min1 * 60 + min2 * 60 + sec1 + sec2;
			System.out.printf("%d\n",result);
		}
		else
		{
			break;
		}
		}
		return 0;

	}
}
