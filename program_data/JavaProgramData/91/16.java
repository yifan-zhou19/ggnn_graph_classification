package <missing>;

public class GlobalMembers
{
	// zhizhen.cpp : Defines the entry point for the console application.
	//


	public static void Main(String[] args)
	{
		int i;
		String s = new String(new char[101]);
		String b = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		for (i = 0;i < len - 1;i++)
		{
			*(b.Substring(i)) = *(s.Substring(i)) + *(s.Substring(i) + 1);
		}
		*(b.Substring(len) - 1) = *(s.Substring(len) - 1) + *(s.Substring(0));
		for (i = 0;i < len;i++)
		{
			System.out.printf("%c",*(b.Substring(i)));
		}
	}


}
