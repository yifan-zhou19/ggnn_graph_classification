import java.util.*;

package <missing>;

public class GlobalMembers
{
	//C???????????????????????????????????? 
	//????????????n????????????C???????????????1??????0


	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len;
		char[][] str = new char[100][81];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n ; i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (j = 0; j < n; j++)
		{
			len = String.valueOf(str[j]).length();
			if ((str[j][0] >= 'a' && str[j][0] <= 'z') || (str[j][0] == '_') || (str[j][0] >= 'A' && str[j][0] <= 'Z'))
			{
				for (k = 1; k < len ; k++)
				{
					if ((str[j][k] >= 'a' && str[j][k] <= 'z') || (str[j][k] >= 'A' && str[j][k] <= 'Z') || (str[j][k] >= '0' && str[j][k] <= '9') || (str[j][k] == '_'))
					{
						;
					}
					else
					{
						break;
					}

				}
				if (k == len)
				{
					System.out.print('1');
					System.out.print("\n");
				}
				else
				{
					System.out.print('0');
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print('0');
				System.out.print("\n");
			}
		}

		return 0;
	}

}

