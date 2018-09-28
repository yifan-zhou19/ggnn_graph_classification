package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
	 int i;
	 int s = 1;
	 for (i = 2;i <= Math.sqrt(n);i++)
	 {
	  if (n % i == 0)
	  {
	   s = 0;
	   break;
	  }
	 }
	 return (s);
	}
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 6;i <= n;i = i + 2)
	 {
	  for (j = 3;j <= i / 2;j++)
	  {
	   if (sushu(j) != 0 && sushu(i - j) != 0)
	   {
		System.out.printf("%d=%d+%d\n",i,j,i - j);
		break;
	   }
	  }
	 }
	}

}

