package <missing>;

public class GlobalMembers
{
	public static void f(String x, String y)
	{
		int lenx;
		int leny;
		int i;
		int k;
		int j;
		char p;
		lenx = x.length();
		leny = y.length();
		k = 0;
		p = x[0];
		for (i = 0;i <= lenx - 1;i++)
		{
			if (x[i].compareTo(p) > 0)
			{
				k = i;
				p = x[i];
			}
		}
		for (i = lenx - 1;i >= k + 1;i--)
		{
			x[i + 3] = x[i];
		}
		for (i = k + 1;i <= k + 3;i++)
		{
			x[i] = y[i - k - 1];
		}
		x[lenx + 3] = '\0';

	}
	public static void Main()
	{
		String x = new String(new char[20]);
		String y = new String(new char[4]);
		while (scanf("%s %s",x,y) != EOF)
		{

		f(x, y);
		System.out.printf("%s\n",x);
		}

	}


}
