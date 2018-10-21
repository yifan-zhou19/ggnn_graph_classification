import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //??,i?????j????????l?????????
		int j;
		int numword = 1;
		int l = 0;
		final String words = ""; //???????????
		final String aph = "";
		aph = new Scanner(System.in).nextLine();

		for (i = 0;;i++)
		{
			if (aph.charAt(i) == '\0')
			{
				break;
			}
			if (aph.charAt(i) == ' ')
			{
				numword++;
				l = 0;
			}
			else if (aph.charAt(i) != ' ')
			{
				words.charAt(numword)[l] = aph.charAt(i);
				l++;
			}
		}
		for (j = numword;j > 1;j--)
		{
			System.out.print(words.charAt(j));
			System.out.print(" ");
		}
		System.out.print(words.charAt(1));
		return 0;
	}
}
