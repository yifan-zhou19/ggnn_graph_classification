package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		int i;
		int j;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		int l = s1.length();
		for (j = 0;s2.charAt(j) != '\0';j++)
		{
				if (s1.charAt(0) == s2.charAt(j))
				{
					d = j;
					break;
				}
		}
		for (i = 1;i < l;i++,j++)
		{
			if (s1.charAt(i) == s2.charAt(j + 1))
			{
				continue;
			}
		}
		System.out.printf("%d",d);



		return 0;
	}
}

