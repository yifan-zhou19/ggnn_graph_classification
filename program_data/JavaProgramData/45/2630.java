package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k;
		int l;
		String q = new String(new char[51]);
		String p = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		k = q.length();
		l = p.length();
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (q.charAt(i) == p.charAt(j))
				{
					break;
				}

			}
			break;
		}

		System.out.printf("%d",j);



	}
}

