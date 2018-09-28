package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[100]);
		int[] boy = new int[100];
		int[] girl = new int[100];
		int i;
		int j;
		int k = 0;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		r = c.length();
		for (i = 0;i < r;i++)
		{
			if (c.charAt(i) != c.charAt(0))
			{
				girl[k] = i;
				for (j = i - 1;j >= 0;j--)
				{
					if (c.charAt(j) == c.charAt(0))
					{
						boy[k] = j;
						break;
					}
				}
				c = tangible.StringFunctions.changeCharacter(c, j, '0');
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d %d\n",boy[i],girl[i]);
		}
	}

}

