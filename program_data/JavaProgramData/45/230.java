package <missing>;

public class GlobalMembers
{
	public static int mystrcmp(tangible.RefObject<String> str1, tangible.RefObject<String> str2, int lens)
	{
		for (int i = 0;i < lens;i++)
		{
				if (*(str1.argValue.Substring(i)) != *(str2.argValue.Substring(i)))
				{
					return 0;
				}
		}
		return 1;
	}

	public static int Main()
	{
		String big = new String(new char[50]);
		String small = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			small = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			big = tempVar2.charAt(0);
		}
		int l = small.length();
		for (int k = 0;k < big.length() - l + 1;k++)
		{
			tangible.RefObject<String> tempRef_small = new tangible.RefObject<String>(small);
				if (mystrcmp(big.Substring(k), tempRef_small, l) != 0)
				{
					small = tempRef_small.argValue;
					System.out.printf("%d\n",k);
					return 0;
				}
				else
				{
					small = tempRef_small.argValue;
				}
		}

		System.out.print("String Not Found");

	}
}

