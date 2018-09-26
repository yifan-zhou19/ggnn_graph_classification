package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[500]);
		 String b = new String(new char[500]);
		 double n;
		 double c = 0;
		 double d;
		 double l;
		 double k;
		 int i;
		 int h = 0;

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Double.parseDouble(tempVar);
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
		 l = a.length();
		 k = b.length();

		 for (i = 0;i < l;i++)
		 {
			 if (k != l || a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G' || b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			 {

				 System.out.print("error");
				 h = 1;
				 break;
			 }
			 else if (a.charAt(i) == b.charAt(i))
			 {
				 c = c + 1;
			 }
		 }
		 d = c / l;
		 if (d > n)
		 {
			 System.out.print("yes");
		 }
		 else if (h == 0 && d <= n)
		 {
			 System.out.print("no");
		 }
		 return 0;
	}
}

