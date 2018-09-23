import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word_in = new String(new char[200]);
		String word_tr = new String(new char[200]);
		String word_out = new String(new char[200]);
		String word_fil = new String(new char[200]);
		for (int i = 0;i < 200;i++)
		{
			word_in = word_in.substring(0, i);
			word_tr = word_tr.substring(0, i);
			word_out = word_out.substring(0, i);
			word_fil = word_fil.substring(0, i);
		}
		int lg1;
		int lg2;
		int lg3;
		int lg4;
		int sum = 0;
		int t = 0;
		word_in = new Scanner(System.in).nextLine();
		lg1 = word_in.length();
		word_in = tangible.StringFunctions.changeCharacter(word_in, lg1, ' ');
		word_tr = new Scanner(System.in).nextLine();
		lg2 = word_tr.length();
		word_out = new Scanner(System.in).nextLine();
		lg3 = word_out.length();
		for (int i = 0;i < 200;i++)
		{
			sum = 0;
			for (int j = 0;j < lg2;j++)
			{
				if (word_in.charAt(i + j) == word_tr.charAt(j))
				{
					sum = sum + 1;
				}
			}
			if ((word_in.charAt(i - 1) == ' ' || i == 0) && word_in.charAt(i + lg2) == ' ' && sum == lg2)
			{
				if (lg3 == lg2)
				{
					for (int j = 0;j < lg3;j++)
					{
						word_in = tangible.StringFunctions.changeCharacter(word_in, i + j, word_out.charAt(j));
					}
					i = i + lg2;
				}
				if (lg3 < lg2)
				{
					for (int j = 0;j < lg3;j++)
					{
						word_in = tangible.StringFunctions.changeCharacter(word_in, i + j, word_out.charAt(j));
					}
					for (int j = lg3;j < lg2;j++)
					{
						word_in = tangible.StringFunctions.changeCharacter(word_in, i + j, ' ');
					}
					i = i + lg2;
				}
				if (lg3 > lg2)
				{
					for (int j = 199;j >= i + lg2;j--)
					{
						word_in = tangible.StringFunctions.changeCharacter(word_in, j + lg3 - lg2, word_in.charAt(j));
					}
					for (int j = 0;j < lg3;j++)
					{
						word_in = tangible.StringFunctions.changeCharacter(word_in, i + j, word_out.charAt(j));
					}
					i = i + lg3;
				}
			}
		}
		for (int i = 0;i < 200;i++)
		{
			if (word_in.charAt(i) != ' ')
			{
				word_fil = tangible.StringFunctions.changeCharacter(word_fil, t, word_in.charAt(i));
				t++;
			}
			if (word_in.charAt(i) == ' ')
			{
				if (word_in.charAt(i + 1) != ' ')
				{
					word_fil = tangible.StringFunctions.changeCharacter(word_fil, t, word_in.charAt(i));
					t++;
				}
			}
		}
		lg4 = word_fil.length();
		for (int i = 0;i < lg4 - 1;i++)
		{
			System.out.print(word_fil.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}


}

