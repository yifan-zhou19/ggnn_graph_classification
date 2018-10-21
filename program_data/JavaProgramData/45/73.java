package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int l;
		int count = 0;
		String y = new String(new char[50]);
		String x = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = tempVar2.charAt(0);
		}
		l = x.length();
		for (i = 0,j = 0;i < l;)
		{
			if (x.charAt(i) == y.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				j++;
				count++;
			}
		}
		System.out.printf("%d",count);

	}

}

