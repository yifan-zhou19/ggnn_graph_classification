package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[505]);
		String b = new String(new char[505]);
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
		int len1 = a.length();
		int len2 = b.length();
		int i;
		int j;
		int k = 0;
		for (i = 0;i < len2;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = 0;j < len1;j++)
				{
					if (a.charAt(j) == b.charAt(i + j))
					{
					   k++;
					}
				}
				if (k == len1)
				{
					System.out.printf("%d\n",i);
					break;
				}
			}
		}
	}
}

