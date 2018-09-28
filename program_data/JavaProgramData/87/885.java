package <missing>;

public class GlobalMembers
{
	public static int jm(int f,int m)
	{
		return f * 60 + m;
	}
	public static int xg(int h1,int f1,int m1,int h2,int f2,int m2)
	{
		int rel;
		int a;
		int b;
		int c;
		h2 += 12;
		a = 3600 - jm(f1, m1);
		c = jm(f2, m2);
		b = 3600 * (h2 - h1 - 1);
		rel = a + b + c;
		return rel;
	}
	public static int Main()
	{
	int h1;
	int f1;
	int m1;
	int h2;
	int f2;
	int m2;
	while (scanf("%d%d%d%d%d%d", h1, f1, m1, h2, f2, m2) && h1 != 0)
	{
	System.out.printf("%d\n",xg(h1, f1, m1, h2, f2, m2));
	}

	return 0;
	}


}
