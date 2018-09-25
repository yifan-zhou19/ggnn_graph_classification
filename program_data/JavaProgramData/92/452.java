package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int t;
	  for (i = 0;i < n - 1;i++)
	  {
		for (j = i + 1;j < n;j++)
		{
		if (a[i] < a[j])
		{
		  t = a[i];
		  a[i] = a[j];
		  a[j] = t;
		}
		}
	  }
	  return;
	}
	public static int Main()
	{
	   int[] a = new int[1000];
	   int[] b = new int[1000];
	   int i;
	   int h;
	   int k;
	   int ans;
	   int t;
	   int s;
	   int n;
	   int j;
	   int m;
	   for (k = 1;k <= 1000;k++)
	   {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		else
		{
		 t = n - 1;
		 s = n - 1;
		 for (i = 0;i < n;i++)
		 {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		 }
		sort(a, n);
	   for (i = 0;i < n;i++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	   }
		sort(b, n);
		h = 0;
		ans = 0;
	   for (i = 0;i < n;i++)
	   {
		if (a[h] > b[i])
		{
			ans += 200;
			h++;
		}
		 else if (a[h] < b[i])
		 {
			  t--;
			  ans -= 200;
		 }
		 else if (a[h] == b[i])
		 {
			  for (j = t,m = s;j >= h;j--,m--)
			  {
					  if (a[j] > b[m])
					  {
							 ans += 200;
							  t--;
							  s--;
					  }
					  else
					  {
						  if (a[j] < b[i])
						  {
							  ans -= 200;
						  }
							   t = --j;
							   s = m;
							   break;
					  }
			  }
		 }
		if (h > t)
		{
		  break;
		}
	   }
		}
	   System.out.printf("%d\n",ans);
	   }
	   System.in.read();
	   System.in.read();
	}

}

