package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 double c;
	 double f = 0;
	 int d;
	 int e;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 c = Double.parseDouble(tempVar);
	 }
	 String a = new String(new char[100]);
	 String b = new String(new char[100]);
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
	 d = a.length();
	 e = b.length();
	 if (d != e)
	 {
		 System.out.print("error");
	 }
	 else
	 {
		 for (i = 0;i < d;i++)
		 {
			 if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
			 {
				 System.out.print("error");
				 return 0;
			 }
			 else
			 {
				 if (a.charAt(i) == b.charAt(i))
				 {
					 f++;
				 }
			 }
		 }
		 if (f / e >= c)
		 {
			 System.out.print("yes");
		 }
		 else
		 {
			 System.out.print("no");
		 }
	 }
	 return 0;

	}




}

