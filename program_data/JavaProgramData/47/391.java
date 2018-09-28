package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int e;
		 int j;
		 int[] sz = new int[100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		 }
		 if (n % 2 == 0)
		 {
			 for (i = 0;i < n / 2;i++)
			 {
				for (j = 0;j < n;j++)
				{
				if (i + j == n - 1)
				{
				 e = sz[i];
				 sz[i] = sz[j];
				 sz[j] = e;
				}
				}
			 }
		 }
		  else
		  {
			   for (i = 0;i < (n + 1) / 2;i++)
			   {
				for (j = 0;j < n;j++)
				{
				if (i + j == n - 1)
				{
				 e = sz[i];
				 sz[i] = sz[j];
				 sz[j] = e;
				}
				}
			   }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
			 System.out.printf("%d ",sz[i]);
		  }
		  System.out.printf("%d",sz[n - 1]);
			  return 0;
	}
}

