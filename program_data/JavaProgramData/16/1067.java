package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]); //??
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int len = str.length();
		for (int i = len - 1; i >= 0; --i)
		{
			System.out.printf("%c", str.charAt(i));
		}
		System.out.print("\n"); //?????
	}
}

