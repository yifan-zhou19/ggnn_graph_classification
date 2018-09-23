package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		if (k == 1)
		{
		 System.out.print("1\n");
		}
		else if (k >= 2)
		{
			int[] a = new int[25];
			int i;
			int[] b = new int[25];
			int[] c = new int[25];
			int j;
			int p = 0;
			int m;
			int n;
			int t = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < k;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
			b[0] = 1;
		 for (i = k - 2;i >= 0;i--)
		 {
			 for (j = i + 1;j <= k - 1;j++)
			 {
				 if (a[i] >= a[j])
				 {
					 c[p] = b[k - 1 - j];
				 p++;
				 }
				 for (m = 0;m < p;m++)
				 {
					 if (c[m] > t)
					 {
					 t = c[m];
					 }
				 }
			 }
			 b[k - 1 - i] = t + 1;
			 p = 0;
			 t = 0;
			 for (m = 0;m < p;m++)
			 {
				 c[m] = 0;
			 }
		 }
		 for (n = 0;n < k;n++)
		 {
			 if (b[n] > t)
			 {
			t = b[n];
			 }
		 }
		 System.out.printf("%d\n",t);
		}
	}



}

