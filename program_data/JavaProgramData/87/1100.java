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
		while (scanf("%d %d %d %d %d %d", a, b, c, d, e, f) && a != 0)
		{
			int begin;
			int end;
			int s;
			begin = a * 3600 + b * 60 + c;
			end = (d + 12) * 3600 + e * 60 + f;
			s = end - begin;
		System.out.printf("%d\n",s);
		}
	}

}
