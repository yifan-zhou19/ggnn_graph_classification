import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[100]);
		sen = new Scanner(System.in).nextLine();
		for (int i = 0;i < sen.length();)
		{
			if (sen.charAt(i) == ' ')
			{
				System.out.print(' ');
				for (int j = i + 1;sen.charAt(j) == ' ';)
				{
					if (sen.charAt(j) == ' ')
					{
						j++;
						i++;
					}
				}
				i++;
			}
			else
			{
				System.out.print(sen.charAt(i));
				i++;
			}
		}
		return 0;
	}
}
