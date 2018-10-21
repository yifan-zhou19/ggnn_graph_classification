package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		String p1 = str1;
		String p2 = str2;
		int i = 1;
		str1 = new Scanner(System.in).nextLine();
		while (*(p1.Substring(i)))
		{
			*(p2.Substring(i) - 1) = *(p1.Substring(i)) + *(p1.Substring(i) - 1);
			i++;
		}
		*(p2.Substring(i) - 1) = *(p1.Substring(0)) + *(p1.Substring(i) - 1);
		*(p2.Substring(i)) = '\0';
		System.out.printf("%s",p2);
		return 0;

	}
}
