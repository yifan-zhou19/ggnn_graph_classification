import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[110]);
		int num = 0;
		int i;
		int x;
		str = new Scanner(System.in).nextLine(); //?????
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ')
			{
				for (x = i + 1;;x++)
				{
					if (str.charAt(x) != ' ') //???????????????????????????
					{
					 break;
					}
				}
				System.out.print(' ');
				i = x;
			}


			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
		}
	return 0;

	}

}
