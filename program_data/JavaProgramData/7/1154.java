package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{

		String string = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}

		String substring = new String(new char[256]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substring = tempVar2.charAt(0);
		}

		String replacement = new String(new char[256]);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}

		int Lsub = 0; //??substring???
		for (int i = 0;;i++)
		{
			if (substring.charAt(i) == '\0')
			{
				Lsub = i;
				break;
			}
		} //??substring???

		int Lrep = 0; //??replacement???
		for (int i = 0;;i++)
		{
			if (replacement.charAt(i) == '\0')
			{
				Lrep = i;
				break;
			}
		} //??replacement???

		int pBegin = check; //?????????
		int judge = 1;
		for (int i = 0;i < 256 - Lsub;i++)
		{
			judge = 1;
			for (int j = i;j < i + Lsub;j++)
			{
				if (String[j] - substring.charAt(j - i) != 0)
				{
					judge = 0;
					break;
				}
				if (j - i == Lsub - 1)
				{
					break;
				}
			}
			if (judge == 1)
			{
				pBegin = i;
				break;
			}
		} //?????????
		if (pBegin == check)
		{
			System.out.printf("%s",String);
		}

		else
		{

		String Ans = new String(new char[512]);
		for (int i = 0;i < pBegin;i++)
		{
			Ans = tangible.StringFunctions.changeCharacter(Ans, i, string.charAt(i));
		}

		for (int i = pBegin;i < pBegin + Lrep;i++)
		{
			Ans = tangible.StringFunctions.changeCharacter(Ans, i, replacement.charAt(i - pBegin));
		}

		for (int i = pBegin + Lrep;;i++)
		{
			Ans = tangible.StringFunctions.changeCharacter(Ans, i, string.charAt(i - (pBegin + Lrep) + pBegin + Lsub));
			if (Ans.charAt(i) == '\0')
			{
				break;
			}
		}

		System.out.printf("%s",Ans);
		}
		return 0;
	}
}

