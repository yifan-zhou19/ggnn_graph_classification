package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[51]);
		String b = new String(new char[51]);
		int i;
		int j = 0;
		int flag = 0;
		int p;
		int l1;
		int l2;
		int k;
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
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l2;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				k = i;
				while (a.charAt(j) != '\0')
				{
					if (b.charAt(k++) != a.charAt(j))
					{
						flag = 1;
						break;
					}
					j++;
				}
				if (flag == 0)
				{
					p = i;
					break;
				}
			}
		}

		System.out.printf("%d",p);
	}

}

