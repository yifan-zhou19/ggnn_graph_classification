package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String yuanchuan = new String(new char[257]);
		String zichuan = new String(new char[257]);
		String replacement = new String(new char[257]);
		int i;
		int j;
		int k;
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yuanchuan = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zichuan = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}
		len1 = yuanchuan.length();
		len2 = zichuan.length();
		k = len1;
		for (i = 0;i < len1 - len2 + 1;i++)
		{
			for (j = 0;j < len2;j++)
			{
				if (yuanchuan.charAt(i + j) != zichuan.charAt(j))
				{
					break;
				}
				if (j == len2 - 1)
				{
					k = i;
				}
			}
			if (k != len1)
			{
				break;
			}
		}
		if (k == len1)
		{
			System.out.printf("%s",yuanchuan);
		}
		else
		{
			for (i = 0;i < k;i++)
			{
				System.out.printf("%c",yuanchuan.charAt(i));
			}
			System.out.printf("%s",replacement);
			for (i = k + len2;i < len1;i++)
			{
				System.out.printf("%c",yuanchuan.charAt(i));
			}
		}
		return 0;
	}
}

