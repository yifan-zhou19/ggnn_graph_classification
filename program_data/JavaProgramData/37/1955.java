package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char d;
		int len;
		int n;
		int i;
		int j;
		int c;
		int pos;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = str.length();
			int[] f = new int[26];
			int[] po = new int[26];
			int min = 2000000;
			for (p = str.Substring(len) - 1; p >= str; p--)
			{
				c = p - 'a';
				f[c]++;
				po[c] = p - str;
			}
			for (j = 0; j < 26; j++)
			{
				if (f[j] == 1)
				{
					if (po[j] < min)
					{
						min = po[j];
						d = j + 'a';
					}
				}
			}
			if (min == 2000000)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print(d);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

