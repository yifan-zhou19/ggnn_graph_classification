import java.util.*;

package <missing>;

public class GlobalMembers
{
	/************
	 * ???????
	 * ?????1000012923
	 * ???2010.11.6
	 * ?????????????
	*************/



	public static int Main()
	{
		String s0 = new String(new char[2001]);
		String s1 = new String(new char[201]);
		String s2 = new String(new char[201]);
		s0 = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int L0 = 0;
		int L1 = 0;
		int L2 = 0;
		while (s0.charAt(L0) != 0)
		{
			L0++; //???????strlen???
		}
		while (s1.charAt(L1) != 0)
		{
			L1++;
		}
		while (s2.charAt(L2) != 0)
		{
			L2++;
		}
		if (L1 == 0)
		{
			System.out.print(s0);
			return 0;
		}
		for (int i = 0;i <= L0 - L1;i++)
		{ //??
			int is = 0;
			for (int j = 0;j < L1;j++)
			{
				if (s0.charAt(i + j) != s1.charAt(j))
				{
					is++;
					break;
				}
			}
			if (is != 0)
			{
				continue; //?????????
			}
			if ((i != 0 && s0.charAt(i - 1) != ' ') || (s0.charAt(i + L1) != ' ' && s0.charAt(i + L1) != 0))
			{
				continue; //???????????
			}
			if (L1 > L2)
			{
				for (int j = i + L1;j < L0;j++)
				{
					s0 = tangible.StringFunctions.changeCharacter(s0, j + L2 - L1, s0.charAt(j)); //???????
				}
			}
			else
			{
				for (int j = L0 - 1;j >= i + L1;j--)
				{
					s0 = tangible.StringFunctions.changeCharacter(s0, j + L2 - L1, s0.charAt(j));
				}
			}
			for (int j = i;j < i + L2;j++)
			{
				s0 = tangible.StringFunctions.changeCharacter(s0, j, s2.charAt(j - i));
			}
			L0 += L2 - L1; //????
			i += L2;
		}
		s0 = s0.substring(0, L0);
		System.out.print(s0);
	}

}

