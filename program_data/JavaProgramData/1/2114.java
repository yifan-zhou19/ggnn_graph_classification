package <missing>;

public class GlobalMembers
{
	public static int min(int a,int b)
	{
		if (a >= b)
		{
		return b;
		}
		else
		{
		return a;
		}
	}


	  public static int f(int a,int b)
	  {
		int count = 0;
		int[] k = new int[32768];
		if (a == 1)
		{
		return 1;
		}
		else
		{
		int i;
		int j;
		for (i = min(a, b);i >= 2;i--)
		{
			if (a % i == 0)
			{
			k[i] = i;
			}
		}
		for (j = 0;j < 32768;j++)
		{
			 if (k[j] != 0)
			 {
			 count = count + f(a / k[j], j);
			 k[j] = 0;
			 }
		}
		return count;
		}
	  }
	public static int Main()
	{
		  int n;
		  int i;
		  int a;
		  int number;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  number = f(a, a);
		  System.out.printf("%d\n",number);
		  }
	}

}

