package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[200]);
	int i;
	int n;
	a = new Scanner(System.in).nextLine();
	n = a.length();
	*(a.Substring(n)) = *a;
	for (i = 0;i < n;i++)
	{
	System.out.printf("%c",*(a.Substring(i)) + *(a.Substring(i) + 1));
	}

	return 0;
	}

}
