package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  char c = ',';
	  int n;
	  int a = -1;
	  int b = -1;
	  while (c == ',')
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		if (n > a)
		{
		  b = a;
		  a = n;
		}
		else
		{
		  if (n > b && n < a)
		  {
			b = n;
		  }

		}
	  }
	  if (b != -1)
	  {
		System.out.printf("%d",b);
	  }
	  else
	  {
		System.out.print("No");
	  }
	  return 0;
	}
}

