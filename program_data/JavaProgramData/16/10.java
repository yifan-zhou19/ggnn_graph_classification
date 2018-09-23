package <missing>;

public class GlobalMembers
{
	public static void reverse(String s, int a, int b)
	{
		int i;
		int j;
		char temp;
		for (i = a,j = b - 1;i < j;i++,j--)
		{
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		for (i = a;i < b;i++)
		{
			System.out.printf("%c",s[i]);
		}
		System.out.print("\n");
	}

	public static void Main()
	{
		String string = new String(new char[10]);
		int len;
		String = new Scanner(System.in).nextLine();
		len = String.length();
		reverse(String, 0, len);
	}

}
