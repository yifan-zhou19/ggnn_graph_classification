import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0;i < 100;i++)
		{

			if (a.charAt(i) == ' ')
			{

				for (j = 0;;j++)
				{
					if (a.charAt(j + i + 1) != ' ')
					{
						break;
					}
				}
				for (int k = i + 1;k < 100;k++)
				{
					a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + j));
				}




			}
		}


		System.out.print(a);
		System.out.print("\n");








		return 0;
	}

}

