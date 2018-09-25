package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] wo = new char[50][50];
		char[][] in = new char[50][50];
		char[][] out = new char[50][50];
		int i = 0;
		int j;
		int k = 0;
		int temp = 0;
		while (scanf("%s %s",wo[i],in[i]) != EOF)
		{
			i++;
		}
		for (j = 0;j <= i;j++)
		{
	temp = 0;
			for (k = 0;wo[j][k] != 0;k++)
			{
				if (wo[j][k] > wo[j][temp])
				{
					temp = k;
				}
			}
			out[j] = wo[j];
			for (k = temp + 1;k < temp + 1 + String.valueOf(in[j]).length();k++)
			{
				out[j][k] = in[j][k - temp - 1];
			}
			do
			{
				temp++;
				out[j][k] = wo[j][temp];
				k++;
			}while (wo[j][temp] != 0);
	if (j != i)
	{
			System.out.printf("%s\n",out[j]);
	}
	else
	{
		System.out.printf("%s",out[j]);
	}

		}

	}
}
