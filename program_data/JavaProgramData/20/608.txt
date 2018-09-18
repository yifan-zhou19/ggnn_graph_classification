package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int max;
	int i;
	int max_index;
	String str1 = new String(new char[20]);
	String str2 = new String(new char[20]);
	while (scanf("%s%s", str1, str2) != EOF)
	{
		int[] ans = new int[20];
	max = 0;
	for (i = 1;str1.charAt(i);i++)
	{
	if (str1.charAt(i) > max)
	{
		max = str1.charAt(i), max_index = i;
	}
	}

	strncat(ans, str1, max_index + 1);
	ans += str2;
	ans += str1.Substring(max_index) + 1;
	System.out.printf("%s\n", ans);
	}
	return 0;
	}
}
