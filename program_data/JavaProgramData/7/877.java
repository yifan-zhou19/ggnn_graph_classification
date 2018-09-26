import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String strstr = new String(new char[300]);
		String repla = new String(new char[300]);
		int i;
		int j;
		int k;
		str = new Scanner(System.in).nextLine();
		strstr = new Scanner(System.in).nextLine();
		repla = new Scanner(System.in).nextLine();

		int sl1 = str.length();
		int sl2 = strstr.length();
		int sl3 = repla.length();

		for (i = 0; i < sl1; i++)
		{
			int flag = 1;
			if (str.charAt(i) != strstr.charAt(0))
			{
				continue;
			}
			else
			{
				for (j = i; j < i + sl2; j++)
				{
					if (str.charAt(j) != strstr.charAt(j - i))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 0)
				{
					continue;
				}
				//found
				else
				{
					int vec = sl3 - sl2;
					//to move;
					for (k = sl1; k >= i + sl2; k--)
					{
						str = tangible.StringFunctions.changeCharacter(str, k + vec, str.charAt(k));
					}
					//replace
					for (k = i; k < i + sl3; k++)
					{
						str = tangible.StringFunctions.changeCharacter(str, k, repla.charAt(k - i));
					}
					break;
				}
			}
		}
		System.out.print(str);
		System.out.print("\n");
	return 0;
	}
}

