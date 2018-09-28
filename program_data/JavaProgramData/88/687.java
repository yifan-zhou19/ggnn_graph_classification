import java.util.*;

package <missing>;

public class GlobalMembers
{
	//??????????
	//???
	//2012-12-12
	public static int Main()
	{
		String a = new String(new char[40]);
		a = new Scanner(System.in).nextLine(); //??????
		int len;
		int i;
		int j = 0;
		int k;
		len = a.length(); //???????
		for (i = 0;i < len;i++)
		{ //??????????????
			if ((a.charAt(i) < '0' || a.charAt(i)>'9') && a.charAt(i) != '-')
			{ //???????????
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			if (a.charAt(i) == '-')
			{ //????????????????
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				for (j = i + 1;j < len;j++)
				{
					if (a.charAt(j) >= '0' && a.charAt(j) <= '9')
					{
						a = tangible.StringFunctions.changeCharacter(a, j, ' ');
					}
					else
					{
						break;
					}
				}
			}
		}
		int x = 0; //????????
		int y = 0;
		for (i = 0;i < len;i++)
		{ //??????????
			if (a.charAt(i) != ' ')
			{
				System.out.print(a.charAt(i));
				x = 1;
				continue;
			}
			if (a.charAt(i) == ' ' && x == 1)
			{ //???????????????
				k = i;
				System.out.print("\n");
				break;
			}
		}
		for (i = k + 1;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{ //????????
				System.out.print(a.charAt(i));
				y = 1; //???????????
			}
			if (a.charAt(i) == ' ' && y == 1)
			{ //?????????????y?0
				System.out.print("\n");
				y = 0;
			}
		}
		return 0;
	}

}

