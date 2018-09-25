package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0'};
		char max = 0;
		char[] medium = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int length;
		int mark;
		while (scanf("%s%s",str,substr) == 2)
		{
			max = 0;
			length = str.length();
			for (i = 0;i < length;i++)
			{
				if (max < str[i])
				{
					max = str[i];
					mark = i;
				}
			}
			for (j = 0,i = mark + 1;i < length;i++,j++)
			{
				medium[j] = str[i];
				str[i] = 0;
			}
			str += substr;
			str += medium;
			System.out.printf("%s\n",str);
			for (i = 0;i < 10;i++)
			{
				medium[i] = 0;
				str[i] = 0;
			}
		}


	}
}
