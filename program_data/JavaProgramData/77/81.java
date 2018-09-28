package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int l;
		String a = new String(new char[100]);
		char p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		p = a.charAt(0);
		l = a.length();
		for (i = 1;i < l;i++)
		{
			if (a.charAt(i) != p)
			{
				for (j = i;j >= 0;j--)
				{
					if (a.charAt(j) == p)
					{
						System.out.printf("%d %d\n",j,i);
						a = a.substring(0, j);
						break;
					}
				}
			}
		}
	}
}

