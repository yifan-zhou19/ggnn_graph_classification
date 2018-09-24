package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
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
		for (i = 1;;i++)
		{
			if (a.charAt(i) == '\0')
			{
				m = i;
				break;
			}
		}
		for (i = 1;;i++)
		{
			if (b.charAt(i) == '\0')
			{
				n = i;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			flag = 0;
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = 0;j < m;j++)
				{
					if (b.charAt(i + j) == a.charAt(j))
					{
						flag++;
					}
					else
					{
						break;
					}
				}
				if (flag == m)
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
	}


}

