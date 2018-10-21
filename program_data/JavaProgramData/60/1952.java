package <missing>;

public class GlobalMembers
{
	public static int ispr(int a)
	{
		int i;
		int just = 1;
		for (i = 2;i * i <= a;i++)
		{
		if (a % i == 0)
		{
				  just = 0;
				  break;
		}
		}
		return just;
	}
	public static int Main()
	{
		  int n;
		  int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty\n");
		  }
		  else
		  {
		  for (a = 5;a <= n;a++)
		  {
		  if (ispr(a) != 0 && ispr(a - 2) != 0)
		  {
		  System.out.printf("%d %d\n",a - 2,a);
		  }
		  }
		  }
	}
}

