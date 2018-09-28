package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int n;
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
		i = 0;
		while (s.charAt(i) != null)
		{
			i++;
		}
		n = i;
		i = 0;
		while (w.charAt(i) != null)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = i;j < i + n;j++)
				{
					if (w.charAt(j) != s.charAt(j - i))
					{
						break;
					}
				}
			}
			if (j == i + n)
			{
				break;
			}
			i++;
		}
		System.out.printf("%d",i);
	}




}

