package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] b = new int[100];
		int[] c = new int[100];
		int[] f = new int[100];
		int[] sum = new int[100];
		char[][] a = new char[100][50];
		char[][] d = new char[100][1];
		char[][] e = new char[100][1];
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
				a[i] = tempVar2.charAt(0);
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
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				d[i] = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				e[i] = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				f[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
		   if ((b[i] > 80) && (f[i] > 0))
		   {
			 sum[i] += 8000;
		   }
		   if ((b[i] > 85) && (c[i] > 80))
		   {
			  sum[i] += 4000;
		   }
		   if (b[i] > 90)
		   {
			  sum[i] += 2000;
		   }
		   if ((b[i] > 85) && (e[i][0] == 'Y'))
		   {
			  sum[i] += 1000;
		   }
		   if ((c[i] > 80) && (d[i][0] == 'Y'))
		   {
			  sum[i] += 850;
		   }
		}
		int s = sum[0];
		int j = 0;
		int sum1 = 0;
		for (i = 0;i < n;i++)
		{
			if (sum[i] > s)
			{
			   s = sum[i];
			   j = i;
			}
			sum1 += sum[i];
		}
		System.out.printf("%s\n", a[j]);
		System.out.printf("%d\n", s);
		System.out.printf("%d\n", sum1);
	}

}

