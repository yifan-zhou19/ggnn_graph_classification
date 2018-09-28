package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[10000]);
		int i;
		int j;
		int k;
		int t;
		int m;
		int nlen;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			int flag = 0;
			int l = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ch, 0, (Character.SIZE / Byte.SIZE));
			int[] a = new int[26];
			int[] b = new int[26];
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			nlen = ch.length();
			for (j = 0; j < nlen; j++)
			{
				a[ch.charAt(j) - 'a']++;
			}
			for (k = nlen - 1; k >= 0; k--)
			{
				if (a[ch.charAt(k) - 'a'] == 1)
				{
					m = k;
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
			}
			else
			{
				System.out.print(ch.charAt(m));
				System.out.print("\n");
			}
		}
		return 0;
	}


}

