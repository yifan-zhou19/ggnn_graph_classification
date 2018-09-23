package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] d = new int[n];
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  d + i = tempVar2;
				  }
		  }
		  int[] opt = new int[n];
		  for (int i = 0;i < n;i++)
		  {
				  opt[i] = 0;
		  }
		  for (int i = n;i >= 0;i--)
		  {
		  for (int j = i;j < n;j++)
		  {
				  if ((d[i] >= d[j]) && (opt[i] <= opt[j] + 1))
				  {
				  opt[i] = opt[j] + 1;
				  }
		  }
		  }
		  int max = 1;
		  for (int i = 0;i < n;i++)
		  {
				  if (opt[i] > max)
				  {
				  max = opt[i];
				  }
		  }
		  System.out.printf("%d",max);
	}

}

