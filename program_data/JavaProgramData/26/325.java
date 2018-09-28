import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i;
		int j;
		int flag = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0 ; ; i++)
		{
			if (*(str.Substring(i)) == ' ' && flag == 1)
			{
				for (j = i ; ; j++)
				{
					*(str.Substring(j)) = *(str.Substring(j) + 1);
					if (*(str.Substring(j)) == '\0')
					{
						break;
					}
				}
				i--;
			}
			if (*(str.Substring(i)) == ' ')
			{
				flag = 1;
			}
			else
			{
				flag = 0;
			}
			if (*(str.Substring(i)) == '\0')
			{
				break;
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}
