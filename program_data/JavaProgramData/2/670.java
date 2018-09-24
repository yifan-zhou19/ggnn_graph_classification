package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[26];
		int max;
		int[] num = new int[n];
		int i;
		int j;
		int s;
		char maxname;
		char[][] name = new char[n][10];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			name[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			s = String.valueOf(name[i]).length();
			for (j = 0;j < s;j++)
			{
				a[name[i][j] - 'A']++;
			}
		}
		max = a[0],maxname = 'A';
		for (i = 1;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i],maxname = 'A' + i;
			}
		}
		System.out.print(maxname);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			s = String.valueOf(name[i]).length();
			for (j = 0;j < s;j++)
			{
				if (name[i][j] == maxname)
				{
					System.out.print(num[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

