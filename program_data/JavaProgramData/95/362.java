package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		String p;
		String q;
	 s1 = new Scanner(System.in).nextLine();
	 s2 = new Scanner(System.in).nextLine();
	 p = s1;
	 q = s2;
	 int i;
	 for (i = 0; * (p.Substring(i)) != '\0';i++)
	 {
	 if ('a' <= *(p.Substring(i)) && *(p.Substring(i)) <= 'z')
	 {
		*(p.Substring(i)) = *(p.Substring(i)) - 32;
	 }
	 }
	 for (i = 0; * (q.Substring(i)) != '\0';i++)
	 {
	 if ('a' <= *(q.Substring(i)) && *(q.Substring(i)) <= 'z')
	 {
		*(q.Substring(i)) = *(q.Substring(i)) - 32;
	 }
	 }
	 int t = strcmp(s1,s2);
	 if (t > 0)
	 {
	 System.out.print(">");
	 }
	 else if (t < 0)
	 {
	 System.out.print("<");
	 }
	 else if (t == 0)
	 {
	 System.out.print("=");
	 }
	return 0;
	}

}
