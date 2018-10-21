package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int i;
		int j = 0;
		int count = -1;
		int l;
		int m;
		l = w.length();
		m = s.length();
		for (i = count + 1;i < l;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				count = i;
				while (w.charAt(i) == s.charAt(j) && w.charAt(i) != '\0')
				{
					j++;
					i++;

				}
				if (j == m)
				{
					break;
				}
			}
		}
		if (j == m)
		{
			System.out.printf("%d",count);
		}
		else
		{
			System.out.print("error");
		}




		return 0;
	}


}

