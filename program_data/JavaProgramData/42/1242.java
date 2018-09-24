package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k = 0;
		int[] a = new int[100000];
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
				 a[i] = Integer.parseInt(tempVar2);
			 }
		}
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 m = Integer.parseInt(tempVar3);
		 }
		 for (i = 0;i < n;i++)
		 {
			  if (a[i] != m)
			  {
			  k++;
			  }
		 }
		  for (i = 0;i < n;i++)
		  {
			   if (a[i] != m)
			   {
					System.out.printf("%d",a[i]);
					k--;
					if (k > 0)
					{
					System.out.print(" ");
					}

			   }

		  }

	}

}

