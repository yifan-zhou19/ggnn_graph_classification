package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	 String a = new String(new char[81]);
	a = new Scanner(System.in).nextLine();
	int j;
	int k;
	int L;
	L = 0;
	if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
	{
		  for (j = 0;a.charAt(j) != '\0';j++)
		  {
			 if (a.charAt(j) == '_' || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
			 {
			  continue;
			 }
			  else
			  {
				  L++;
				  break;
			  }
		  }
		   if (L != 0)
		   {
		   System.out.print("0\n");
		   }
		   else
		   {
		   System.out.print("1\n");
		   }
	}
	else
	{
	System.out.print("0\n");
	}
	}
	}

}

