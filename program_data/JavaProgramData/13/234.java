package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  int m;
		  int j;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  for (k = 0;k < n;k++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[k] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
				 m = 0;
				 for (j = 0;j < i;j++)
				 {
					   if (a[j] == a[i])
					   {
						   m += 1;
						   break;
					   }
				 }
				 if (m == 0)
				 {
						 if (i != 0)
						 {
						 System.out.print(" ");
						 }
						 System.out.printf("%d",a[i]);
				 }

		  }

	}

}

