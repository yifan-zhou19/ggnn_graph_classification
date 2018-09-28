package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int x;
		  int y = 0;
		  String str = new String(new char[85]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  System.in.read();
		  for (i = 0;i < n;i++)
		  {
					str = new Scanner(System.in).nextLine();
					x = str.length();
					if (x > 1 && (str.charAt(0) == '_' || (str.charAt(0) > 64 && str.charAt(0) < 91) || (str.charAt(0)>96 && str.charAt(0) < 123)))
					{
					 for (j = 1;j < x;j++)
					 {
								if (str.charAt(j) == '_' || (str.charAt(j) > 64 && str.charAt(j) < 91) || (str.charAt(j)>96 && str.charAt(j) < 123) || (str.charAt(j)>47 && str.charAt(j) < 58))
								{
								y = 1;
								}
								else
								{
									y = 0;
									break;
								}
					 }
					}
					 else if (x == 1 && (str.charAt(0) == '_' || (str.charAt(0) > 64 && str.charAt(0) < 91) || (str.charAt(0)>96 && str.charAt(0) < 123)))
					 {
					 y = 1;
					 }
					 if (y == 0)
					 {
								 System.out.print("0\n");
					 }
					else
					{
					System.out.print("1\n");
					}
					y = 0;
		  }
	}


}

