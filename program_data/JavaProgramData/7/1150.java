package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String st = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			st = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			rep = tempVar3.charAt(0);
		}
		int lenst;
		int lensub;
		int i;
		int j;
		lenst = st.length();
		lensub = sub.length();
		for (i = 0;i <= lenst - lensub;i++)
		{
			int count = 0;
			if (lensub != 1)
			{
				if (st.charAt(i) == sub.charAt(0))
				{

					for (j = i + 1;j < i + lensub;j++)
					{
						if (st.charAt(j) != sub.charAt(j - i))
						{
							break;
						}
						count++;
					}
				}
				if (count == lensub - 1)
				{
					for (j = i;j < i + lensub;j++)
					{
						st = tangible.StringFunctions.changeCharacter(st, j, rep.charAt(j - i));
					}
					break;
				}
			}
			else
			{
				if (st.charAt(i) == sub.charAt(0))
				{
					st = tangible.StringFunctions.changeCharacter(st, i, rep.charAt(0));
					break;
				}
			}
		}
		System.out.printf("%s",st);
	}

}

