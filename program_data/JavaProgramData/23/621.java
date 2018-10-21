import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String scentence = new String(new char[10000]);
		int numOfVo = 0;
		char[][] voca = new char[101][51];
		char change;

		int[] lenofc = new int[101];
		int holo;

		double exchange;
		double exch;



		String newscentence = new String(new char[10000]);
		int length;

		scentence = new Scanner(System.in).nextLine();
		length = scentence.length();
		for (int i = 0;i < scentence.length();i++)
		{
			  newscentence = tangible.StringFunctions.changeCharacter(newscentence, i, scentence.charAt(length - i - 1));
		}
		for (int i = 0;i < scentence.length() ; i++)
		{
			if (newscentence.charAt(i) == ' ')
			{
				continue;
			}
			numOfVo = numOfVo + 1;
			for (int j = i; j < scentence.length(); j++)
			{
				if (newscentence.charAt(j) == ' ')
				{
					break;
				}
				voca[numOfVo][j - i + 1] = newscentence.charAt(j);
				lenofc[numOfVo] = lenofc[numOfVo] + 1;
			}
			i = i + lenofc[numOfVo];
		}
		for (int i = 1;i <= numOfVo;i++)
		{
			for (int j = 1;j <= (lenofc[i] / 2);j++)
			{
					change = voca[i][j];
					voca[i][j] = voca[i][lenofc[i] + 1 - j];
					voca[i][lenofc[i] + 1 - j] = change;
			}

		}
		for (int j = 1;j <= lenofc[1];j++)
		{
				System.out.print(voca[1][j]);
		}
		for (int i = 2;i <= numOfVo;i++)
		{
			System.out.print(" ");
			for (int j = 1;j <= lenofc[i];j++)
			{
				System.out.print(voca[i][j]);
			}

		}





		return 0;

	}

}

