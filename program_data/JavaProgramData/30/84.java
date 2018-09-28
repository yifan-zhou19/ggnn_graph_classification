package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int t1 = 0;
		int t2 = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 1;a <= n;a++)
		{
			if (a < 10 && a != 7)
			{
				c = a * a;
				t1 = t1 + c;
			}
			else if (a > 9)
			{
				b = a / 10;
				if ((a % 7 != 0) && (b != 7) && (a - b * 10 != 7))
				{
					d = a * a;
					t2 = t2 + d;
				}
			}
		}
		t = t1 + t2;
		System.out.printf("%d",t);
	}

}

