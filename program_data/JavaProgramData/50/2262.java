package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k = 0;
	 int m;
	 int n;
	 int sum = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 if (n == 7)
	 {
	 for (i = 1;i <= 12;i++)
	 {
	 for (j = 1;j <= a[i];j++)
	 {
						 if (j == 13)
						 {
								  if (n == 7 || n % 7 == 6)
								  {
								  System.out.printf("%d\n",i);
								  }

						 }
	 }
						 sum = sum + a[i];
						 n = sum + 13;
	 }
	 }
	 if (n == 6)
	 {
	 for (i = 1;i <= 12;i++)
	 {
	 for (j = 1;j <= a[i];j++)
	 {
						 if (j == 13)
						 {
								  if (n % 7 == 0)
								  {
								  System.out.printf("%d\n",i);
								  }

						 }
	 }
						 sum = sum + a[i];
						 n = sum + 13;
	 }
	 }
	 if (n == 5)
	 {
	 for (i = 1;i <= 12;i++)
	 {
	 for (j = 1;j <= a[i];j++)
	 {
						 if (j == 13)
						 {
								  if (n % 7 == 1)
								  {
								  System.out.printf("%d\n",i);
								  }

						 }
	 }
						 sum = sum + a[i];
						 n = sum + 13;
	 }
	 }
	 if (n == 4)
	 {
	 for (i = 1;i <= 12;i++)
	 {
	 for (j = 1;j <= a[i];j++)
	 {
						 if (j == 13)
						 {
								  if (n % 7 == 2)
								  {
								  System.out.printf("%d\n",i);
								  }

						 }
	 }
						 sum = sum + a[i];
						 n = sum + 13;
	 }
	 }
	 if (n == 3)
	 {
	 for (i = 1;i <= 12;i++)
	 {
	 for (j = 1;j <= a[i];j++)
	 {
						 if (j == 13)
						 {
								  if (n % 7 == 3 && n != 3)
								  {
								  System.out.printf("%d\n",i);
								  }

						 }
	 }
						 sum = sum + a[i];
						 n = sum + 13;
	 }
	 }
	 if (n == 2)
	 {
	 for (i = 1;i <= 12;i++)
	 {
	 for (j = 1;j <= a[i];j++)
	 {
						 if (j == 13)
						 {
								  if (n % 7 == 4)
								  {
								  System.out.printf("%d\n",i);
								  }

						 }
	 }
						 sum = sum + a[i];
						 n = sum + 13;
	 }
	 }
	 if (n == 1)
	 {
	 for (i = 1;i <= 12;i++)
	 {
	 for (j = 1;j <= a[i];j++)
	 {
						 if (j == 13)
						 {
								  if (n % 7 == 5)
								  {
								  System.out.printf("%d\n",i);
								  }

						 }
	 }
						 sum = sum + a[i];
						 n = sum + 13;
	 }
	 }

	}

}

