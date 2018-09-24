package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		int t1 = 0;
		int t2 = 0;
		int i;
		int j;
		int time;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}

		t1 = a.length();
		t2 = b.length();

		if (t1 != t2)
		{
			System.out.print("NO");
		}
		time = 0;
		if (t1 == t2)
		{
			for (i = 0;i < t1;i++)
			{
				for (j = 0;j < t1;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '0');
						time++;
						break;
					}
				}
			}
			if (time == t1)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}

	}
}

