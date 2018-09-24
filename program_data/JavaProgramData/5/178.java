package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String b = new String(new char[600]);
		String c = new String(new char[600]);
		System.in.read();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int d;
		int e;
		int f;
		int g;
		int h = 0;
		d = b.length();
		e = c.length();
		if (d != e)
		{
				 System.out.print("error");
		}
		else
		{
			 for (int i = 0;i <= d - 1;i++)
			 {
					 if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
					 {
																	f = 1;
					 }
																	 if (c.charAt(i) != 'A' && c.charAt(i) != 'G' && c.charAt(i) != 'C' && c.charAt(i) != 'T')
																	 {
																	g = 1;
																	 }
			 }
			 if (f == 1 || g == 1)
			 {
							System.out.print("error");
			 }
			 else
			 {
				  for (int i = 0;i <= d - 1;i++)
				  {
						  if (b.charAt(i) == c.charAt(i))
						  {
										 h++;
						  }
				  }
					   //   printf("%lf",1.0*h/a);
				  if (1.0 * h / d > a)
				  {
								System.out.print("yes");
				  }
				  else
				  {
					   System.out.print("no");
				  }
			 }
		}
		int y;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
				 return 0;
	}


}

