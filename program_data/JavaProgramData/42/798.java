package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[100001];
	 int n;
	 int i;
	 int k;
	 int x;
	 int j;
	 int h;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
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
		 k = Integer.parseInt(tempVar3);
	 }
	 x = n;
	 i = 1;
	  while (i <= x)
	  {
				 //for(h=1;h<=n;h++)
					// {
					 if (a[i] == k)
					 {
								for (j = i;j <= (x - 1);j++)
								{
									a[j] = a[j + 1];
								}
								x = x - 1;
					 }
					 else
					 {
						 i++;
					 }
					// }

	  }
	  System.out.printf("%d",a[1]);
	  for (i = 2;i <= x;i++)
	  {
		  System.out.printf(" %d",a[i]);
	  }

	}

}

