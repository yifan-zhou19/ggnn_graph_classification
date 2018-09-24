package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0'};
		char max;
		int i;
		int imax;
		int l;
		int j;
		while (scanf("%s%3s",str,substr) != EOF)
		{
			i = 0;
			imax = 0;
			max = str[0];
			while (str[i] != null)
			{
				if (str[i] > max)
				{
					max = str[i];
					imax = i;
				}
				i++;
			}
			l = str.length();
			for (i = l;i > imax;i--)
			{
				str[i + 3] = (str + i);
			}
			for (i = imax + 3,j = 2;i > imax;i--,j--)
			{
				str[i] = (substr + j);
			}
			System.out.println(str);
		}
	}
}
