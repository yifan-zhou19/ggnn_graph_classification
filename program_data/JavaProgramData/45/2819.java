package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j = 0;
		int mark = 0;
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
		for (i = 0; i < s.length(); i++)
		{
			while (j < w.length())
			{
				if (s.charAt(i) == w.charAt(j))
				{
					mark = j;
					j = mark + 1;
					break;
				}
				else
				{
					j++;
				}

			}

		}
		System.out.printf("%d", mark - s.length() + 1);

			return 0;
	}
}

