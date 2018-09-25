package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int i;
		int k = 0;
		for (i = 2;i <= n;i++)
		{
			k = ((m % i) + k) % i;
		}
		return k;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int c;
		int[] N = new int[100];
		int[] M = new int[100];
		int[] r = new int[100];
		int stop;
		c = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0 && n == 0)
			{
				break;
			}
			c++;
			N[i] = n;
			M[i] = m;
			r[i] = f(M[i], N[i]) + 1;
		}
		for (i = 0;i < c;i++)
		{
			System.out.printf("%d\n",r[i]);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			stop = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

