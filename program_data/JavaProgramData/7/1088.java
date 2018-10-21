package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[256]);
		String t = new String(new char[256]);
		String h = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			h = tempVar3.charAt(0);
		}
		int ss = s.length();
		int tt = t.length();
		int i;
		int j;
		int count = 0;
		int place = -1;
		for (i = 0;i < ss;i++)
		{
			count = 0;
			for (j = 0;j < tt;j++)
			{
				if (t.charAt(j) - s.charAt(i + j) == 0)
				{
					count++;
				}
			}
			if (count == tt)
			{
				place = i;
				break;
			}
		}
		if (place == -1)
		{
			System.out.printf("%s",s);
		}
		else
		{
		for (i = 0;i < place;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.printf("%s",h);
		for (i = place + tt;i < ss;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}

		}


	}
}

