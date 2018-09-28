package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[5]);
		char a;
		int i;
		int n = 0;
		for (i = 0; (ch[i] = System.in.read()) != '\n'; i++)
		{
				n++;
		}
		for (i = n - 1; i >= 0; i--)
		{
		System.out.printf("%c", ch.charAt(i));
		}
		return 0;
	}
}
