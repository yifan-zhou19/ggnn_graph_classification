package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int i;
		int max = 0;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0'};
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String p;

		while (scanf("%s %s",str,substr) != EOF)
		{
			max = str[0];
			j = 0;
			p = str[0];
			for (i = 0;str[i] != 0;i++)
			{
				if (str[i] > max)
				{
					max = str[i];
					p = str[i];
					j = i;
				}
			}
			strncat(s,str,j + 1);
			s += substr;
			s += p.Substring(1);
			System.out.printf("%s\n",s);
			s = "".toCharArray();
			str = "".toCharArray();
			substr = "".toCharArray();
		}
	}

}
