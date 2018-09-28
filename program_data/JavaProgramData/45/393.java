package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int flag;
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
		for (i = 0;i < w.length();i = i + 1)
		{
			if (s.charAt(0) == w.charAt(i))
			{
				for (j = 0;j < s.length();j = j + 1)
				{
					if (s[j] = w.charAt(i + j) != null)
					{
						flag = 1;
						continue;
					}
					else
					{
						flag = 0;
						break;
					}
				}
			}
			else
			{
				flag = 0;
			}
			if (flag == 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}
}

