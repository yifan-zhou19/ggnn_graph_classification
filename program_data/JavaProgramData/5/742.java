package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k = 0;
	 double m;
	 double n;
	 double s;
	 String a = new String(new char[500]);
	 String b = new String(new char[500]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Double.parseDouble(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = tempVar3.charAt(0);
	 }
	 if (a.length() == b.length())
	 {


	 for (i = 0,j = 0;i < a.length();i++)
	 {
								  if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
								  {
																																k = 1;

								  }
																																 else
																																 {

							  if (a.charAt(i) == b.charAt(i))
							  {
											j++;
							  }
																																 }
	 }
											if (k == 0)
											{

											n = 0.1 * a.length();
											 s = j * 0.1 / n;
											 if (s > m)
											 {
													 System.out.print("yes");
											 }
													 else
													 {
														   System.out.print("no");
													 }
											}
														   else
														   {
																 System.out.print("error");
														   }
	 }
																 else
																 {
																 System.out.print("error");
																 }
	return 0;
	}

}

