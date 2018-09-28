package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int q = 0;
	 double n;
	 double A;
	 double B;
	 double p = 0.0;
	 String a = new String(new char[500]);
	 String b = new String(new char[500]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Double.parseDouble(tempVar);
	 }
	 char c = System.in.read();
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 A = a.length();
	 B = b.length();
	if (A != B)
	{
	  System.out.print("error");
	}
	 if (A == B)
	 {
	  for (i = 0;i < A;i++)
	  {
	   if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
	   {
		q = 1;
		System.out.print("error");
		break;
	   }
	  }
			if (q == 0)
			{
	   for (i = 0;i < A;i++)
	   {
		   if (a.charAt(i) == b.charAt(i))
		   {
			p += 1.0;
		   }
	   }
	   if ((p / A) > n)
	   {
		System.out.print("yes");
	   }
				else
				{
		System.out.print("no");
				}
			}
	 }

	 return 0;
	}
}

