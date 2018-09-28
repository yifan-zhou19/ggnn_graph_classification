package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  char ch;
	  a = -1000000000;
	  b = -1000000000;
	  while (scanf("%d", c) != EOF)
	  {
		if (c > a)
		{
			b = a;
			a = c;
		}
		else
		{
		  if ((c < a) && (c> b))
		  {
			  b = c;
		  }
		}
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
	  }
	  if (b != -1000000000)
	  {
		  System.out.printf("%d",b);
	  }
	  else
	  {
		  System.out.print("No");
	  }
	}
}

