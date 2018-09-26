package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int m;
		int f;
		int i;
		int j = -1;
		int l1;
		int l2;
		String q = new String(new char[10000]);
		String w = new String(new char[10000]);
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int k;
		int flag = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   q = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   w = tempVar2.charAt(0);
	   }
	   l1 = q.length();
	   l2 = w.length();
	   for (k = 0;k < l1;k++)
	   {
			for (j = j + 1;j < l1;j++)
			{
			   if (q.charAt(j) < '0' || q.charAt(j)>'9')
			   {
				   flag++;
				   break;
			   }
			   else
			   {
				   a[k] = a[k] * 10 + q.charAt(j) - '0';
			   }
			}
	   }
	   f = flag + 1;
	   j = -1;
	   for (k = 0;k < l2;k++)
	   {
			for (j = j + 1;j < l2;j++)
			{
			   if (w.charAt(j) < '0' || w.charAt(j)>'9')
			   {
				   break;
			   }
			   else
			   {
				   b[k] = b[k] * 10 + w.charAt(j) - '0';
			   }
			}
	   }

	   int min = a[0];
	   int max = a[0];
	   for (j = 0;j < f;j++)
	   {
			  if (a[j] < min)
			  {
				  min = a[j];
			  }
			  if (a[j] > max)
			  {
				  max = a[j];
			  }
	   }
	   for (j = 0;j < f;j++)
	   {
			  if (b[j] < min)
			  {
				  min = b[j];
			  }
			  if (b[j] > max)
			  {
				  max = b[j];
			  }
	   }
	   for (k = min;k < max;k++)
	   {
				for (j = 0;j < f;j++)
				{
					   if (a[j] < k && k < b[j])
					   {
						   c[k]++;
					   }
					   else if (a[j] == k)
					   {
						   c[k]++;
					   }
				}

	   }

		i = c[min];
		for (j = min + 1;j < max;j++)
		{
				if (c[j] > i)
				{
					i = c[j];
				}
		}

		System.out.printf("%d %d",f,i);
	}

}

