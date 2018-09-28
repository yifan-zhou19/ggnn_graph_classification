package <missing>;

public class GlobalMembers
{
	public static int ss(int n)
	{
		int i;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= (n / 2);i++)
		{
			if (n % i == 0)
			{
				t = 1;
				break;
			}
		}
		if (t == 1)
		{
			return 0;
		}
		else
		{
			return n;
		}
	}
	public static int Main()
	{
		int m;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= (m / 2);a++)
		{
			b = m - a;
			   if (m == ss(a) + ss(b))
			   {
				   System.out.printf("%d %d\n",ss(a),ss(b));
			   }
		}
		return 0;
	}
}

