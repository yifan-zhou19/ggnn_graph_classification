package <missing>;

public class GlobalMembers
{
	public static int search()
	{
		int i;
		int l;
		int j;
		String a = new String(new char[100000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		int[] b = new int[27];
		for (i = 0; i < l; i++)
		{
			b[a.charAt(i) - 'a']++;
		}
		int p = 0;
		int mark = l - 1;
		int k;
		int kk;
		for (i = 0; i < 26; i++)
		{
			if (b[i] == 1)
			{
				p = 1;
				k = i;
				for (j = 0; j < l; j++)
				{
					if (a.charAt(j) == 'a' + k)
					{
						if (j < mark)
						{
							mark = j;
							kk = k;
						}
					}
				}
			}
		}
		if (p == 1)
		{
			System.out.print(a.charAt(mark));
			System.out.print("\n");
		}
		else
		{
			System.out.print("no");
			System.out.print("\n");
		}
		return 0;
	}
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			search();
		}
		return 0;
	}
}

