package <missing>;

public class GlobalMembers
{
	public static int bo(int x)
	{
		double b;
		double p;
		double q;
		double P;
		double Q;
		double result;
		b = Math.sqrt(5);
		p = (1 + b) / 2;
		q = (1 - b) / 2;
		P = Math.pow(p,x);
		Q = Math.pow(q,x);
		result = (P - Q) / b;
		return result;
	}
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < m;i++)
		{
			int n;
			int c;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			c = bo(n);
			System.out.printf("%d\n",c);
		}
	return 0;
	}




}

