package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int l1;
		int l2;
		int i;
		int j;
		int count = 0;
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
		l1 = s.length();
		l2 = w.length();
		for (i = 0;i < l2;i++)
		{
			if (*s == *(w.Substring(i)))
			{
				for (j = 1;j < l1;j++)
				{
					if (*(s.Substring(j)) == *(w.Substring(i) + j))
					{
						count++;
					}
				}
				if (count == l1 - 1)
				{
					System.out.printf("%d\n",i);
				}
			}
		}
				return 0;
	}



}

