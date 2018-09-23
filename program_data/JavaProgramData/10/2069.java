package <missing>;

public class GlobalMembers
{
	//?????????????(?????)
	public static int[] result = new int[40]; //result[i]???a[i]????????????????
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static void f(int[] a, int n)
	{
		/*??a[i]??????result?????result[j]???result[i]=1+result[j]*/
		int i;
		int j;
		int maxmium;
		result[1] = 1;
		for (i = 2;i <= n;i++)
		{
						 maxmium = 0;
						 for (j = 1;j < i;j++)
						 {
										 if (a[j] >= a[i])
										 {
											 maxmium = max(result[j], maxmium);
										 }
						 }
						 result[i] = 1 + maxmium;
		}
	}



	public static int Main()
	{
		  int n;
		  int i;
		  int outcome = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[40];
		  for (i = 1;i <= n;i++)
		  {
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   a[i] = Integer.parseInt(tempVar2);
						   }
		  }
		  f(a, n);
		  for (i = 1;i <= n;i++)
		  {
		  outcome = max(outcome, result[i]);
		  }
		  System.out.printf("%d\n",outcome);
	}

}

