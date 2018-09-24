package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] high = new int[100];
		  int[] count = new int[100];
		  for (i = 0;i < n;i++)
		  {
				 count[i] = 0;
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 high[i] = Integer.parseInt(tempVar2);
				 }
		  }
		   high[n] = 0,count[n] = 0;
		  for (i = n - 1;i >= 0;i--)
		  {
				 int step = 0;
				for (j = i + 1;j <= n;j++)
				{
						 if (count[j] > step)
						 {
							 if (high[j] <= high[i])
							 {
							 step = count[j];
							 }
						 }
				}
				count[i] = step + 1;

		  }
		  int max = 0;
		  for (i = 0;i < n;i++)
		  {
		  if (count[i] > max)
		  {
		  max = count[i];
		  }
		  }
		  System.out.printf("%d",max);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

