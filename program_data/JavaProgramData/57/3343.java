package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int len;
		char[][] w =
		{
			{'c', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[] W = {'c', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i++)
		{
			W = new Scanner(System.in).nextLine();
			len = W.length();
			if (W[len - 2] == 'e' && W[len - 1] == 'r')
			{
				len -= 2;
			}
			else if (W[len - 2] == 'l' && W[len - 1] == 'y')
			{
				len -= 2;
			}
			else if (W[len - 3] == 'i' && W[len - 2] == 'n' && W[len - 1] == 'g')
			{
				len -= 3;
			}
			for (j = 0;j < len;j++)
			{
				w[i][j] = W[j];
			}
		}
		for (i = 1;i < n + 1;i++)
		{
			j = 0;
			while (w[i][j] != 0)
			{
				System.out.printf("%c",w[i][j]);
				j++;
			}
			if (w[i][j] == 0)
			{
				System.out.print("\n");
			}
		}
	}
}

