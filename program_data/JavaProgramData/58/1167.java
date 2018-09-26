package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int x = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	   x = 1;
	   String c = new String(new char[85]);
	   c = new Scanner(System.in).nextLine();
	   if (!(c.charAt(0) == '_' || (c.charAt(0) >= 'a' && c.charAt(0) <= 'z') || (c.charAt(0) >= 'A' && c.charAt(0) <= 'Z')))
	   {
		   System.out.print("0\n");
		   continue;
	   }
	   for (int j = 1;c.charAt(j) != '\0';j++)
	   {
		  if (c.charAt(j) == '_' || (c.charAt(j) >= '0' && c.charAt(j) <= '9') || (c.charAt(j) >= 'a' && c.charAt(j) <= 'z') || (c.charAt(j) >= 'A' && c.charAt(j) <= 'Z'))
		  {
			  continue;
		  }
		  else
		  {
			  x = 0;
			  break;
		  }
	   }
	   System.out.printf("%d\n",x);
	}
	}

}

