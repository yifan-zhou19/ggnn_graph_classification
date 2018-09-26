package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int l;
	  int n;
	  int m;
	  int i;
	  int j;
	  int k;
	  int r;
	  int s;
	  int t1;
	  int t2;
	  int w;
	  int x;
	  String a = new String(new char[500]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }

	  m = a.length();
	  l = m + 1 - n;
	  char[][] b = new char[l][n];
	  int[] c = new int[l];
	  j = 0;
	  k = -1;
	  for (i = 0;i < m;i++)
	  {
		k++;
		b[j][k] = a.charAt(i);
		if ((k + 1) % n == 0)
		{
		 k = -1;
		 j++;
		 i = i - n + 1;
		}
	  }

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(c,0,l * 4);
	  for (j = 0;j < m - n + 1;j++)
	  {
		  for (k = j + 1;k < m - n + 1;k++)
		  {
			   r = 0;
			   for (i = 0;i < n;i++)
			   {
				  if (b[j][i] == b[k][i])
				  {
					r++;
				  }
			   }
			   if (r == n)
			   {
				  c[j]++;
			   }
		  }
	  }

	 for (j = 0;j < m - n;j++)
	 {
		 for (k = 0;k < m - n - j;k++)
		 {
		   if (c[k] < c[k + 1])
		   {
				 t1 = c[k];
				 c[k] = c[k + 1];
				 c[k + 1] = t1;
			   for (i = 0;i < n;i++)
			   {
				 t2 = b[k][i];
				 b[k][i] = b[k + 1][i];
				 b[k + 1][i] = t2;
			   }
		   }
		 }
	 }

		 w = 0;
		 x = 1;
	   for (i = 0;i < m - n;i++)
	   {
		   if (c[i] != c[i + 1])
		   {
			 w = i + 1;
			 x = c[i] + 1;
			 break;
		   }
	   }

	   if (x <= 1)
	   {
		 System.out.print("NO\n");
	   }
	   else if (x > 1)
	   {
	   System.out.printf("%d\n",x);
	   for (j = 0;j < w;j++)
	   {
		 for (k = 0;k < n;k++)
		 {
		   System.out.printf("%c",b[j][k]);
		 }
		 System.out.print("\n");
	   }
	   }
	}

}

