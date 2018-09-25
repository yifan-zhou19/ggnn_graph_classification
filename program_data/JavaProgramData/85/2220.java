package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int p;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String str = new String(new char[22]);
	   for (i = 0;i < n;i++)
	   {
		  str = new Scanner(System.in).nextLine();
		  p = 0;
		  for (j = 0;str.charAt(j) != '\0';j++)
		  {
			 if (j == 0)
			 {
				if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z')
				{
					p++;
				}
				else if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z')
				{
					p++;
				}
				else if (str.charAt(j) == '_')
				{
					p++;
				}
				else
				{
					p = p;
				}
			 }
			 if (j != 0)
			 {
				if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z')
				{
					p++;
				}
				else if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z')
				{
					p++;
				}
				else if (str.charAt(j) == '_')
				{
					p++;
				}
				else if (str.charAt(j) >= '0' && str.charAt(j) <= '9')
				{
					p++;
				}
				else
				{
					p = p;
				}
			 }
		  }
		  if (p == j)
		  {
			  System.out.print("yes\n");
		  }
		  else
		  {
			  System.out.print("no\n");
		  }
	   }
	   return 0;
	}
}

