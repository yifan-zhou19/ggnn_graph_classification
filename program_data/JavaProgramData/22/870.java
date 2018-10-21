package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a = 0;
	   int b = -1;
	   int i = 0;
	   char c = ',';
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
		  else if (b <= n != 0 && n < a)
		  {
			 b = n;
		  }
		  i++;
	   }
	   if (i == 1 || b == -1 || b == 0)
	   {
		  System.out.print("No");
	   }
	   else
	   {
		  System.out.printf("%d",b);
	   }
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			c = tempVar4.charAt(0);
		}
		return 0;
	}

}

