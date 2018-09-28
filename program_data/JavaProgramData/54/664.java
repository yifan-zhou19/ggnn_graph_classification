package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double final = new double(int n,int k,int n1,int p);
		int n;
		int k;
		int n1;
		int i;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		n1 = n;
		for (i = 1;;i++)
		{
			m = final(n + 1, k, n1, (n1 - 1) * i);
			if (m - (int)m == 0)
			{
				break;
			}
		}
		System.out.printf("%.0f\n",m);
	}

	public static double final_Renamed(int n,int k,int n1,int p)
	{
		double x;
		if (n == 1)
		{
			x = p;
		}
		else
		{
			x = final(n - 1, k, n1, p) * n1 / (n1 - 1) + k;
		}
		return x;
	}
}

