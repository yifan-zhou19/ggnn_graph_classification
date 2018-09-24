package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int j;
		  int t = 0;
		  int max = 0;
		  int[] m = new int[25];
		  int[] n = new int[25];
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
				  m[i] = Integer.parseInt(tempVar2);
			  }
		  }

		  for (i = 0;i < k;i++)
		  {
			  n[i] = 0;
		  }
		  n[k - 1] = 1;
		  for (i = k - 2;i >= 0;i--)
		  {
			  for (j = k - 1;j > i;j--)
			  {
				   if (m[i] >= m[j])
				   {
						 if (n[i] <= n[j])
						 {
							   n[i] = n[j] + 1;
						 }
						 t++;
				   }

			  }
			  if (t == 0)
			  {
				   n[i] = 1;
			  }
			  t = 0;
		  }
		  for (i = 0;i < k;i++)
		  {
			   if (n[i] > max)
			   {
				  max = n[i];
			   }
		  }
		  System.out.printf("%d",max);

	}

}

