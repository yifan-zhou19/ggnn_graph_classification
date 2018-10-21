package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		int i = 0;
		int b;
		int c = 0;
		int e = 0;
		int f;
		String x = new String(new char[600]);
		String y = new String(new char[600]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Double.parseDouble(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 x = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 y = tempVar3.charAt(0);
		 }
		 b = x.length();
		 f = y.length();
		 if (b == f)
		 {
		   for (i = 0;i < b;i++)
		   {
			   if ((x.charAt(i) != 'A' && x.charAt(i) != 'T' && x.charAt(i) != 'G' && x.charAt(i) != 'C') || (y.charAt(i) != 'A' && y.charAt(i) != 'T' && y.charAt(i) != 'G' && y.charAt(i) != 'C'))
			   {
				  System.out.print("error");
				  e = 1;

				  break;
			   }
			   if (x.charAt(i) == y.charAt(i))
			   {
				  c++;
			   }

		   }
		   if (e == 0)
		   {

			if (c * 1.000 / b >= a)
			{
			   System.out.print("yes");
			}
			else
			{
			   System.out.print("no");
			}
		   }
		 }
		 else
		 {
			 System.out.print("error");
		 }
		 return 0;
	}
}

