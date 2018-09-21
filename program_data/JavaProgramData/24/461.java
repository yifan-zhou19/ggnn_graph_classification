package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] string =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] len = new int[50];
		int i = 0;
		int num = 0;
		int max;
		int min;
		int maxi;
		int mini;
		while (scanf("%s",string[i]) != EOF)
		{
			len[i] = String.valueOf(String[i]).length();
			i++;
		}
		num = i;

		max = min = len[0];
		maxi = mini = 0;
		for (i = 1;i < num;i++)
		{
			if (len[i] > max)
			{
				max = len[i];
				maxi = i;
			}
			else if (len[i] < min)
			{
				min = len[i];
				mini = i;
			}
		}
		System.out.printf("%s\n",string[maxi]);
		System.out.printf("%s\n",string[mini]);
	}


}
