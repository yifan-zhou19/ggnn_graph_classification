package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int Main()
	{
		int m = -999;
		int n = -999;
		int t;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t = Integer.parseInt(tempVar);
			}
			if (t > m)
			{
				n = m,m = t;
			}
			else if (t < m && t> n)
			{
				n = t;
			}
			c = System.in.read();
		}while (c >= 32);
		if (n == -999)
		{
		System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",n);
		}
		return 0;
	}

}

