package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[266]);
		int i;
		int k;
		int len;
		int n;
		int m;
		int j = 0;
		String yuan = new String(new char[20]);
		String mb = new String(new char[20]);
		String kd = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			yuan = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			mb = tempVar3.charAt(0);
		}
		m = sz.length();
		n = yuan.length();
		for (i = 0;i < m;i++)
		{
			if (sz.charAt(i) != yuan.charAt(0))
			{
				System.out.printf("%c",sz.charAt(i));
			}
			else
			{
				for (k = i;k < i + n;k++)
				{
					kd = tangible.StringFunctions.changeCharacter(kd, k - i, sz.charAt(k));
				}
					kd = tangible.StringFunctions.changeCharacter(kd, n, '\0');

				if (strcmp(kd,yuan) == 0)
				{
					System.out.printf("%s",mb);
					for (k = i + n;k < m;k++)
					{
						 System.out.printf("%c",sz.charAt(k));
					}
				 break;

				}
				else
				{
					System.out.printf("%c",sz.charAt(i));
				}

			}

		}



		return 0;
	}

}

