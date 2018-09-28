package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] num;
	 int n;
	 int m;
	 int i;
	 int j;
	 while (scanf("%d %d", n, m), n != 0 || m != 0)
	 {
	  if (n == 1)
	  {
	   System.out.print("1\n");
	  }
	  else if (m == 1)
	  {
	   System.out.printf("%d\n",n);
	  }
	  else
	  {

	   num = new int[(m * (n - 1) + 3)];
	   for (i = 1;i <= n;i++)
	   {
		num[i] = i;
	   }
		  for (j = 1; j < (m * (n - 1) + 2); j++)
		  {
		if (j % m != 0)
		{
		 num[i++] = num[j];
		}
		  }
	   System.out.printf("%d\n",num[m * (n - 1) + 2]);
	  }
	 }
	 return 0;
	}
}
