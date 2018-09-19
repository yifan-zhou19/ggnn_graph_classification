package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		char[] str1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int k;
		int e;
		int b;
		while ((scanf("%s%s",str,substr)) != EOF)
		{
			b = str.length();
			for (j = 0;j < b;j++)
			{
				e = 0;
				for (k = 0;k < b;k++)
				{
					if (str.charAt(k) > str.charAt(j))
					{
						e = 1;
					}
				}
				if (e == 0)
				{
					break;
				}
			}
			for (k = 0;k <= j;k++)
			{
				str1[k] = str.charAt(k);
			}
			for (k = 0;k < 3;k++)
			{
				str1[j + k + 1] = substr.charAt(k);
			}
			for (k = j + 1;k < b;k++)
			{
				str1[k + 3] = str.charAt(k);
			}
			str1[b + 3] = 0;
			str = str1;
			System.out.println(str);
		}
		return 0;
	}
}
