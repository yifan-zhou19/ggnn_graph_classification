package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[5];
		int i;
		int j;
		int t;
		int re = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("0");
		}
		t = 1;
		for (i = 0;i < 5;i++)
		{
						t = (int)(Math.pow(10,i + 1) + 0.5);
						a[i] = 10 * (n % t) / t;
						n = n - a[i] * t / 10;
		}
		i = 4;
		while (a[i] == 0)
		{
			   i = i - 1;
		}
		for (j = 0;j <= i;j++)
		{
			System.out.printf("%d",a[j]); //re=re+a[j]*(int)(pow(10,i-j)+0.5);
		}
		//printf("%d",re);
		//scanf("%d",&n);
		return 0;
	}

}

