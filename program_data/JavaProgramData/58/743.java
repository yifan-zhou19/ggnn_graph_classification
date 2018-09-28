package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int d = 0;
		  String a = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  System.in.read();
		  for (i = 0;i < n;i++)
		  {
			  a = new Scanner(System.in).nextLine();
			  if (a.charAt(0) != '_' && ((a.charAt(0) < 'a' && a.charAt(0)>'Z') || a.charAt(0) > 'z' || a.charAt(0) < 'A'))
			  {
					 System.out.print("0\n");
					 continue;
			  }
			  for (j = 0;a.charAt(j) != '\0';j++)
			  {
			  if (a.charAt(j) == '_' || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || ('0' <= a.charAt(j) && a.charAt(j) <= '9'))
			  {
				 d = 1;
			  }
			  else
			  {
				  d = 0;
				  break;
			  }
			  }
			  System.out.printf("%d\n",d);
		  }
		  System.in.read();
		  System.in.read();
	}




}

