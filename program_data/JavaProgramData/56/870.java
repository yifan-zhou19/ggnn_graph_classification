package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int l;
		int m;
		int n;
		int i;
		int[] c = new int[5];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		n = Math.log10(a);
		for (m = a,i = n;i >= 0;i--)
		{
			l = Math.pow(10,i);
			c[i] = m / l;
			m = m % l;
		}
		//printf("%d",&c[i]);
		for (i = 0;i <= n;i++)
		{
			sum = sum + c[n - i] * Math.pow(10,i);
		}
		System.out.printf("%d",sum);


		return 0;
	}

}

