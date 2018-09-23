package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] name = new int[26];
		int max;
		int[] a = new int[1000];
		int t = 0;
		char[][] word = new char[1000][30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = -1;i < n;i++)
		{
			word[i] = new Scanner(System.in).nextLine();
		}
		for (j = 0;j < 26;j++)
		{
		for (i = 0;i < n;i++)
		{
			while (word[i][k] != '\0')
			{
				if (word[i][k] == 'A' + j)
				{
					name[j] = name[j] + 1;
				}
				k = k + 1;
			}
			k = 0;
		}
		}
		k = 0;
		max = name[0];
		j = 0;
		for (i = 1;i < 26;i++)
		{
			if (name[i] > max)
			{
			max = name[i];
			j = i;
			}

		}
		for (i = 0;i < n;i++)
		{
			while (word[i][k] != '\0')
			{
				if (word[i][k] == 'A' + j)
				{

					a[t] = i;
					t = t + 1;
					k = 0;
					break;
				}
				k = k + 1;
			}
			k = 0;
		}
		System.out.printf("%c\n%d\n",'A' + j,max);
		k = 0;
		for (i = 0;i < t;i++)
		{
			while (word[a[i]][k] != ' ')
			{
				System.out.printf("%c",word[a[i]][k]);
				k = k + 1;
			}
			System.out.print("\n");
			k = 0;
		}
	}
}

