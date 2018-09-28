package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[257]);
		String sub = new String(new char[257]);
		String re = new String(new char[257]);
		int i;
		int j;
		int k;
		int n1;
		int n2;
		int n3;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		n1 = str.length();
		n2 = sub.length();
		n3 = re.length();
		for (i = 0;i <= n1 - n2;i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				int ll = 0;
				for (j = 0;j < n2;j++)
				{
					if (str.charAt(i + j) != sub.charAt(j))
					{
						ll = 1;
						break;
					}
					else
					{
						continue;
					}
				}
				if (ll == 0)
				{
					h = 1;
					for (k = 0;k < i;k++)
					{
						System.out.printf("%c",str.charAt(k));
					}
					for (k = 0;k < n3;k++)
					{
						System.out.printf("%c",re.charAt(k));
					}
					for (k = i + n2;k < n1;k++)
					{
						System.out.printf("%c",str.charAt(k));
					}
					break;
				}
				else
				{
					continue;
				}
			}
		}
		if (h == 0)
		{
			System.out.printf("%s",str);
		}
		return 0;
	}
}

