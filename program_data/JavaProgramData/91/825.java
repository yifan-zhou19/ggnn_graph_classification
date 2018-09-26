package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
	int n;
	int i;
	a = new Scanner(System.in).nextLine();
	n = a.length();
	String p = a;
	String q = b;

	for (i = 0;i < n - 1;i++)
	{
	*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
	}
	*(q.Substring(n) - 1) = *(p.Substring(n) - 1) + p;
	for (i = 0;i < n;i++)
	{
	System.out.printf("%c",*(q.Substring(i)));
	}
	return 0;
	}


}
