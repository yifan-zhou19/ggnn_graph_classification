package <missing>;

public class GlobalMembers
{
	public static int a(int n)
	{
		int i = 1;
		int j = 1;
		int k;
		int x = 1;
		if (n == 1 || n == 2)
		{
		return (1);
		}
		else
		{
			for (k = 0;k < n - 2;k++)
			{
						 x = i + j;
						 i = j;
						 j = x;
			}
			return (x);
		}
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
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  j = Integer.parseInt(tempVar2);
						  }
						  System.out.printf("%d\n",a(j));
		  }
		  System.in.read();
		  System.in.read();
	}

}

