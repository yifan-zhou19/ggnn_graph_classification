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
		int g;
		int h;
		while (scanf("%d%d%d%d%d%d", a, b, c, d, e, f) && a != 0)
		{
			g = (d + 12 - a) * 60 * 60;
			h = (e - b) * 60 + g + f - c;
			System.out.printf("%d\n",h);
		}
		return 0;
	}
}
