package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String zf = new String(new char[53]);
		String e = new String(new char[2]);
		int[] sz = new int[800];
		int i;
		int j = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = 0;i < 800;i++)
		{
			sz[i] = 0;
		}

		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
			{
				zf = tangible.StringFunctions.changeCharacter(zf, j, str.charAt(i));
				sz[str.charAt(i)]++;
				j++;

			}

		}



		for (k = 1;k < j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
				if (zf.charAt(i) > zf.charAt(i + 1))
				{
					e = tangible.StringFunctions.changeCharacter(e, 0, zf.charAt(i + 1));
					zf = tangible.StringFunctions.changeCharacter(zf, i + 1, zf.charAt(i));
					zf = tangible.StringFunctions.changeCharacter(zf, i, e.charAt(0));
				}
			}
		}

		if (j == 0)
		{
			System.out.print("No\n");

		}
		else
		{
			for (i = 0;i < j;i++)
			{
				if ((i != 0) && (zf.charAt(i - 1) == zf.charAt(i)))
				{
					continue;
				}
				System.out.printf("%c=%d\n",zf.charAt(i),sz[zf.charAt(i)]);
			}
		}


	 return 0;
	}
}

