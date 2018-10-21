package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int Main()
	{
		  void fenjie(int x,int qi);
		  int n;
		  int k;
		  int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (k = 1;k <= n;k++)
		  {
			  num = 0;
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			  fenjie(a, 2);
			  System.out.printf("%d\n",num);
		  }
	}
	public static void fenjie(int x,int qi)
	{
		  if (x == 1)
		  {
			  num++;
		  }
		  else
		  {
			 for (int i = qi;i <= x;i++)
			 {
				  if (x % i == 0)
				  {
					  fenjie(x / i, i);
				  }
			 }
		  }
	}
}

