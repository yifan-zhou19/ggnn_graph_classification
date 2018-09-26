package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[51]);
		String b = new String(new char[51]);
		int i;
		int j;
		int k;
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
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			for (j = 0;b.charAt(j) != '\0';j++)
			{
				if (a.charAt(i) == b.charAt(j) && a.charAt(i) != '\0' && b.charAt(j) != '\0')
				{
					k = j - i;
					i++;
				}
			}
		}
		System.out.printf("%d\n",k);
		return 0;
	}


}

