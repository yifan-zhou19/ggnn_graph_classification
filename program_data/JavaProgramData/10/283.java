package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int m;
		int n;
		int g;
		int h;
		int p;
		int q = 0;
		int[] a = new int[25];
		int[] b = new int[25];
		int[] c = new int[25];
		for (i = 0;i < 25;i++)
		{
			b[i] = 1;
		}
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			if (i == 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[0] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (k == 1 || k == 0)
		{
				System.out.printf("%d",k);
		}
		else
		{
		for (j = k - 2;j >= 0;j--)
		{
			 for (p = j + 1;p < k;p++)
			 {
				   if (a[j] >= a[p])
				   {
						c[q] = b[p];
						q++;
				   }
			 }
					  if (q == 0)
					  {
					  b[j] = 1;
					  }
			else if (q == 1)
			{
				 b[j] = c[0] + b[j];
			}
			 else
			 {
			 for (g = 0;g < q - 1;g++)
			 {
				 m = c[g];
				 n = c[g + 1];
				 if (m > n)
				 {
					 c[g] = n;
					 c[g + 1] = m;
				 }
			 }
			 b[j] = c[q - 1] + b[j];
			 q = 0;
			 g = 0;
			 p = j;
			 }
		}
		for (h = 0;h < k - 1;h++)
		{
			m = b[h];
			n = b[h + 1];
			if (m > n)
			{
				b[h] = n;
				b[h + 1] = m;
			}
		}
		 System.out.printf("%d",b[k - 1]);
		}
	}
}

