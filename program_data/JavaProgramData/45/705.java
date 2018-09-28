package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
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
		int i;
		int j;
		int k = 0;
		int q = 0;
		int m = a.length();
		int n = b.length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (b.charAt(j + i) == a.charAt(j))
				{
					c[i] = c[i] + 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == m)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}
}

