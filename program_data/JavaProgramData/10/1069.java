package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int j = 0;
		  int max = 0;
		  int i;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  int[] height = new int[k];
		  int[] b = new int[k];
		  while (j < k)
		  {
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 height[j] = Integer.parseInt(tempVar2);
					 }
					 j++;
		  }
		  j = j - 1;
		  while (j >= 0)
		  {
					  for (i = j + 1;i < k;i++)
					  {
										 if (height[i] <= height[j] != 0 && b[i]> max)
										 {
											max = b[i];
										 }
					  }
					  b[j] = max + 1;
					  max = 0;
					  j--;
		  }
		  for (i = 0;i < k;i++)
		  {
						   if (b[i] > max)
						   {
							  max = b[i];
						   }
		  }
		  System.out.printf("%d",max);
	}

}

