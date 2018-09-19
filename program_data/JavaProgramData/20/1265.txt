package <missing>;

public class GlobalMembers
{
	public static int locate(String s)
	{
		int i;
		int max_loc = 0;
		int len;
		len = s.length();
		for (i = 1;i < len;i++)
		{
			if (s[i].compareTo(s[max_loc]) > 0)
			{
				max_loc = i;
			}
		}
		return max_loc;
	}
	public static void Main()
	{
		char[][] a = new char[100][21];
		char[][] b = new char[100][30];
		String max = new String(new char[100]);
		String len = new String(new char[100]);
		int i = -1;
		int j;
		int m;
		do
		{
			i++;
		} while (scanf("%s%s",a[i],b[i]) != EOF);

		for (j = 0;j < i;j++)
		{
			max = tangible.StringFunctions.changeCharacter(max, j, locate(a[j]));
			len = tangible.StringFunctions.changeCharacter(len, j, String.valueOf(b[j]).length());
			m = max.charAt(j) + 1;
			while (a[j][m] != '\0')
			{
				b[j][len.charAt(j)++] = a[j][m++];
			}
			b[j][len.charAt(j)] = '\0';
			a[j][max.charAt(j) + 1] = '\0';
			System.out.printf("%s\n",strcat(a[j],b[j]));
		}
	}
}

