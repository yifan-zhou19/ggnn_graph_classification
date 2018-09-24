package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] c = new int[100000];
		int[] sum = new int[100000];
		int i;
		int t1;
		int t2;
		int t3;
		int s1;
		int s2;
		int s3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		sum[i] = b[i] + c[i];
		}
		for (i = 0,t1 = 0,s1 = a[0];i < n;i++)
		{
			if (sum[i] > t1)
			{
			t1 = sum[i];
		s1 = a[i];
			}
		}
		System.out.printf("%d %d\n",s1,t1);
		for (i = 0,t2 = 0,s2 = a[0];i < n;i++)
		{
			if (a[i] == s1)
			{
				continue;
			}
		if (sum[i] > t2)
		{
			t2 = sum[i];
		s2 = a[i];
		}
		}
		System.out.printf("%d %d\n",s2,t2);
		for (i = 0,t3 = 0,s3 = a[0];i < n;i++)
		{
			if (a[i] == s1 || a[i] == s2)
			{
				continue;
			}
		if (sum[i] > t3)
		{
			t3 = sum[i];
		s3 = a[i];
		}
		}
		System.out.printf("%d %d\n",s3,t3);
		return 0;
	}

}

