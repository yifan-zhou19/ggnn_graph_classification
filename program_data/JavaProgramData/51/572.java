package <missing>;

public class GlobalMembers
{
	//********************************
	//*???n-gram????    **
	//*?????? 1300012757 **
	//*???2013.12.12 **
	//********************************
	public static int n;
	public static int[] num = new int[200];

	public static void search(String[] s, int j)
	{
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//	extern int n,num[200];
		int count = 0;
		for (int i = 1;i < j;i++)
		{
			if (s[j][0].equals(s[i][0]))
			{
				count = 1;
				for (int x = 1; x < n;x++)
				{
					if (!s[j][x].equals(s[i][x]))
					{
						count = 0;
					}
				}
				if (count == 0)
				{
					continue;
				}
				else
				{
					num[i]++;
					return;
				}
			}
		}
		num[j]++;
	}

	public static int Main()
	{
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//	extern int n,num[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] s = new char[200][5];
		String c = new String(new char[500]);
		System.in.read();
		int i = 1;
		while ((c[i] = System.in.read()) != '\n')
		{
			i++;
		}
		for (int j = 1; j <= i - n + 1; j++)
		{
			for (int x = 0;x < n;x++)
			{
				s[j][x] = c.charAt(j + x);
			}
			search(s, j);
		}
		int max = 0;
		for (int j = 1;j <= i - n + 1;j++)
		{
			if (num[j] > max)
			{
				max = num[j];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
		for (int j = 1; j < i - n + 1;j++)
		{
			if (num[j] == max)
			{
				for (int x = 0;x < n;x++)
				{
				System.out.print(s[j][x]);
				}
			}
			System.out.print("\n");
		}

		}
		return 0;
	}

}

