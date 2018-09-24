package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[20]);
		char t;
		char[] last = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int k;
		int l;
		for (;;)
		{
			if (scanf("%s%s",str,substr) == EOF)
			{
				break;
			}
			t = str.charAt(0);
			k = 0;
			l = str.length();
			for (i = 0;i < l;i++)
			{
				if (str.charAt(i) > t)
				{
					t = str.charAt(i);
					k = i;
				}
			}
			for (i = 0;i <= k;i++)
			{
				last[i] = str.charAt(i);
			}
			for (i = k + 1;i <= k + 3;i++)
			{
				last[i] = substr.charAt(i - k - 1);
			}
			for (i = k + 4;i < l + 3;i++)
			{
				last[i] = str.charAt(i - 3);
			}
			last[l + 3] = 0;
			System.out.println(last);
		}

	}
}
