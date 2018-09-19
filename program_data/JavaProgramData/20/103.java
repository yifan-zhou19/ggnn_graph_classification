package <missing>;

public class GlobalMembers
{
	public static void chen()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		k = str.length();
		for (i = str.length() - 1;i >= 0;i--)
		{
			if (str.charAt(i) >= str.charAt(k - 1))
			{
				k = i + 1;
			}
		}
		if (str.length() > 10 || substr.length() > 3)
		{
			return;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%s",substr);
		for (i = k;i < str.length();i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		chen();
	}
	public static void Main()
	{
		chen();
	}
}

