import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int leng;
		int i;
		int j;
		int sum = 0;
		s = new Scanner(System.in).nextLine();
		leng = s.length();
		for (i = 0;i < leng - sum;i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
			{
					sum++;
					for (j = i;j < leng - sum;j++)
					{
						s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
					}
					i = i - 1;
			}
		}
		for (i = 0;i < leng - sum;i++)
		{
			System.out.print(s.charAt(i));
		}
		return 0;
	}

}

