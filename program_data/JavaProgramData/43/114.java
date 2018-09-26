package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
	int i;
	   for (i = 2;i < a;i++)
	   {
		  if (a % i == 0)
		  {
		  break;
		  }
	   }
		if (i == a)
		{
		  return 1;
		}
	}
	public static int Main()
	{
		  int m;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (i = 3;i <= m / 2;i = i + 2)
		  {
			 if ((sushu(i) == 1) && (sushu(m - i) == 1))
			 {
			   System.out.printf("%d %d\n",i,m - i);
			 }
		  }
	}
}

