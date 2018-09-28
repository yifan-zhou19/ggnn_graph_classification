package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int m = 0;
		int n = 0;
		int len;
		int[] lon = new int[50];
		int max = 0;
		int min = 100;
		String a = new String(new char[2000]);
		char[][] word = new char[50][40];
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == ' ')
			{
				for (j = k;j < i;j++)
				{
					word[m][n] = a.charAt(j);
					n++;
				}
				word[m][n] = '\0';
				lon[m] = n;
				k = i + 1;
				m++;
				n = 0;
			}
		}
		for (j = k;j < len;j++)
		{
			word[m][n] = a.charAt(j);
			n++;
		}
		word[m][n] = '\0';
		lon[m] = n;
		for (i = 0;i <= m;i++)
		{
			if (max < lon[i])
			{
				max = lon[i];
			}
			if (min > lon[i])
			{
				min = lon[i];
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (max == lon[i])
			{
				System.out.printf("%s\n",word[i]);
				break;
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (min == lon[i])
			{
				System.out.printf("%s\n",word[i]);
				break;
			}
		}
		return 0;
	}
}
