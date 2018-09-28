import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]); //?????
		str1 = new Scanner(System.in).nextLine(); //??????????
		for (int i = 1;i < 100;i++) //???????
		{
				if (str1.charAt(i - 1) == ' ' && str1.charAt(i) == ' ') //??????????????????????
				{
							  for (int j = i + 1;j < 100;j++)
							  {
									  str1 = tangible.StringFunctions.changeCharacter(str1, j - 1, str1.charAt(j));
							  }
							  i--; //???????
				}
		}
		System.out.print(str1);
		System.out.print("\n");
		return 0;
	}
}

