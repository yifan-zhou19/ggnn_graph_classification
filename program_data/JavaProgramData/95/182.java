package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 final String a = "";
	 final String b = "";
	 int i;
	 int d;
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 for (i = 0;i < 80;i++)
	 {
	 if (a.charAt(i) < 91 && a.charAt(i)>64)
	 {
		 a.charAt(i) += 32;
	 }
	 if (b.charAt(i) < 91 && b.charAt(i)>64)
	 {
		 b.charAt(i) += 32;
	 }
	 }
	 d = strcmp(a,b);
	 if (d > 0)
	 {
		 System.out.print(">");
	 }
	 else if (d < 0)
	 {
		 System.out.print("<");
	 }
	 else
	 {
		 System.out.print("=");
	 }
	 return 0;
	}
}
