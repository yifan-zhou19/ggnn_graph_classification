package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int l;
	public static int len = 0;
	public static int sum = 0;
	public static int[][] array = new int[100][100];
	public static void guilinhang(int a)
	{
		int min = array[a][0];
		for (l = 0;l < len;l++)
		{
			if (array[a][l] < min)
			{
				min = array[a][l];
			}
		}
		for (l = 0;l < len;l++)
		{
			array[a][l] = array[a][l] - min;
		}
	}
	public static void guilinlie(int a)
	{
		int min = array[0][a];
		for (l = 0;l < len;l++)
		{
			if (array[l][a] < min)
			{
				min = array[l][a];
			}
		}
		for (l = 0;l < len;l++)
		{
			array[l][a] = array[l][a] - min;
		}
	}
	public static void xiaojian(int a)
	{
		if (a == 2)
		{
			return;
		}
		else if (a > 2)
		{
			for (i = 1;i < a - 1;i++)
			{
				for (j = 0;j < a;j++)
				{
					array[j][i] = array[j][i + 1];
				}
			}
			for (i = 1;i < a - 1;i++)
			{
				for (j = 0;j < a;j++)
				{
					array[i][j] = array[i + 1][j];
				}
			}
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			len = n;
			sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (len >= 2)
			{
				for (i = 0;i < len;i++)
				{
					guilinhang(i);
				}
				for (i = 0;i < len;i++)
				{
					guilinlie(i);
				}
				sum = sum + array[1][1];
				xiaojian(len);
				len--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

