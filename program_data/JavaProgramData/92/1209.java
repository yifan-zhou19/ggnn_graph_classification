package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  while (true)
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
		int i = 0;
		int s = 0;
		int j = n - 1;
		int t = n - 1;
		int k;
		int r;
		int[] a = new int[1010];
		int[] b = new int[1010];
		int m = 0;
		for (k = 0;k < n;k++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[k] = Integer.parseInt(tempVar2);
		  }
		}
		for (k = 0;k < n;k++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[k] = Integer.parseInt(tempVar3);
		  }
		}

		for (k = n - 1;k > 0;k--)
		{
		  for (r = 0;r < k;r++)
		  {
			int e;
			if (a[r] < a[r + 1])
			{
				e = a[r];
				a[r] = a[r + 1];
				a[r + 1] = e;
			}
			if (b[r] < b[r + 1])
			{
				e = b[r];
				b[r] = b[r + 1];
				b[r + 1] = e;
			}
		  }
		}

		while (n-- != 0)
		{
		  if (a[i] > b[s])
		  {
			m += 200;
			i++;
			s++;
		  }
		  else if (a[j] > b[t])
		  {
			m += 200;
			j--;
			t--;
		  }
		  else if (a[j] > b[s])
		  {
			m += 200;
			j--;
			s++;
		  }
		  else if (a[j] < b[s])
		  {
			m -= 200;
			j--;
			s++;
		  }
		  else if (a[j] = b[s])
		  {
			j--;
			s++;
		  }
		}
		System.out.printf("%d\n",m);
	  }
	}
}

