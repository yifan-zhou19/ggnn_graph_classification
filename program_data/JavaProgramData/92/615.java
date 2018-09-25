package <missing>;

public class GlobalMembers
{
	public static int s(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
		int n;
		do
		{
		 int[] a = new int[1000];
		 int[] b = new int[1000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (int i = 0;i < n;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		 }
		 for (int i = 0;i < n;i++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		 }
		 qsort(a,n,(Integer.SIZE / Byte.SIZE),s);
		 qsort(b,n,(Integer.SIZE / Byte.SIZE),s);
		 int t1 = n - 1;
		 int t2 = 0;
		 int k1 = n - 1;
		 int k2 = 0;
		 int sum = 0;
		 int sum1 = 0;
		 if (n != 0)
		 {
			 do
			 {
			 if (a[t1] == b[k1] && a[t2] == b[k2])
			 {
					 if (a[t2] < b[k1])
					 {
				  sum--;
					 }
				  else if (a[t2] > b[t1])
				  {
				  sum++;
				  }
				  t2++;
				  k1--;
				  sum1++;
			 }
			 else if (a[t2] != b[k2])
			 {
				  if (a[t2] > b[k2])
				  {
				  sum++;
				  t2++;
				  k2++;
				  sum1++;
				  }
			  else
			  {
				  if (a[t2] > b[k1])
				  {
			   sum++;
				  }
			   else if (a[t2] < b[k1])
			   {
			   sum--;
			   }
			   t2++;
			   k1--;
			   sum1++;
			  }
			 }
			 else
			 {
					 if (a[t1] > b[k1])
					 {
							sum++;
							t1--;
							k1--;
					 }
					   else
					   {
							if (a[t2] < b[k1])
							{
					  sum--;
							}
					  else if (a[t2] > b[k1])
					  {
					  sum++;
					  }
					 t2++;
					 k1--;
					   }
					 sum1++;
			 }
			 }while (sum1 != n);
		 System.out.printf("%d\n",200 * sum);
		 }
		}while (n != 0);
	}
}

