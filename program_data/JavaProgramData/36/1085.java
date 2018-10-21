package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[100]);
		int n;
		int m;
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
		n = w.length();
		m = s.length();
		if (n != m)
		{
			System.out.print("NO");
			return 0;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (s.charAt(i) == w.charAt(j))
					{
						count++;
						w = tangible.StringFunctions.changeCharacter(w, j, ' ');
						break;
					}
				}
			}
			if (count == n)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
			return 0;
		}
	}
}

