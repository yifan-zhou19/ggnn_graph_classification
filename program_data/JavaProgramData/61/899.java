package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a <= 2)
		{
		return 1;
		}
		else
		{
		return f(a - 1) + f(a - 2);
		}
	}
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int d;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < a;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  b = Integer.parseInt(tempVar2);
			  }
			  System.out.printf("%d\n",f(b));
		  }
		  System.in.read();
		  System.in.read();
	}

}

