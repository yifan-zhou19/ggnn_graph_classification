package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int p;
		String zichuan = new String(new char[257]);
		String danci = new String(new char[257]);
		String tihuan = new String(new char[257]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			danci = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zichuan = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			tihuan = tempVar3.charAt(0);
		}
		int n = zichuan.length();
		p = 0;
		for (i = 0;danci.charAt(i) != 0;i++)
		{
			if (p == 1)
			{
				break;
			}
			if (danci.charAt(i) == zichuan.charAt(0))
			{
				for (j = 1;j < n;j++)
				{
					if (danci.charAt(i + j) != zichuan.charAt(j))
					{
						break;
					}
					else
					{
						p = 1;
						m = i;
						break;
					}
				}
			}
		}
		if (p == 1)
		{
			for (i = m;i < m + n;i++)
			{
				danci = tangible.StringFunctions.changeCharacter(danci, i, tihuan.charAt(i - m));
			}
		System.out.printf("%s\n",danci);
		}
		else
		{
			System.out.printf("%s",danci);
		}
		return 0;
	}
}

