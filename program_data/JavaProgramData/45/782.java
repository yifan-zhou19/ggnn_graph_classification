package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j;
		int b;
		int k;
		String c1 = new String(new char[50]);
		String c2 = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c2 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c1 = tempVar2.charAt(0);
		}
		for (i = 0;c1.charAt(i) != '\0';i++)
		{
			k = i;
			for (j = 0;c2.charAt(j) != '\0';j++)
			{
				if (c1.charAt(k) != c2.charAt(j))
				{
					m = 0;
					break;
				}
				k = k + 1;
				m = 1;
			}
			if (m == 1)
			{
				break;
			}
		}
		b = k - j;
		System.out.printf("%d",b);
		return 0;
	}
}

