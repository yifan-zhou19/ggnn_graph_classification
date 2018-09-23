import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[11000]);
		String target = new String(new char[1000]);
		String replace = new String(new char[1000]);
		ch = new Scanner(System.in).nextLine();
		target = new Scanner(System.in).nextLine();
		replace = new Scanner(System.in).nextLine();
		int c = ch.length();
		int t = target.length();
		ch = tangible.StringFunctions.changeCharacter(ch, c, ' ');
		for (int i = 0;i < c;i++)
		{
			if (ch.charAt(i) != target.charAt(0)) //??????????
			{
				System.out.print(ch.charAt(i));
			}
			else if (i == 0 && ch.charAt(i) == target.charAt(0) && ch.charAt(t) != ' ') //????????????????????????
			{
				System.out.print(ch.charAt(i));
			}
			else if (i > 0 && (ch.charAt(i - 1) != ' ' || ch.charAt(i + t) != ' ')) //???????????????
			{
				System.out.print(ch.charAt(i));
			}
			else //?????????????????
			{
					int count = 0;
					for (int j = 0;j < t;j++)
					{
						if (ch.charAt(i + j) == target.charAt(j))
						{
							count++;
						}
						else
						{
							break;
						}
					}
					if (count == t)
					{
						System.out.print(replace);
						i = i + t - 1;
					}
					else
					{
						System.out.print(ch.charAt(i));
					}
			}
		}
		return 0;
	}

}

