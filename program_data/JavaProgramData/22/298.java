package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int n;
	   int j;
	   int k;
	   int t;
	   int s;
	   int[] a = new int[1000];
	   for (n = 0;scanf("%d,", a[n]) != EOF;n++)
	   {
		   ;
	   }
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		 for (j = 0;j < n - 1;j++)
		 {
			 for (k = 0;k < n - j - 1;k++)
			 {
				 if (a[k] < a[k + 1])
				 {
					 t = a[k];
					 a[k] = a[k + 1];
					 a[k + 1] = t;
				 }
			 }
		 }
		 for (s = 1;s < n;s++)
		 {
			 if (a[s] != a[0])
			 {
				 break;
			 }

		 }
		 if (s == n || n == 1)
		 {
			 System.out.print("No");
		 }
		   else
		   {
			   System.out.printf("%d",a[s]);
		   }
	}

}

