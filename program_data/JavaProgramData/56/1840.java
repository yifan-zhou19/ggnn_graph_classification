package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int b;
	int c;
	int n;
	int i;
	String a = new String(new char[5]);
	a = new Scanner(System.in).nextLine();
	b = a.length();

	for (i = b - 1;i >= 0;i--)
	{
		System.out.printf("%c",a.charAt(i));
	}
	System.in.read();


	}
}
