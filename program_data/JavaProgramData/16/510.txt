import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String shu = new String(new char[6]);
		char temp;
		int i;
		int Lshu;
		shu = new Scanner(System.in).nextLine();
		Lshu = shu.length();
		for (i = 0;i < Lshu / 2;i++)
		{
			temp = shu.charAt(i);
			shu = tangible.StringFunctions.changeCharacter(shu, i, shu.charAt(Lshu - 1 - i));
			shu = tangible.StringFunctions.changeCharacter(shu, Lshu - 1 - i, temp);
		}
		System.out.print(shu);
		return 0;
	}
}

