package <missing>;

public class GlobalMembers
{
	public static int change(String p, int n)
	{
		int i;
		int result = 0;
		for (i = 0;i < n;i++)
		{
			result = result * 10 + p[i] - '0';
		}
		return result;
	}
	public static int manzu(int[] p, int n)
	{
		if (n >= p[0] != 0 && n < p[1])
		{
			return 1;
		}
		return 0;
	}
	public static void Main()
	{
		int[][] time = new int[1000][2];
		int i = 0;
		int j = 0;
		int k;
		int num;
		(int)(*p)[2];
		int max;
		int count = 0;
		char ch;
		final String temp = "";
		p = time;
		for (k = 0;k <= 1;k++)
		{
		while ((ch = System.in.read()) != '\n')
		{
			if (ch != ',')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, i++, ch);
			}
			else
			{
				temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
				time[j++][k] = change(temp, i);
				i = 0;
			} ///
		}
		temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
		time[j++][k] = change(temp, i);
		i = 0;
		num = j;
		j = 0;
		}
		max = 0;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < num;j++)
			{
				if (manzu(p[j], i) != 0) ///
				{
					count++;
				}
			}
			if (count > max)
			{
				max = count;
			}
			count = 0;
		}
		System.out.printf("%d %d",num,max);
	}
}

