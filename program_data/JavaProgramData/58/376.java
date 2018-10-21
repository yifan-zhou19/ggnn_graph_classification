import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] ch = new char[800][1000];
		int i;
		int j;
		int n;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			ch[i] = new Scanner(System.in).nextLine();
		}
		for (i = 1;i <= n;i++)
		{
			if (ch[i][0] == '_' || (ch[i][0] <= 'z' && ch[i][0] >= 'a') || (ch[i][0] <= 'Z' && ch[i][0] >= 'A'))
			{
					for (j = 0;j <= (String.valueOf(ch[i]).length() - 1);j++)
					{
						if (ch[i][j] != '_' && (!(ch[i][j] <= 'z' && ch[i][j] >= 'a')) && (!(ch[i][j] <= 'Z' && ch[i][j] >= 'A')) && (!((ch[i][j] <= '9' && ch[i][j] >= '0'))))
						{
							m++;
						}
					}
					if (m != 0)
					{
						System.out.print("0");
						System.out.print("\n");
					}
					else
					{
						System.out.print("1");
						System.out.print("\n");
					}
					m = 0;
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
		return 0;

	}
}

