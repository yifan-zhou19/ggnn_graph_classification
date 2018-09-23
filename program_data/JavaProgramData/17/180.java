import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ //int l,t=0;
		String string1 = new String(new char[101]);
		while (string1 = new Scanner(System.in).nextLine())
		{ //t=0;

		System.out.print(string1);
		System.out.print("\n");

		for (int i = 1;i < string1.length();i++)
		{
			if (string1.charAt(i) == ')')
			{
	//			if(t==0)
	//			{
	//				l=i;t=1;
	//			}
				for (int j = i - 1;j >= 0;j--)
				{
					if (string1.charAt(j) == '(')
					{ //l=j;
						string1 = tangible.StringFunctions.changeCharacter(string1, i, ' ');
						string1 = tangible.StringFunctions.changeCharacter(string1, j, ' ');
						break;
					}
				}
			}

		}
	for (int k = 0;k < string1.length();k++)
	{
			if (string1.charAt(k) == '(')
			{
				System.out.print("$");
			}
			else if (string1.charAt(k) == ')')
			{
				System.out.print("?");
			}
			else
			{
				System.out.print(" ");
			}
	}
		System.out.print("\n");
		}
		return 0;
	}


}

