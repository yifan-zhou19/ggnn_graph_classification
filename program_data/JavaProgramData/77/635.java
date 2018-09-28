package <missing>;

public class GlobalMembers
{
	// ????,remain??????????
	// flag????????
	public static void que(String c, int remain, char boy, char girl, int flag)
	{
		int i;
		for (; !c[flag].equals(girl); flag++)
		{
			; // ????????????
		}
		for (i = flag; !c[i].equals(boy); i--)
		{
			; // ???????
		}
		c[i] = null; // ?????0
		c[flag] = null;
		System.out.print(i);
		System.out.print(" ");
		System.out.print(flag);
		System.out.print("\n");
		remain -= 2;
		if (remain != 0) // ???????
		{
			que(c, remain, boy, girl, flag);
		}
	}

	public static int Main()
	{
		String c = new String(new char[100]);
		char boy;
		char girl;
		int remain;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		remain = c.length(); // ???
		boy = c.charAt(0); // ????????
		girl = c.charAt(remain - 1);
		que(c, remain, boy, girl, 0); // ?flag?0?????
		return 0;
	}



}

