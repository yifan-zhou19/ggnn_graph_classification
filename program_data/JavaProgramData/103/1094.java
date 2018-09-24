package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String c = new String(new char[1000]);
		int[] b = new int[1000];
		int i;
		int j;
		int k;
		int h;
		for (i = 0;i < 1000;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		for (h = 0,j = 0;h < i;h++)
		{
			c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(h));
			if (a.charAt(h) == a.charAt(h + 1))
			{
				b[j]++;
			}
			else
			{
				j++;
			}
		}
		for (k = 0;k < j;k++)
		{
			System.out.printf("(%c,%d)",c.charAt(k),b[k] + 1);
		}
		return 0;
	}

}

