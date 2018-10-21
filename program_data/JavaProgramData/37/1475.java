package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String array = new String(new char[1000000]);
		char temp;
		int n;
		int i;
		int j;
		int k;
		int len;
		int account = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{ //n???
			array = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = array.length(); //????
			for (j = 0;j < len;j++)
			{ //??????
				if (array.charAt(j) == '0')
				{
					continue; //???0?????
				}
				if (array.charAt(j) != '0')
				{ //???0
					temp = array.charAt(j);
					for (k = j + 1;k < len;k++)
					{ //?????????
						if (temp == array.charAt(k))
						{ //??
							array = tangible.StringFunctions.changeCharacter(array, k, '0'); //?????0
							array = tangible.StringFunctions.changeCharacter(array, j, '0');
						}
					}
				}
			}
				for (j = 0;j < len;j++)
				{ //????
					if (array.charAt(j) != '0')
					{ //?????0???
						System.out.print(array.charAt(j));
						System.out.print("\n");
						account++; //?????
						break; //??
					}
				}
				if (account == 0)
				{
					System.out.print("no");
					System.out.print("\n");
				}
				account = 0; //?????0

		}
		return 0;
	}

}

