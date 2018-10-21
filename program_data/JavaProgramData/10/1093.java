package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  int[] h = new int[k];
		  int[] n = new int[k];
		  for (i = 0;i < k;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  h[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (i = k - 1;i >= 0;i--)
		  {
			  int max = 0;
			  for (j = i + 1;j < k;j++)
			  {
				  if (h[j] <= h[i] != 0 && n[j]> max)
				  {
					  max = n[j];
				  }
			  }
			  n[i] = max + 1;
		  }
		  int Max = 0;
		  for (i = 0;i < k;i++)
		  {
			  if (n[i] > Max)
			  {
				  Max = n[i];
			  }
		  }
		  System.out.printf("%d\n",Max);
	}
}

