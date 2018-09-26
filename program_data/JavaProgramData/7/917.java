package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[1000]);
		 String b = new String(new char[1000]);
		 String c = new String(new char[1000]);
		 int i;
		 int j;
		 int k;
		 int m;
		 int n;
		 int l;
		 int t;
		 a = new Scanner(System.in).nextLine();
		 b = new Scanner(System.in).nextLine();
		 c = new Scanner(System.in).nextLine();
		 m = a.length();
		 n = b.length();
		 l = c.length();
		 for (i = 0;i < m;i++)
		 {
			 k = 1;
			 if (a.charAt(i) == b.charAt(0))
			 {
				 k = 0;
				 t = i;
				 for (j = 1;j < n;j++)
				 {
					 if (a.charAt(i + j) != b.charAt(j))
					 {
						 k = 1;
					 }
				 }
			 }
			 if (k == 0)
			 {
				 for (j = 0;j < l;j++)
				 {
					 System.out.printf("%c",c.charAt(j));
				 }
				 for (i = t + l;i < m;i++)
				 {
					 System.out.printf("%c",a.charAt(i));
				 }
				 break;
			 }
			 if (k == 1)
			 {
				 System.out.printf("%c",a.charAt(i));
			 }
		 }
		 return 0;
	}

}
