package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int k;
		int m;
		int n;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n = a.length();
		m = b.length();
		for (i = 0;i < m;++i)
		{
			for (j = 0;j < n && j + i < m;++j)
			{
				flag = 1;
				if (a.charAt(j) != b.charAt(i + j))
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				break;
			}
		}
		System.out.printf("%d",i);
		return 0;
	}


}

