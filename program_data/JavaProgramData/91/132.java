package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		String a = new String(new char[300]);
		char b;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		b = a.charAt(0);
		for (i = 0;i < n - 1;i++)
		{
			*(a.Substring(i)) = *(a.Substring(i)) + *(a.Substring(i) + 1);
		}
		*(a.Substring(n) - 1) = *(a.Substring(n) - 1) + b;
		System.out.println(a);
	}


}
