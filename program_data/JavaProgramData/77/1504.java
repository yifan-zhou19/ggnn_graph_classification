import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String children = new String(new char[101]);
		char boy;
		char girl;
		char left;
		children = new Scanner(System.in).nextLine();
		int l = children.length();
		int cnt = 0;
		boy = children.charAt(0);
		girl = children.charAt(l - 1);
		left = boy > girl? (girl - 1) : (boy - 1);
		do
		{
			for (int i = 1; i < l; i++)
			{
				if (children.charAt(i) == left)
				{
					i++;
					continue;
				}
				if (children.charAt(i) == girl)
				{
					for (int j = i - 1; j >= 0; j--)
					{
						if (children.charAt(j) == left)
						{
							j--;
							continue;
						}
						if (children.charAt(j) == girl)
						{
							break;
						}
						else
						{
							System.out.print(j);
							System.out.print(" ");
							System.out.print(i);
							System.out.print("\n");
							children = tangible.StringFunctions.changeCharacter(children, i, left);
							children = tangible.StringFunctions.changeCharacter(children, j, left);
							cnt += 2;
							break;
						}
					}
				}
			}
		}while (cnt != l);
		return 0;
	}
}

