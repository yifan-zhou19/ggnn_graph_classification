package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  System.in.read();
		  for (i = 1;i <= n;i++)
		  {
				 String a = new String(new char[1000]);
				 int l;
				 int j;
				 int k;
				a = new Scanner(System.in).nextLine();
				l = a.length();
				if ((a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z'))
				{
				   for (k = 1;k < l;k++)
				   {
				   if (a.charAt(k) >= 'A' && a.charAt(k) <= 'Z')
				   {
					   ;
				   }
				   else if (a.charAt(k) >= '0' && a.charAt(k) <= '9')
				   {
					   ;
				   }
				   else if (a.charAt(k) == '_')
				   {
					   ;
				   }
				   else if (a.charAt(k) >= 'a' && a.charAt(k) <= 'z')
				   {
					   ;
				   }
				   else
				   {
					 break;
				   }
				   }



				  if (k == l)
				  {
				  System.out.print("1\n");
				  }
				  else
				  {
				   System.out.print("0\n");
				  }
				}
			   else
			   {
			   System.out.print("0\n");
			   }
		  }
	}

}

