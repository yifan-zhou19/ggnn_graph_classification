package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int i;
		int max1;
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		String ans = new String(new char[20]);
		String p = str;
		String q = substr;
		while (scanf("%s%s",str,substr) != EOF)
		{
			max = 0;
			for (i = 1;str.charAt(i);i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i),max1 = i;
				}
			}
				ans = "";
				strncat(ans,str,max1 + 1);
				ans += substr;
				ans += str.Substring(max1) + 1;
				System.out.printf("%s\n",ans);
		}
		return 0;
	}

}
