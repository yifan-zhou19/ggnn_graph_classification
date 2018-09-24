package <missing>;

public class GlobalMembers
{
	public static void calc()
	{
		final int MAX_LEN = 200;
		int[] an1 = new int[MAX_LEN];
		int[] an2 = new int[MAX_LEN];
		String seLine1 = new String(new char[MAX_LEN + 1]);
		String seLine2 = new String(new char[MAX_LEN + 1]);
		//cout << "please input two integers" << endl;
		seLine1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		seLine2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int nLen1 = seLine1.length();
		int nLen2 = seLine2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2, 0, (Integer.SIZE / Byte.SIZE));
		int i;
		int j = 0;
		for (i = nLen1 - 1; i >= 0; i--)
		{
			an1[j++] = seLine1.charAt(i) - '0';
		}
		j = 0;
		for (i = nLen2 - 1; i >= 0;i--)
		{
			an2[j++] = seLine2.charAt(i) - '0';
		}
		for (i = 0; i < nLen1 ;i++)
		{
			//printf("%d\n", an1[i]);
			an1[i] -= an2[i];
			if (an1[i] < 0)
			{
				an1[i] += 10;
				an1[i + 1]--;
			}
		}
		i = nLen1 - 1;
		while (i > 0 && an1[i] == 0)
		{
			i--;
		}
		//printf("%d\n", i);
		for (;i >= 0; i--)
		{
			System.out.print(an1[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			calc();
		}
	}

}

