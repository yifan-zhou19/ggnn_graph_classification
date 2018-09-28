package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int sum;
		while (scanf("%d %d %d %d %d %d", a, b, c, d, e, f), a != 0)
		{
			sum = (d + 12 - a) * 3600 + (e - b) * 60 + (f - c);
			System.out.printf("%d\n",sum);
		}
	}


}
