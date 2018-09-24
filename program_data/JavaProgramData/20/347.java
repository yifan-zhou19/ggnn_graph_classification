package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c1 = new String(new char[11]);
		String c2 = new String(new char[4]);
		String ans = new String(new char[20]);
		while (scanf("%s%s",c1,c2) != EOF)
		{
			char[] ans = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int max;
		int max_num;
		int n;
		int j;
		int m;
		max = 0;
		n = c1.length();
		for (i = 0;i <= n;i++)
		{
			if (c1.charAt(i) > max)
			{
				max = c1.charAt(i);
				max_num = i;
			}
		}
		for (i = 0;i <= max_num;i++)
		{
			ans[i] = c1.charAt(i);
		}
		ans += c2;
		n = c1.length();
		m = ans.length();
		j = 0;
		for (i = max_num + 1;i <= n;i++)
		{
			ans[m + j] = c1.charAt(i);
			j++;
		}
		System.out.printf("%s\n",ans);
		}
	}
}
