package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int k;
		char i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = -1;
		while ((i = System.in.read()) == ',')
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  k = Integer.parseInt(tempVar2);
		  }
		  if (k > a)
		  {
		  b = a;
		  a = k;
		  }
		  if (k > b && k < a)
		  {
		  b = k;
		  }
		}
		  if (a == b || b == -1)
		  {
		  System.out.print("No");
		  }
		  else
		  {
		  System.out.printf("%d",b);
		  }
		  return 0;
	}

}

