package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[12];
		int n;
		int i;
		a[0] = 13;
		a[1] = a[0] + 31;
		a[2] = a[1] + 28;
		for (i = 3;i < 8;i++)
		{
						 if (i % 2 == 0)
						 {
							 a[i] = a[i - 1] + 30;
						 }
						 else
						 {
							 a[i] = a[i - 1] + 31;
						 }
		}
		 for (i = 8;i < 12;i++)
		 {
						  if (i % 2 == 0)
						  {
							  a[i] = a[i - 1] + 31;
						  }
						  else
						  {
							  a[i] = a[i - 1] + 30;
						  }
		 }
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 n = 6 - n % 7;
		 for (i = 0;i < 12;i++)
		 {
						  if (a[i] % 7 == n)
						  {
							  System.out.printf("%d\n",i + 1);
						  }
						  else
						  {
							  ;
						  }
		 }
		 return 0;
	}
}

