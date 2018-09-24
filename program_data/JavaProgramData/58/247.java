package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String q = new String(new char[10]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   q = new Scanner(System.in).nextLine();
	   for (int j = 0;j < n;j++)
	   {
				String s = new String(new char[80]);

				int num = 0;
				int a = 0;
				s = new Scanner(System.in).nextLine();

				int len = s.length();
				for (int i = 0;i < len;i++)
				{
					   if ((s.charAt(i) < '0') || ((s.charAt(i)>'9') && (s.charAt(i) < 'A')) || ((s.charAt(i) >'Z') && (s.charAt(i) < 'a')) || (s.charAt(i)>'z'))
					   {
								  if (s.charAt(i) != '_')
								  {
									  System.out.print("0\n");
									  a = 1;
									  break;
								  }
					   }
				}
					   if (a == 0)
					   {
							  for (int i = 0;i < 26;i++)
							  {
									  if ((s.charAt(0) == 'a' + i) || (s.charAt(0) == 'A' + i))
									  {

													  System.out.print("1\n");
													  num = 1;
									  }
							  }
							  if (s.charAt(0) == '_')
							  {
										 System.out.print("1\n");
										 num = 1;
							  }
					   }



					  if (num == 0 && a != 1)
					  {
						  System.out.print("0\n");
					  }
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();

	}
}

