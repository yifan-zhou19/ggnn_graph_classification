package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int[] a = new int[1000];
		int i;
		int n;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = 0;str.charAt(i) != '\0';i++)
		{
		if ((str.charAt(i) >= 97) && (str.charAt(i) <= 122))
		{
		str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
		}
		}
		for (n = 0;str.charAt(n) != '\0';n++)
		{

		if (str.charAt(n) == str.charAt(n + 1))
		{
		t = t + 1;
		}
		else
		{
		System.out.printf("(%c,%d)",str.charAt(n),t);
		t = 1;
		}
		}

	}


}

