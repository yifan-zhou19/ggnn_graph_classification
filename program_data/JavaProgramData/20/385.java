package <missing>;

public class GlobalMembers
{
	public static String str1 = new String(new char[50]);
	public static String str2 = new String(new char[50]);
	public static String ans = new String(new char[50]);
	public static void Main()
	{
		char cutin = 0;

		while (scanf("%s%s",str1,str2) != EOF)
		{
			cutin();
			System.out.printf("%s\n",ans);
		}
	}

	public static char cutin()
	{
		int i;
		int max = 0;
		int max_index = 0;
		String temp = new String(new char[50]);
		String p = str1;
		for (i = 0;str1.charAt(i) != '\0';i++)
		{
			if (*(p.Substring(i)) > max)
			{
				max = (p.Substring(i));
				max_index = i;
			}
		}
		ans = "";
		strncat(ans,str1,max_index + 1);
		ans += str2;
		String q1 = str1.charAt(max_index + 1);
		String q2 = temp;
		for (i = 0;str1.charAt(i) != '\0';i++)
		{
			*(q2.Substring(i)) = *(q1.Substring(i));
		}
		*(q2.Substring(i)) = '\0';
		ans += temp;
		return 0;

	}
}
