package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[200][200];
		char ch;
		int i = 0;
		int j = 0;
		int count;
		int longest = 0;
		int shortest = 200;
		int max;
		int min;
		int[] len = new int[200];
		while ((ch = System.in.read()) != '\n')
		{
			if (ch == ' ' || ch == ',')
			{
				if (j != 0)
				{
					len[i] = j;
					i++;
					j = 0;
				}
			}
			else
			{
				str[i][j++] = ch;
			}
		}
		len[i] = j;
		count = i;
		for (i = 0; i <= count; i++)
		{
			if (len[i] < shortest)
			{
				shortest = len[i];
				min = i;
			}
			if (len[i] > longest)
			{
				longest = len[i];
				max = i;
			}
		}
		for (i = 0; i < longest; i++)
		{
			System.out.print(str[max][i]);
		}
		System.out.print("\n");
		for (i = 0; i < shortest; i++)
		{
			System.out.print(str[min][i]);
		}
		System.out.print("\n");
		return 0;
	}



}
