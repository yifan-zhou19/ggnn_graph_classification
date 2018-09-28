package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1;
		String p1;
		String str2 = new String(new char[100]);
		String p2;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		str1 = new Scanner(System.in).nextLine();
		p1 = str1;
		p2 = str2;
		n = str1.length();
		for (i = 0;i < n - 1;i++)
		{
			*(p2.Substring(i)) = (char)(*(p1.Substring(i)) + *(p1.Substring(i) + 1));
		}
		*(p2.Substring(n) - 1) = (char)(*(p1.Substring(n) - 1) + p1);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",*(p2.Substring(i)));
		}
		return 0;
	}

}
