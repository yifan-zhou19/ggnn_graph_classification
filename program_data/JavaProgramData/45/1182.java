package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
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
		for (i = 0;b.charAt(i) != 0;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				flag = 0;
				for (j = 0;a.charAt(j) != 0 && b.charAt(j) != 0;j++)
				{
					if (a.charAt(j) != b.charAt(i + j))
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					System.out.printf("%d\n",i);
					break;
				}
			}
		}
		return 0;
	}
}

