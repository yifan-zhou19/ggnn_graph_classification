package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String c = new String(new char[50]);
		String p = new String(new char[50]);
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		int i = 0;
		int j;
		for (j = 0;j < 50;j++)
		{
			if (c.charAt(i) == p.charAt(j))
			{
				k = j;
			break;
			}
		}
		System.out.printf("%d",k);
	}

}

