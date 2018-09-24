package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int m;
		  int n;
		  int sushu = int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n <= 4)
		  {
		  System.out.print("empty");
		  }
		  for (i = 3;i <= n;i = i + 2)
		  {
						   if (sushu(i) == 1 && sushu(i + 2) != 0 && i + 2 <= n)
						   {
						   System.out.printf("%d %d\n",i,i + 2);
						   }
		  }



	}

	public static int sushu(int m)
	{
		int b;
		for (b = 2;b <= m - 1;b++)
		{
		if (m % b == 0)
		{
		return 0;
		}
		}
		return 1;
	}
}

