package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char l;
		char r;
		char s;
		String sen = new String(new char[200]);
		String rem = new String(new char[200]);
		int i = 1;
		int j = 1;
		int k = 1;
		int nsen;
		int b = 1;
		l = '(';
		r = ')';

		while (b == 1)
		{

			while ((s = System.in.read()) != '\n')
			{
				sen = tangible.StringFunctions.changeCharacter(sen, i, s);
				rem = tangible.StringFunctions.changeCharacter(rem, i, s);
				i++;
			}
			nsen = i - 1;

			for (j = 1;j < nsen;j++) //??????
			{
				for (i = 1;i < nsen;i++)
				{
					if (sen.charAt(i) == l && sen.charAt(i + j) == r)
					{
						sen = tangible.StringFunctions.changeCharacter(sen, i, ' ');
						sen = tangible.StringFunctions.changeCharacter(sen, i + j, ' ');
					} //?????????????
				}
			}

					for (i = 1;i <= nsen;i++)
					{
						if (sen.charAt(i) == l)
						{
							sen = tangible.StringFunctions.changeCharacter(sen, i, '$');
						}
						else if (sen.charAt(i) == r)
						{
							sen = tangible.StringFunctions.changeCharacter(sen, i, '?'); //?????????
						}
						else
						{
							sen = tangible.StringFunctions.changeCharacter(sen, i, ' '); //?????????
						}
					}


						for (i = 1;i <= nsen;i++)
						{
							System.out.print(rem.charAt(i));
						}
						System.out.print("\n");
						for (i = 1;i <= nsen;i++)
						{
							System.out.print(sen.charAt(i));
						}
						System.out.print("\n");

						nsen = 0;
						i = 1;
						j = 1;
						k = 1;
		}


		return 0;
	}


}

