package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  int m;
		  int l;
		  String a = new String(new char[80]);
		  String v = new String(new char[10]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  v = new Scanner(System.in).nextLine();
		  for (i = 0;i < n;i++)
		  {
			  j = 0;
			  a = new Scanner(System.in).nextLine();
			//puts(a);
			  if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			  {
				  l = a.length();
				  for (j = 0;j < l;j++)
				  {
				  if (a.charAt(j) == '_' || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
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
			  else
			  {
			  System.out.print("0\n");
			  }

			  if (j == l)
			  {
			  System.out.print("1\n");
			  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

