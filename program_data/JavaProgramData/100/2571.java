package <missing>;

public class GlobalMembers
{
	public static int l;
	public static int n;
	public static int[] a = new int[300];
	public static int t;
	public static String c = new String(new char[300]);
	public static String b = new String(new char[300]);
	public static char v;
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int p = 0;
	 c = new Scanner(System.in).nextLine();
	 l = c.length();
	 for (i = 0;i < l;i++)
	 {
		 n = 1;
		 if ((c.charAt(i) >= 'a' && c.charAt(i) <= 'z') || (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z'))
		 {
			 for (j = i + 1;j < l;j++)
			 {
			 if (c.charAt(j) == c.charAt(i))
			 {
			  n += 1;
			  c = tangible.StringFunctions.changeCharacter(c, j, ' ');
			 }
			 }
		  b = tangible.StringFunctions.changeCharacter(b, k, c.charAt(i));
		  a[k] = n;
		  k++;
		 p = 1;
		 }
	 }
	 for (i = 0;i < k - 1;i++)
	 {
		 for (j = 0;j < k - 1 - i;j++)
		 {
			 if (b.charAt(j) > b.charAt(j + 1))
			 {
				 v = b.charAt(j);
				 b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
				 b = tangible.StringFunctions.changeCharacter(b, j + 1, v);
			  t = a[j];
			  a[j] = a[j + 1];
			  a[j + 1] = t;
			 }
		 }
	 }
	 for (i = 0;i < k;i++)
	 {
		 System.out.printf("%c=%d\n",b.charAt(i),a[i]);
	 }
	 if (p == 0)
	 {
		 System.out.print("No");
	 }
	}
}

