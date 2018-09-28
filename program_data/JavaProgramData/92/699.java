package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		 int m = 1;
		 while (m != 0)
		 {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  if (m == 0)
		  {
		  break;
		  }
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  int i;
		  for (i = 0;i <= m - 1;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (i = 0;i <= m - 1;i++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  int j;
		  int k;
		  int num1 = 0;
		  int num2 = 0;
		  for (i = 0;i <= m - 1;i++)
		  {
				 for (j = i;j <= m - 1;j++)
				 {
				   if (a[i] < a[j])
				   {
					  k = a[i];
					a[i] = a[j];
					a[j] = k;
				   }
				 }
		  }
		  for (i = 0;i <= m - 1;i++)
		  {
				 for (j = i;j <= m - 1;j++)
				 {
				   if (b[i] < b[j])
				   {
					  k = b[i];
					b[i] = b[j];
					b[j] = k;
				   }
				 }
		  }
		  int x;
		  int y;
		  int z;
		  int w;
		  x = a[0];
		  y = b[0];
		  z = a[m - 1];
		  w = b[m - 1];
		  if (x > y)
		  {
		  y = x;
		  }
		  if (z > w)
		  {
		  z = w;
		  }


		  for (i = 0;i < m;i++)
		  {
			  for (j = 0;j < m;j++)
			  {
				   if (a[m - 1 - i] > b[j])
				   {
					 num1++;
				  a[m - 1 - i] = z - 1;
				  b[j] = y + 1;
				  break;
				   }

			  }

		  }
		  for (i = 0;i < m;i++)
		  {
			  for (j = 0;j < m;j++)
			  {
				  if (a[i] == b[j])
				  {
					 num2++;
				 a[i] = z - 1;
				 b[j] = y + 1;
				  }
			  }
		  }


		  System.out.printf("%d\n",num1 * 200 - (m - num1 - num2) * 200);
		 }




	}

}

