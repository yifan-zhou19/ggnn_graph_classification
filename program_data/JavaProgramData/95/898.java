package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int A;
	int B;
	int min;
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	for (i = 0;i < 100;i++)
	{
		if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		{
			a.charAt(i) -= 32;
		}
	if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
	{
		b.charAt(i) -= 32;
	}
	}
	A = a.length();
	B = b.length();
	min = (A > B)?B:A;
	for (i = 0;i < min;i++)
	{
		if (a.charAt(i) > b.charAt(i))
		{
			System.out.print(">");
			break;
		}
	else if (a.charAt(i) < b.charAt(i))
	{
		System.out.print("<");
		break;
	}
	}
	if (i >= min)
	{
		if (B > A)
		{
			System.out.print("<");
		}
	else if (B < A)
	{
		System.out.print(">");
	}
	else
	{
		System.out.print("=");
	}
	}
	return 0;
	}
}
