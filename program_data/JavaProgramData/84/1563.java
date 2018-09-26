package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	  int a;
	  int b;
	  int c;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	 int i;
	 for (i = 1;i <= n;i++)
	 {
	  if (i == 1)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
	  }
	else if (i == 2)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
	}
	else
	{
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  c = Integer.parseInt(tempVar4);
	  }
	}
	 if (a >= b != 0 && a >= c != 0 && b >= c)
	 {
	   a = a;
	   b = b;
	 }
	else if (a >= b != 0 && a >= c != 0 && c >= b)
	{
		  a = a;
		  b = c;
	}
		  else if (b >= a != 0 && b >= c != 0 && a >= c)
		  {
				c = a;
				a = b;
				b = c;
		  }
				else if (b >= a != 0 && b >= c != 0 && c >= a)
				{
					  a = b;
					  b = c;
				}
					  else if (c >= a != 0 && c >= b != 0 && a >= b)
					  {
							b = a;
							a = c;
					  }
							else if (c >= a != 0 && c >= b != 0 && b >= a)
							{
								  a = c;
								  b = b;
							}
	 }
	System.out.printf("%d\n%d\n", a, b);
	return 0;
	 }
}

