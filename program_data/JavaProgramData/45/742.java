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

		int a;
		int b;
		int i;
		int j;
		a = s.length(),b = w.length();

		for (j = 0;j < b;j++)
		{
			if (s.charAt(0) == w.charAt(j))
			{
				for (i = 0;i < a;i++)
				{
					j++;
					if (s.charAt(i + 1) != w.charAt(j))
					{
						break;
					}
					else if (i + 1 == a - 1)
					{
						j = j - a + 1;
						System.out.printf("%d\n",j);
					}
				}
				if (i == a - 1)
				{
				break;
				}
			}

		}

		return 0;
	}
}

