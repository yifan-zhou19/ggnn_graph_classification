package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		String a = new String(new char[101]);
		String pa;
		a = new Scanner(System.in).nextLine();
		pa = a.charAt(0);
		len = a.length();
		i = 0;
		for (i = 0;i < len - 1;i++)
		{
			System.out.printf("%c",*(pa.Substring(i)) + *(pa.Substring(i) + 1));
		}
		System.out.printf("%c",(pa) + *(pa.Substring(len) - 1));
		return 0;
	}

}
