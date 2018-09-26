package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int k;
		k = Math.sqrt(n);
		if ((n % 2) == 0)
		{
			return 0;
		}
		for (i = 3;i <= k;i += 2)
		{
		 if ((n % i) == 0)
		 {
			 return 0;
		 }
		}
		return 1;
	}
	public static int Main()
	{
	  int n;
	  int i;
	  int flag = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 3;i <= n - 2;i += 2)
	  {
		  if (sushu(i) != 0 && sushu(i + 2) != 0)
		  {
		  System.out.printf("%d %d\n",i,i + 2),flag = 1;
		  }
	  }
	  if (flag == 0)
	  {
		  System.out.print("empty");
	  }
	}
}

