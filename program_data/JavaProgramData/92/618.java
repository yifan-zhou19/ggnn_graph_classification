package <missing>;

public class GlobalMembers
{
	public static void _qsort(int[] a, int start, int end)
	{
	   int i;
	   int j;
	   int temp;
	   i = start, j = end;
	   temp = a[i];
	   while (i < j)
	   {
		 for (; temp >= a[j] != 0 && i < j ; j--)
		 {
			 ;
		 }
		 if (i < j)
		 {
			 a[i++] = a[j];
		 }
		 for (; a[i] >= temp != 0 && i < j ; i++)
		 {
			 ;
		 }
		 if (i < j)
		 {
			 a[j--] = a[i];
		 }
	   }
	   a[i] = temp;
	   if (start < i - 1)
	   {
		   _qsort(a, start, i - 1);
	   }
	   if (j + 1 < end)
	   {
		   _qsort(a, j + 1, end);
	   }
	}

	public static int Main()
	{
	   int n;
	   int s;
	   int max;
	   int[] q = new int[MAXN];
	   int[] t = new int[MAXN];
	   int i;
	   int j;
	   for (;;)
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
		 max = -1001;
		 for (i = 0 ; i < n ; i++)
		 {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  t[i] = Integer.parseInt(tempVar2);
		  }
		 }
		 _qsort(t, 0, n - 1);
		 for (i = 0 ; i < n ; i++)
		 {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  q[i] = Integer.parseInt(tempVar3);
		  }
		 }
		 _qsort(q, 0, n - 1);
		 for (i = 0 ; i < n ; i++)
		 {
		   s = 0;
		   for (j = 0 ; j < n ; j++)
		   {
			if (q[(i + j) % n] > t[j])
			{
			  s--;
			}
			 else if (q[(i + j) % n] < t[j])
			 {
			  s++;
			 }
		   }
		   if (s > max)
		   {
			   max = s;
		   }
		 }
		 System.out.printf("%d\n", max * 200);
	   }
	 //  getchar (); getchar ();
	   return 0;
	}

}

