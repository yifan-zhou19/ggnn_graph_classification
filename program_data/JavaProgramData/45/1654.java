package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i = 0;
		int j = 0;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			if (s.charAt(0) == w.charAt(i))
			{
				result = 1;
				for (j = 0;s.charAt(j) != '\0';j++)
				{
					if (s[j] = w.charAt(i + j) != null)
					{
						continue;
					}
					else
					{
						result = 0;
						break;
					}
				}
			}
			if (result == 1)
			{
				break;
			}
		}
		System.out.printf("%d",i);
		return 0;
	}
}

