package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		char charCurrent;
		char charNext;
		charCurrent = charNext = Character.toUpperCase(str.charAt(0));
		int count = 0;
		for (int i = 0; str.charAt(i) != '\0'; i++)
		{
			charCurrent = Character.toUpperCase(str.charAt(i));
			if (str.charAt(i + 1) == '\0')
			{
				if (charCurrent == charNext)
				{
					count++;
				}
				break;
			}
			charNext = Character.toUpperCase(str.charAt(i + 1));
			if (Character.toUpperCase(str.charAt(i + 1)) == Character.toUpperCase(str.charAt(i)))
			{
				count++;
			}
			else
			{
				System.out.printf("(%c,%d)",charCurrent,count + 1);
				count = 0;
			}
		}
		System.out.printf("(%c,%d)",charCurrent,count);
		return 0;
	}
}

