package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int x;
		int y;
		int[] a = new int[10000];
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   a[i] = 0;
		   b[i] = 0;
		}
		 for (;;)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 x = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 y = Integer.parseInt(tempVar3);
			 }
			 a[x] += 1;
			 b[y] += 1;
			 if ((x == 0) && (y == 0))
			 {
		   break;
			 }
		 }
		  for (j = 0;j < n;j++)
		  {
			  if ((a[j] == 0) && (b[j] == n - 1))
			  {
				  k = k + 1;
				  break;
			  }
		  }
		 if (k != 0)
		 {
		 System.out.printf("%d",j);
		 }
		 else
		 {
		 System.out.print("NOT FOUND");
		 }


			System.in.read();
			System.in.read();
			return 0;
	}

}

