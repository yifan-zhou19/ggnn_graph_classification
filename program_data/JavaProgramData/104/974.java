package <missing>;

public class GlobalMembers
{
	public static int refine(int a)
	{
	  if (a % 2 == 1)
	  {
		  return ((a - 1) / 2);
	  }
	  else
	  {
		  return (a / 2);
	  }
	}

	public static int Main()
	{
	  int a;
	  int b;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  while (a != b)
	  {
		if (a > b)
		{
			a = refine(a);
		}
		else
		{
			b = refine(b);
		}
	  }
	  System.out.printf("%d",a);
	  return 0;
	}
}

