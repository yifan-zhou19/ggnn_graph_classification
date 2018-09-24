package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[16];
		 int j;
		 int k;
		 int m;
		 int y;
		 int i;
	while (1 == 1)
	{
		 m = 0;
		 for (i = 0;i <= 15;i++)
		 {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  a[i] = Integer.parseInt(tempVar);
			  }
			  if (a[i] == -1)
			  {
				  y = 1;
				  break;
			  }
			  if (a[i] == 0)
			  {
				  break;
			  }
			  else
			  {
				  m = m + 1;
			  }
		 }
		 if (y == 1)
		 {
			 break;
		 }
		 else
		 {

		  k = 0;
		 for (i = 0;i < m - 1;i++)
		 {

			 for (j = i + 1;j < m;j++)
			 {
				   if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
				   {
					   k++;
				   }

			 }
		 }
		 }

		 System.out.printf("%d\n",k);
	}

	}

}

