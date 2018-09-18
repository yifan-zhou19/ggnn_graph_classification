package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[5]);
		int i;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}

		len = num.length();
		for (i = len - 1;i >= 0;i--)
		{
			System.out.printf("%c",num.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}

