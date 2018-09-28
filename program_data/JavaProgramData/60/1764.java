package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
	   int i;
	   int j = 1;
	   for (i = 2;i < Math.sqrt(x) + 1;i++)
	   {
		if (x % i == 0)
		{
		j = 0;
		break;
		}
	   }
	   return j;
	}
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int m;
		  int n;
		  int t = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 3;i + 2 <= n;i++)
		  {
				if ((sushu(i) == 1) && (sushu(i + 2) == 1))
				{
				  t = 1;
				  System.out.printf("%d %d\n",i,i + 2);
				}
		  }
		  if (t == 0)
		  {
			System.out.print("empty");
		  }
	}

}

