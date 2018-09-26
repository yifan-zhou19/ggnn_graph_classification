package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[111]);
		String b = new String(new char[111]);
		String ap = a;
		String bp = b;
		a = new Scanner(System.in).nextLine();
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: for(unsigned int i=0;i<=strlen(a)-2;i++)
		for (int i = 0;i <= a.length() - 2;i++)
		{
			*(bp.Substring(i)) = *(ap.Substring(i)) + *(ap.Substring(i) + 1);
		}
		*(bp + a.length() - 1) = *(ap + a.length() - 1) + (ap);
		*(bp + a.length()) = '\0';
		System.out.print(b);
		return 0;
	}

}
