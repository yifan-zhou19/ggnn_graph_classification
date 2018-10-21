package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		int j;
		int k;
		int len = a.length();
		char b = a.charAt(0);
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != b && a.charAt(i) != 0)
			{
				for (j = i;j >= 0;j--)
				{
					if (a.charAt(j) != a.charAt(i) && ((i - j - 1) % 2) == 0 && a.charAt(j) != 0)
					{
						a = a.substring(0, j);
						a = a.substring(0, i);
						System.out.printf("%d %d\n",j,i);
						break;
					}
				}
			}
		}


	}
}

