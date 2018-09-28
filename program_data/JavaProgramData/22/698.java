package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int t;
	  char c;
	  a = 0;
	  b = 0;
	  c = ',';
	  while (c == ',')
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  if (t > b)
		  {
			  if (t > a)
			  {
				 b = a;
			 a = t;
			  }
		  else if (a == t)
		  {
		  }
		  else
		  {
			  b = t;
		  }
		  }




			c = System.in.read();


	  }
		 if (a == b || b == 0)
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

