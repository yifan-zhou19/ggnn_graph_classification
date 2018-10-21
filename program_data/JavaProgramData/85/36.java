package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int l;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String c = new String(new char[20]);
	  for (i = 1;i <= n;i++)
	  {
		  int count = 1;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		  l = c.length();


		  if (c.charAt(0) <= 64)
		  {
			  count = 0;
		  }
		  if (c.charAt(0) >= 123)
		  {
			  count = 0;
		  }
		  if (c.charAt(0) >= 91 && c.charAt(0) <= 96 && c.charAt(0) != 95)
		  {
			  count = 0;
		  }
		  for (j = 1;j < l;j++)
		  {
			  if (c.charAt(j) <= 47)
			  {
				  count = 0;
			  }
		   if (c.charAt(j) >= 58 && c.charAt(j) <= 64)
		   {
				  count = 0;
		   }
		  if (c.charAt(j) >= 91 && c.charAt(j) <= 96)
		  {
				  count = 0;
		  }
		   if (c.charAt(j) >= 123 && c.charAt(j) <= 127)
		   {
			   count = 0;
		   }


		  }
		   if (count == 0)
		   {
			   System.out.print("no\n");
		   }
	  if (count == 1)
	  {
		  System.out.print("yes\n");
	  }

	  }

	  return 0;

	}
}

