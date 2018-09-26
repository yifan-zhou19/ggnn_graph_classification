package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int L = -1;
		int k = 0;
		int j;
		String before = new String(new char[40]); //????before???????
		String word = new String(new char[40]); //????word???????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word = tempVar.charAt(0);
		}
		l = word.length(); //???????
		for (i = 0;i < l;i++)
		{
			before = tangible.StringFunctions.changeCharacter(before, i, word.charAt(i));
		}
		before = tangible.StringFunctions.changeCharacter(before, l, '\0'); //???????????????before?
		L = l; //L?????????l
		for (i = 1;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			l = word.length(); //???
			k = L + l + 1; //?????????k
			if (k > 80 && L <= 80) //?k>80??L<=80??????????????
			{
				System.out.print(before);
				System.out.print("\n");
				L = l; //????????l
				for (j = 0;j < l;j++)
				{
					before = tangible.StringFunctions.changeCharacter(before, j, word.charAt(j));
				}
				before = tangible.StringFunctions.changeCharacter(before, l, '\0'); //?????????before?
			}
			else
			{
				System.out.print(before);
				System.out.print(" ");

				for (j = 0;j < l;j++)
				{
					before = tangible.StringFunctions.changeCharacter(before, j, word.charAt(j));
				}
				before = tangible.StringFunctions.changeCharacter(before, l, '\0'); //?????????before?
				L = k; //???????k
			}
		}
		System.out.print(word);
		return 0;
	}

}

