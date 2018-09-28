import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String haha;
		String sen = new String(new char[10000]);
		int i = 0;
		int count;
		sen = new Scanner(System.in).nextLine();
		count = 1;

		haha = sen;
		while (sen.charAt(i) != '\0')
		{

			if (sen.charAt(i) != ' ')
			{
				count = 0;
				System.out.print((haha.Substring(i)));
			}
			else
			{
				if (count == 0)
				{
					System.out.print(" ");
					count++;
				}

			}
			i++;
		}

		return 0;
	}


}
