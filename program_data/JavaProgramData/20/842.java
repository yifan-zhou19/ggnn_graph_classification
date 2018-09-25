package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0'};
		char max;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			substr = ConsoleInput.readToWhiteSpace(true).charAt(0);
			max = str[0]; //?????
			String p = str;
			String q = substr;
			for (p = str + 1;p <= str + 9;p++)
			{
				if (max < *p)
				{
					max = p;
				}
			}
			for (p = str;p < str + 10;p++) //??????????
			{
				if (*p == max)
				{
					break;
				}
			}
			k = p - str;
			for (p = str + 9;p > str + k;p--) //?????????????
			{
				*(p.Substring(3)) = *p;
			}
			for (p = str + k + 1;p <= str + k + 3;p++,q++) //??????
			{
				*p = q;
			}
			p = str;
			System.out.print(p);
			System.out.print("\n");
			for (i = 0;i < 10;i++) //??????
			{
				str[i] = 0;
			}
		}
		return 0;
	}
}

