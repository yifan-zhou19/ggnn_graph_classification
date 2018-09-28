package <missing>;

public class GlobalMembers
{
	public static int num(int a,int n,int k,int m)
	{
		if (m == n)
		{
			System.out.printf("%d\n",a);
			System.exit(1);
		}
		if (m != n)
		{
			if (a % (n - 1) != 0)
			{
				return 1;
			}
			a = a * n / (n - 1) + k;
			m++;
			num(a, n, k, m);
		}
		/*else if(m==n){
			printf("%d\n",a);
			return 2;
		}*/
	}
	public static void Main(String[] args)
	{
		int a;
		int n;
		int k;
		int m;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			a = i * (n - 1);
			m = 0;
			j = num(a, n, k, m);
			if (j == 2)
			{
				break;
			}
		}
	}


}

