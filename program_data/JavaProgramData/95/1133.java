package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s1 = new String(new char[80]);
	String s2 = new String(new char[80]);
	int n;
	int m;
	int s;
	int a;
	int b;
	s1 = new Scanner(System.in).nextLine();
	s2 = new Scanner(System.in).nextLine();
	for (n = 0,m = 0;s1.charAt(n) != '\0';n++)
	{
		a = n;
	if (s1.charAt(n) == s2.charAt(n) || s1.charAt(n) - s2.charAt(n) == 32 || s1.charAt(n) - s2.charAt(n) == -32)
	{
		m++,b = m;
	}
	if ((s1.charAt(n) > s2.charAt(n) && s1.charAt(n) - s2.charAt(n) > 32) || (s1.charAt(n) < s2.charAt(n) && s1.charAt(n) - s2.charAt(n)>-32))
	{
		System.out.print(">");
		break;
	}
	if ((s1.charAt(n) > s2.charAt(n) && s1.charAt(n) - s2.charAt(n) < 32) || (s1.charAt(n) < s2.charAt(n) && s1.charAt(n) - s2.charAt(n) < -32))
	{
		System.out.print("<");
		break;
	}
	}
	if (a == b - 1)
	{
		System.out.print("=");
	}
	return 0;
	}
}
