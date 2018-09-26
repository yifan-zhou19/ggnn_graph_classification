package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string;
		final String a = "";
	  int n = 0;
	  int i = 0;
	  int sum = 0;
	  int t = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  string = a;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  String = tempVar2;
	  }
	  sum = sum + String.length();
	  for (i = 1;i <= n;i++)
	  {
		  System.out.printf("%s",String);
		 if (i < n)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 String = tempVar3;
			 }
		 }
		 sum = sum + String.length() + 1;

		  if (sum > 80)
		  {
			  sum = String.length();
			  System.out.print("\n");
			  t = 0;
		  }
		  if (i < n && t != 0)
		  {
			  System.out.print(" ");
		  }
		 t = 1;

	  }

	 return (0);
	}
}

