package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int i;
		int j;
		int m = 0;
		String k = new String(new char[1001]);
		final String y = "abcdefghijklmnopqrstuvwxyz";
		final String z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] s = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = tempVar.charAt(0);
		}
		for (i = 0;i < k.length();i++)
		{
		for (j = 0;j < 26;j++)
		{
		if (k.charAt(i) == y.charAt(j))
		{
		k = tangible.StringFunctions.changeCharacter(k, i, z.charAt(j));
		}
		}
		}
		for (i = 0;i < k.length();i = i + n)
		{
		System.out.printf("(%c,",k.charAt(i));
		for (n = 0;n < (k.length() - i);n++)
		{
		if (k.charAt(i + n) == k.charAt(i))
		{
		m++;
		}
		else
		{
		break;
		}
		}
		System.out.printf("%d)",m);
		m = 0;
		}
	}

}

