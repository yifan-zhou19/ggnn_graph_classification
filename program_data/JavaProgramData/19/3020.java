package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int count = -1;
		int[] pos = new int[51];
		int k = 0;
		char[][] a = new char[51][101];
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		char d;
		while (true)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			i++;
			if (d = System.in.read(),d == '\n')
			{
				break;
			}
		}
		i--;
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);

		for (j = 0;j <= i;j++)
		{
			if (strcmp(a[j],b) == 0)
			{
				count++;
				pos[count] = j;
			}
		}

			for (j = 0;j <= i;j++)
			{
				if ((k <= count) && (pos[k] == j))
				{
					if (j == i)
					{
						System.out.print(c);
					}
					else
					{
						System.out.print(c);
						System.out.print(" ");
					}
					k++;
				}
				else
				{
					if (j == i)
					{
						System.out.print(a[j]);
					}
					else
					{
						System.out.print(a[j]);
						System.out.print(" ");
					}
				}
			}

		return 0;
	}
}

