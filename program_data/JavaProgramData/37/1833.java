package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int cycle;
		int i;
		int j;
		int l;
		int k;
		String s = new String(new char[100000]);
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (cycle = 1;cycle <= t;cycle++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,100 * (Character.SIZE / Byte.SIZE));
			k = 0;
			for (i = 0;i <= l - 1;i++)
			{
				for (j = 0;j < k;j++)
				{
					if (s.charAt(i) == c.charAt(j))
					{
						break;
					}
				}
				if (j < k)
				{
					continue;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, k, s.charAt(i));
					k++;
					for (j = i + 1;j <= l - 1;j++)
					{
						if (s.charAt(j) == s.charAt(i))
						{
							break;
						}
					}
					if (j == l)
					{
						break;
					}
				}
			}
			if (i < l)
			{
				System.out.printf("%c\n",s.charAt(i));
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

