package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int p;
		String zichuan = new String(new char[100]);
		String danci = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zichuan = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			danci = tempVar2.charAt(0);
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
						System.out.printf("%d",m);
						break;
					}
				}
			}
		}
		return 0;
	}
}

