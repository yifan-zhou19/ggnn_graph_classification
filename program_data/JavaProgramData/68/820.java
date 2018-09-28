package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int prime = int x;
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
		for (j = 3;j <= i / 2;j = j + 2)
		{
		   if (prime(j) == 1 && prime(i - j) == 1)
		   {
			   System.out.printf("%ld=%ld+%ld\n",i,j,i - j);
			break;
		   }
		}
	  }
	}

	public static int prime(int x)
	{
		int flag;
		int i;
		if (x == 2)
		{
		  flag = 1;
		}
		if (x % 2 == 0 && x != 2)
		{
		  flag = 0;
		}
		if (x % 2 != 0)
		{
			flag = 1;
			for (i = 3;i <= Math.sqrt(x);i = i + 2)
			{
			if (x % i == 0)
			{
			   flag = 0;
			   break;
			}
			}
		}
	   return (flag);
	}


}

