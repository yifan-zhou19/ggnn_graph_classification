package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int i;
	 int j;
	 int f;
	 int e;
	 int d;
	 int k;
	 int[] q = new int[10000];
	 int[] p = new int[10000];
	 double r;
	 double n;
	 String s = new String(new char[10000]);
	 String w = new String(new char[100000]);
	 e = 0;
	 k = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Double.parseDouble(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 s = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 w = tempVar3.charAt(0);
	 }
	 m = s.length();
	 k = w.length();
	 for (i = 0;i < m;i++)
	 {

		 if (s.charAt(i) != 'A' && s.charAt(i) != 'G' && s.charAt(i) != 'C' && s.charAt(i) != 'T')
		 {
			 System.out.print("error");
			 break;
		 }
		 if (w.charAt(i) != 'A' && w.charAt(i) != 'G' && w.charAt(i) != 'C' && w.charAt(i) != 'T')
		 {
			 System.out.print("error");
			 break;
		 }
		 if (k != m)
		 {
			 System.out.print("error");
			 break;
		 }
		 if (s.charAt(i) == w.charAt(i))
		 {
			 e++;
		 }
		 if (i == m - 1)
		 {
			 r = e * 1.0 / m;
			 if (r >= n)
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

