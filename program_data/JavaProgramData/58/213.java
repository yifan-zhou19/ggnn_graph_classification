package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int l;
		  int p1;
		  int p2;
		  int p3;
		  int p4;
		  int c = 2;
		  String a = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  System.in.read();
		  for (int i = 1;i <= n;i++)
		  {

				  a = new Scanner(System.in).nextLine();
				  l = a.length();
				  p1 = a.charAt(0) - '_';
				  p2 = a.charAt(0) - 'a';
				  p3 = a.charAt(0) - 'A';
				  if (p1 == 0 || (p2 <= 26 && p2 >= 0) || (p3 <= 26 && p3 >= 0))
				  {
								if (l >= 2)
								{
										for (int j = 1;j < l;j++)
										{
										p1 = a.charAt(j) - '_';
										p2 = a.charAt(j) - 'a';
										p3 = a.charAt(j) - 'A';
										p4 = a.charAt(j) - '0';
										if (p1 == 0 || p2 <= 26 && p2 >= 0 || p3 <= 26 && p3 >= 0 || p4 >= 0 && p4 <= 9)
										{
										c = 1;
										}
										else
										{
											c = 0;
											break;
										}
										}
								}
								else
								{
								System.out.print("1\n");
								}

				  }
				  if (c == 1)
				  {
					  System.out.print("1\n");
				  }
				  else
				  {
					  if (l != 1)
					  {
				  System.out.print("0\n");
					  }
				  }
				  c = 2;
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

