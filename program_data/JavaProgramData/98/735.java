package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????
		int i;
		int j = 0;
		int k;
		int t;
		int sum = 0;
		String word = new String(new char[40]); //??????word???????str?????????
		String str = new String(new char[80]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{ //????????
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			sum += word.length(); //???????????
			if ((i != n) && (sum <= 80))
			{ //??????????????????????80
				for (k = 0;k < word.length();k++,j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, word.charAt(k)); //????????????
				}
				str = tangible.StringFunctions.changeCharacter(str, j, ' '); //???????
				j++; //?str????????
				sum++; //???????
			}
			else if (sum > 80)
			{ //????????80
				for (t = 0;t < j - 1;t++)
				{
					System.out.print(str.charAt(t));
				}
				System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(str,0,(Character.SIZE / Byte.SIZE)); //?str??
				for (j = 0,k = 0;k < word.length();k++,j++) //?j??
				{
					str = tangible.StringFunctions.changeCharacter(str, j, word.charAt(k)); //?????????????
				}
				str = tangible.StringFunctions.changeCharacter(str, j, ' '); //???????
				j++; //?str????????
				sum = word.length() + 1; //???????
			}
			else
			{ //????????????
				for (k = 0;k < word.length();k++,j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, word.charAt(k)); //?????
				}
				for (t = 0;t <= j - 1;t++)
				{
					System.out.print(str.charAt(t));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

