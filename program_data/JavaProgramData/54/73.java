package <missing>;

public class GlobalMembers
{
	public static char calapp(int[] a, int p, int n, int k)
	{
		int i;
		a[n] = p * n + k;
		for (i = n - 1;i >= 1;i--)
		{
			if (a[i + 1] % (n - 1) == 0)
			{
				a[i] = a[i + 1] * n / (n - 1) + k;
			}
			else
			{
				return (1);
			}
		}
		return (0);
	}


	public static void Main()
	{
		int[] app = new int[N];
		int p;
		char flag;
		int n;
		int k;
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

		p = 1; //original
		do //calculate a[n]----a[1]
		{
			flag = calapp(app, p, n, k);
			if (flag != null)
			{
				p++;
			}
		}while (flag != null); //flag:1:"fail" so should go on

		System.out.printf("%d\n",app[1]);


	}



}

