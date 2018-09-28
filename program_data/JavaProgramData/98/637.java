package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		char[][] str =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		int n;
		int[] num = new int[1000];
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;)
		{
			j = 0;
			c = System.in.read();
			if (c == ' ' || c == '\n')
			{
				continue;
			}
			else
			{
				str[i][j] = c;
				j++;
			}
			for (;;j++)
			{
				c = System.in.read();
				if (c != ' ' && c != '\n')
				{
					str[i][j] = c;
				}
				else
				{
					break;
				}
			}
			num[i] = j;
			i++; //input
		}
		while (c != '\n')
		{
			c = System.in.read();
		}
		System.out.print(str[0]);
			 sum = num[0];
		for (i = 1;i < n;i++)
		{
			if (sum + num[i] + 1 <= 80)
			{
				sum = sum + num[i] + 1;
				System.out.print(' ');
				System.out.print(str[i]);
			}
			else
			{
				sum = num[i];
				System.out.print('\n');
				System.out.print(str[i]);
			}
		}
		return 0;
	}
}

