package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void qp(char * p,int n);
	String a = new String(new char[105]);
	int l;
	a = new Scanner(System.in).nextLine();
	l = a.length();
tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	qp(tempRef_a, l);
	a = tempRef_a.argValue;
	System.out.printf("%c\n",a.charAt(0) + a.charAt(l - 1));
	}
	public static void qp(tangible.RefObject<String> p, int n)
	{
		if (n >= 2)
		{
			System.out.printf("%c", p.argValue + p.argValue.charAt(1));
			n--;
	qp(p.argValue.Substring(1), n);
		}
	}

}

