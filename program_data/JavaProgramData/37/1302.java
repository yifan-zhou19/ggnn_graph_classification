package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int j;
	  int b;
	  int c;
	  int i;
	  int n;
	  String x = new String(new char[10000]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   x = tempVar2.charAt(0);
		   }
		a = x.length();
		for (j = 0;j < a;j++)
		{
			 for (b = 0;b < a;b++)
			 {
				   if (b == j)
				   {
					   continue;
				   }
				   else if (x.charAt(b) == x.charAt(j))
				   {
					   break;
				   }
			 }
			if (b == a)
			{
				break;
			}
		}
	   if (j == a)
	   {
		   System.out.print("no\n");
	   }
	   else
	   {
		   System.out.printf("%c\n",x.charAt(j));
	   }
	  }
	  return 0;
	}

}

