package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String mubiao = new String(new char[N]);
		char h;
		String zichuan = new String(new char[N]);
		String replace = new String(new char[N]);
		int i;
		int x;
		int j = 0;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			mubiao = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zichuan = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replace = tempVar3.charAt(0);
		}
		int a = mubiao.length();
		int b = zichuan.length();
		for (i = 0;i < a;i++)
		{
			if (mubiao.charAt(i) == zichuan.charAt(j))
			{
				j++;
			}
			else
			{
				j = 0;
			}
			if (j == b)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 1)
		{
		for (j = b - 1;j >= 0;j--)
		{
			h = replace.charAt(j);

			mubiao = tangible.StringFunctions.changeCharacter(mubiao, i, h);
			i--;
		}
		}
		System.out.printf("%s\n",mubiao);
		return 0;
	}
}

