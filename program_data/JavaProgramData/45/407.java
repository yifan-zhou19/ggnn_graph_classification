package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int len1;
		int len2;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		String p;
		p = a.charAt(0);
		String q;
		q = b.charAt(0);
		for (i = 0;i < len2;i++)
		{
			flag = 0;
			if (b.charAt(i) == p)
			{
				q = b.charAt(i);
				for (j = 0;j < len1;j++)
				{
					if (*(p.Substring(j)) != *(q.Substring(j)))
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
		return 0;
	}
}

