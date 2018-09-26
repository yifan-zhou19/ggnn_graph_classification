package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void select(char str[100000]);
		int t;
		String str = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= t;i++)
		{
			str = new Scanner(System.in).nextLine();
			select(str);
		}
	}

	public static void select(String str)
	{
		String[] pointer = new String[26];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		pointer[0] = str[0];
		int j = 0;
		int[] k = new int[26];
		p = str[1];
		while (*p != '\0')
		{
			int m;
			int x = 0;
			for (m = 0;m <= j;m++)
			{
				if (*p == pointer[m])
				{
					k[m] = 1;
					x = 1;
					break;
				}
			}
			if (x == 0)
			{
				pointer[++j] = p;
			}
			p++;
		}
		int l;
		int y = 0;
		for (l = 0;l <= j;l++)
		{
			if (k[l] == 0)
			{
				System.out.printf("%c\n",pointer[l]);
				y = 1;
				break;
			}
		}
		if (y == 0)
		{
			System.out.print("no\n");
		}
	}

}

