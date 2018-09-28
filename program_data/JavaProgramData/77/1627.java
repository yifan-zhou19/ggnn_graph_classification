package <missing>;

public class GlobalMembers
{
	public static String queen = new String(new char[1000]);
	public static int Main()
	{
		queen = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = queen.length();
		char a;
		char b;
		int cnt = 0;
		int[] boy = new int[1000];
		a = queen.charAt(0);
		b = queen.charAt(len - 1);
		for (int i = 0; i < len; i++)
		{
			if (queen.charAt(i) == a)
			{
				boy[cnt] = i;
				cnt++;
			}
			if (queen.charAt(i) == b)
			{
				cnt--;
				System.out.print(boy[cnt]);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (EOF != System.in.read())
		{
			;
		}
		return 0;
	}
}

