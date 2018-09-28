package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			String s = new String(new char[100001]);
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len = s.length();
			int i;
			int f = 0;
			int[] a = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			for (i = 0 ; i < len ; i++)
			{
				a[s.charAt(i) - 'a']++;
			}
			int j;
			char c;
			int mina = 1000001;
			for (i = 0 ; i < 26; i++)
			{
				if (a[i] == 1)
				{
					f = 1;
					for (j = 0; j < len; j++)
					{
						if (s.charAt(j) == i + 'a')
						{
							if (mina > j)
							{
								mina = j;
								c = s.charAt(j);
							}
							break;
						}
					}
				}
			}
			if (f == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print(c);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

