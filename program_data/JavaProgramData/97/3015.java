package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		while (true)
		{
			if (n - 100 * a >= 100)
			{
				a++;
			}
			else if (n - 100 * a - 50 * b >= 50)
			{
				b++;
			}
			else if (n - 100 * a - 50 * b - 20 * c >= 20)
			{
				c++;
			}
			else if (n - 100 * a - 50 * b - 20 * c - 10 * d >= 10)
			{
				d++;
			}
			else if (n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e >= 5)
			{
				e++;
			}
			else
			{
			break;
			}
				f = n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e;
		}
				System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
				return 0;
	}
}

