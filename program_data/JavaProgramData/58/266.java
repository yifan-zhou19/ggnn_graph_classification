package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		 for (i = 0;i < n;i++)
		 {
						t = 1;
						 String c = new String(new char[1000]);
						 c = new Scanner(System.in).nextLine();
						int l;
						l = c.length();
					   if (c.charAt(0) >= '0' && c.charAt(0) <= '9')
					   {
							System.out.print("0\n");
					   }
						else
						{
						  for (int j = 0;j < l;j++)
						  {
							   if (c.charAt(j) != '_' && (c.charAt(j) < 'a' || c.charAt(j)>'z') && (c.charAt(j) < 'A' || c.charAt(j)>'Z') && (c.charAt(j) < '0' || c.charAt(j)>'9'))
							   {
										  System.out.print("0\n");
										  t = 0;
										  break;
							   }
						  }
						  if (t == 1)
						  {
						  System.out.print("1\n");
						  }
						}
		//getchar();
		 }
	}
}

