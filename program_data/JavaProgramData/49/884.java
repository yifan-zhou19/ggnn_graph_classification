package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 String a = new String(new char[500]);
	 int m;
	 int i;
	 int q;
	 int k;
	 int p;
	 int n;
	 for (i = 0;i < 500;i++)
	 {
		 String tempVar = ConsoleInput.scanfRead(null, 1);
		 if (tempVar != null)
		 {
			 a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
		 }
		 if (a.charAt(i) == '\n')
		 {
			 break;
		 }
	 }
	 n = i;
	 for (m = 2;m <= n;m++)
	 {
		 for (i = 0;i < n - m + 1;i++)
		 {
			 for (q = 0;q < m - 1;q++)
			 {
				 if (a.charAt(i + q) != a.charAt(i + m - 1 - q))
				 {
					 p = p + 1;
				 }
			 }
			 if (p == 0)
			 {
				 for (k = i;k < i + m;k++)
				 {
					 System.out.printf("%c",a.charAt(k));
				 }
			 System.out.print("\n");
			 }
			 p = 0;
		 }
	 }
	 return 0;
	 }

}

