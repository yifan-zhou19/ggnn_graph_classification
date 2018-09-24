package <missing>;

public class GlobalMembers
{
	public static int Main() //???????????
	{
		String ch = new String(new char[10]);
		int n = 0;
		while ((ch[n] = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
			n++;
		}
		for (int i = n - 1;i >= 0;i--)
		{
			System.out.print(ch.charAt(i));
		}
		return 0;
	}
}

