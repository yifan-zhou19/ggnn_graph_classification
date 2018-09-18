package <missing>;

public class GlobalMembers
{
	public static void insert(String str, String substr)
	{
		int i;
		int j;
		int k;
		int lenstr;
		int lensubstr;
		int lentemp;
		int max;
		char[] temp = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		lenstr = str.length();
		lensubstr = substr.length();
		max = 0;
		for (i = 0;i <= lenstr - 1;i++)
		{
			if (str[i].compareTo(str[max]) > 0)
			{
			max = i;
			}
		}
		for (i = 0,j = max + 1;j <= lenstr - 1;i++,j++)
		{
			temp[i] = str[j];
		}
		lentemp = temp.length();
		for (i = 0,j = max + 1;i <= lensubstr;i++,j++)
		{
			str[j] = substr[i];
		}
		for (i = 0,k = j - 1;i <= lentemp - 1;i++,k++)
		{
			str[k] = temp[i];
		}
	}
	public static void Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0'};
		int len;
		int i;
		while (scanf("%s%s",str,substr) != EOF)
		{
			insert(str, substr);
			len = str.length();
			for (i = 0;i <= len - 1;i++)
			{
			System.out.printf("%c",str[i]);
			}
			System.out.print("\n");
			for (i = 0;i <= 19;i++)
			{
			str[i] = 0;
			}
			for (i = 0;i <= 3;i++)
			{
			substr[i] = 0;
			}
		}
	}


}
