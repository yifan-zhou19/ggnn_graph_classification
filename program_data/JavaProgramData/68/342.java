package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int check = int n;
	 int n;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 n = n / 2 * 2;
	 for (i = 6;i <= n;i++,i++)
	 {
	  for (j = 2;j <= (i / 2);j++)
	  {
	   if (check(j) == 1 && check(i - j) == 1)
	   {
		System.out.printf("%d=%d+%d\n",i,j,i - j);
		break;
	   }
	  }
	 }
	}

	public static int check(int n)
	{
	 int k;
	 int i;
	 k = Math.sqrt(n);
	 for (i = 2;i <= k;i++)
	 {
		  if (n % i == 0)
		  {
		   return (-1);
		   break;
		  }
	 }
	 if (i == (k + 1))
	 {
	 return (1);
	 }
	}
}

