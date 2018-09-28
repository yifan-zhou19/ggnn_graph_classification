package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int l;
	 int i;
	 String a = new String(new char[100]);
	 String p;
	 p = a;
	 a = new Scanner(System.in).nextLine();
	 l = p.length();
	 for (i = 0;i < l - 1;i++)
	 {
	   System.out.printf("%c",*(p.Substring(i)) + *(p.Substring(i) + 1));
	 }
	 System.out.printf("%c", p + *(p.Substring(l) - 1));
	}
}
