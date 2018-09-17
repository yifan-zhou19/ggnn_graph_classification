package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] max_y = new int[25];
	public static int max(int[] sum, int[] x, int i, int j, int k)
	{
	   int t;
	   int l = 1;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//   static int y[25];
	   t = i + 1;
	   for (;t <= k - 1;t++)
	   {
		  if (t != j && x[i] >= x[t])
		  {
				max_y[l] = sum[t];
			 l++;
		  }
	   }
	   for (i = 1;i < l;i++)
	   {
		  if (sum[j] < max_y[i])
		  {
			break;
		  }
	   }
	   if (i == l)
	   {
		 return (1);
	   }
	   else
	   {
		 return (0);
	   }
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_x = new int[25];
int[] sum = new int[25];
	public static int Main()
	{
		  int k;
		  int i;
		  int j;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	  static int x[25],sum[25];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < k;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 Main_x[i] = Integer.parseInt(tempVar2);
			 }
		  }
		   sum[k - 1] = 1;
		  for (i = k - 2;i >= 0;i--)
		  {
			  for (j = i + 1;j <= k - 1;j++)
			  {
				if (Main_x[i] >= Main_x[j] != 0 && max(sum, Main_x, i, j, k) != 0)
				{
				  sum[i] = sum[j];
				}
			  }
			 sum[i]++;
		  }
		  int m = sum[0];
		  for (i = 1;i < k;i++)
		  {
			 if (sum[i] > m)
			 {
			   m = sum[i];
			 }
		  }
		  System.out.printf("%d",m);
	}

}

