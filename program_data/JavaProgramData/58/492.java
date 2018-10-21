import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int avoid(String as)
	{
		int len;
		len = as.length();
		int j;
		int t;
		for (j = 1; j < len; j++)
		{
			if ((as[j] - 'a' < 0 || as[j] - 'a' > 25) && (as[j] - 'A' < 0 || as[j] - 'A' > 25) && (as[j] - '0' < 0 || as[j] - '0' > 9) && (!as[j].equals('_')))
			{
				t = 0;
				break;
			}
		}
		if (j == len)
		{
			 t = 1;
		}
		return (t);
	}
	public static int Main()
	{
		int n;
		int i;
		int num;
		char[][] str = new char[10000][81];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			if (str[i][0] == '_')
			{
				num = avoid(str[i]);
				System.out.print(num);
				System.out.print("\n");
			}
			if (str[i][0] != '_')
			{
				if ((str[i][0] - 'a' >= 0 && str[i][0] - 'a' <= 25) || (str[i][0] - 'A' >= 0 && str[i][0] - 'A' <= 25))
				{
					num = avoid(str[i]);
					System.out.print(num);
					System.out.print("\n");
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

