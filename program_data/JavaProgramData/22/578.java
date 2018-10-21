package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int[] sz = new int[301];
		 int i;
		 int n;
		 int u;
		 int s;
		 int temp;
		 int k;
		 for (i = 0;i <= 300;i++)
		 {
			 sz[i] = 10000;
		 }
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 sz[0] = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= 300;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead(",");
			 if (tempVar2 != null)
			 {
				 sz[i] = Integer.parseInt(tempVar2);
			 }
		 }
		 n = 0;
		 do
		 {
			 n++;
		 }while (sz[n] != 10000);
		 u = 0;
		 do
		 {
		   s = 0;
		   for (i = 0;i <= n - 2;i++)
		   {
			 if (sz[i] < sz[i + 1])
			 {
			   temp = sz[i];
			   sz[i] = sz[i + 1];
			   sz[i + 1] = temp;
			   u = 1;
			 }
		   }
		   for (i = 0;i <= n - 2;i++)
		   {
			 if (sz[i] < sz[i + 1])
			 {
				 s = 1;
			 }
		   }
		 }while (s != 0);

		if (n == 1)
		{
			System.out.print("No");
		}
		else if (n != 1 && u == 0)
		{
			System.out.print("No");
		}
		else if (n != 1 && u != 0)
		{
			for (k = 1;k <= n - 1;k++)
			{
			  if (sz[k] != sz[0])
			  {
				  break;
			  }
			}
			System.out.printf("%d",sz[k]);
		}
		return 0;
	}
}

