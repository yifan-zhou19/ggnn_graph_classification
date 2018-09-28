import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String jz = new String(new char[100]);
		jz = new Scanner(System.in).nextLine();
		int gs = jz.length();
		int i;
		for (i = 0;i <= gs - 1;i++)
		{
			if (jz.charAt(i) != ' ')
			{
			System.out.print(jz.charAt(i));
			}
			else
			{
				break;
			}
		} //??????????
		for (i;i <= gs - 1;i++)
		{
			if (jz.charAt(i) != ' ' && jz.charAt(i - 1) == ' ')
			{
				System.out.print(' ');
				System.out.print(jz.charAt(i));
			}
			else if (jz.charAt(i) != ' ' && jz.charAt(i - 1) != ' ')
			{
			System.out.print(jz.charAt(i));
			}
		} //???????????????
	return 0;
	}

}
