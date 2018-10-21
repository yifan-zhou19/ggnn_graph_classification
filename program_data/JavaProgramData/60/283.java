package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k = 0;
		  int b = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  for (i = 3;i <= n;i++)
		  {
				 for (j = 2;j <= i - 1;j++)
				 {
								   if (i % j == 0)
								   {
								   break;
								   }
				 }
				 if (j == i)
				 {

					   a[k] = i;
					   k++;
				 }
		  }
		  for (i = 0;i <= k - 2;i++)
		  {
			if ((a[i] + 2) == a[i + 1])
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				b++;
			}

		  }
		 if (b == 1)
		 {
		 System.out.print("empty");
		 }
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}
}

