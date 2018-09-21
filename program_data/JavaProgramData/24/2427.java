package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String word = "";
		int[] len = new int[200];
		int i;
		int j;
		int v = 0;
		int max;
		int min;
		char c;
		for (i = 0,j = 0;(c = System.in.read()) != '\n';)
		{
			if (c == ' ' || c == ',')
			{
				if (v == 1)
				{
					len[i] = j;
					i++;
					j = 0;
					v = 0;
				}
			}
			else
			{
				v = 1;
				word.charAt(i)[j] = c;
				j++;
			}
		}
		len[i] = j;
		max = len[0];
		min = len[0];
		for (i = 0;word.charAt(i)[0] != '\0';i++)
		{
			if (len[i] > max)
			{
				max = len[i];
			}
			if (len[i] < min)
			{
				min = len[i];
			}
		}
		for (i = 0;word.charAt(i)[0] != '\0';i++)
		{
			if (len[i] == max)
			{
				System.out.printf("%s\n",word.charAt(i));
			break;
			}
		}

		for (i = 0;word.charAt(i)[0] != '\0';i++)
		{
			if (len[i] == min)
			{
				System.out.printf("%s\n",word.charAt(i));
			break;
			}
		}

		return 0;
	}
}
