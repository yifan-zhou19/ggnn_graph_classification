package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String str = new String(new char[500]);
		String sub = new String(new char[4]);
		String st = str;
		String su = sub;
		char c;
		while (scanf("%s%s",str,sub))
		{
			k = str.length();
			if (k == 0)
			{
				break;
			}
			c = st;
			j = 0;
			for (i = 0;i < k;i++)
			{
				if (*(st.Substring(i)) > c)
				{
					c = (st.Substring(i));
					j = i;
				}
			}
			for (i = k;i > j;i--)
			{
				*(st.Substring(i) + 3) = *(st.Substring(i));
			}
			for (i = 1;i < 4;i++)
			{
				*(st.Substring(j) + i) = *(su.Substring(i) - 1);
			}
			System.out.printf("%s\n",st);
			st = null;
		}
		return 0;
	}
}
