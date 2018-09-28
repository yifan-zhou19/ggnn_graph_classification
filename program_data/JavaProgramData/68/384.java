package <missing>;

public class GlobalMembers
{
	public static int judge(int a)
	{
	   int k;
	   for (k = 3;k * k <= a;k += 2)
	   {

		  if (a % k == 0)
		  {
		  return 0;
		  }
	   }
	   return 1;
	}

	public static void Main()
	{
	   int n;
	   int j;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (j = 6;j <= n;j += 2)
	   {
		  for (i = 3;i <= (j / 2);i += 2)
		  {
			 if (judge(i) != 0 && judge(j - i) != 0)
			 {
				 System.out.printf("%d=%d+%d\n",j,i,j - i);
				 break;
			 }
		  }
	   }
	return 0;


	}
}

