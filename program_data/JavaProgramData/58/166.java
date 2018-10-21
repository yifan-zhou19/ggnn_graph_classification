package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int l;
		  int x = 1;
		  String c = new String(new char[1000]);
		  String s = new String(new char[10]);
		  s = new Scanner(System.in).nextLine();
		  n = Integer.parseInt(s);
		  for (i = 0;i < n;i++)
		  {
			  c = new Scanner(System.in).nextLine();
			  l = c.length();
			  for (j = 0;j < l;j++)
			  {
							  if (j == 0)
							  {
									  if (c.charAt(0) == '_' || (c.charAt(0) >= 'a' && c.charAt(0) <= 'z') || (c.charAt(0) >= 'A' && c.charAt(0) <= 'Z'))
									  {
									  x = 1;
									  }
							  else
							  {
								  x = 0;
								  break;
							  }
							  }
							  else if (c.charAt(j) == '_' || (c.charAt(j) >= 'a' && c.charAt(j) <= 'z') || (c.charAt(j) >= 'A' && c.charAt(j) <= 'Z') || (c.charAt(j) >= '1' && c.charAt(j) <= '9') || c.charAt(j) == '0')
							  {
							  x = 1;
							  }
							  else
							  {
								  x = 0;
								  break;
							  }
			  }
			  if (x == 0)
			  {
			  System.out.print("0\n");
			  }
			  else
			  {
			  System.out.print("1\n");
			  }
		  }
		  System.in.read();
		  System.in.read();
	}

}
