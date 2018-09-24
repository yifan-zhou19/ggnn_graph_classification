import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]); //??????
		a = new Scanner(System.in).nextLine(); //??
		int flag = 0; //?????
		for (int i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == ' ')
			{
				flag++; //?????flag??
			}
			else
			{
				if (flag > 1)
				{
					for (int j = i;j < a.length();j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j - flag + 1, a.charAt(j)); //?????????
					}
					for (int j = a.length() - flag + 1;j < a.length();j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j, '\0'); //?????????????
					}
				}
					i = i - flag; //i????????flag?
					flag = 0; //flag??
			}
		}
		System.out.print(a);
		System.out.print("\n");
	}

}

