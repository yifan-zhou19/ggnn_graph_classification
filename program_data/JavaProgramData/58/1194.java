package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  String a = new String(new char[90]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String s = new String(new char[2]);
		  s = new Scanner(System.in).nextLine();
		  for (i = 0;i < n;i++)
		  {
						  a = new Scanner(System.in).nextLine();
						   j = a.length();
						   for (k = 0;k < j;k++)
						   {
										   if (k == 0)
										   {
												  if (a.charAt(k) == '_' || (a.charAt(k) >= 'a' && a.charAt(k) <= 'z') || (a.charAt(k) >= 'A' && a.charAt(k) <= 'Z'))
												  {
												  continue;
												  }
												  else
												  {
													   System.out.print("0\n");
													   break;
												  }
										   }
										   else
										   {
												if (a.charAt(k) == '_' || (a.charAt(k) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(k) >= 'A' && a.charAt(k) <= 'Z') || (a.charAt(k) >= '0' && a.charAt(k) <= '9'))
												{
												continue;
												}
												else
												{
													System.out.print("0\n");
													break;
												}
										   }

						   }
						   if (k == j)
						   {
						   System.out.print("1\n");
						   }
		  }
		  System.in.read();
		  System.in.read();
	}
}

