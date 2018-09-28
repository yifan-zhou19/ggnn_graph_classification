package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char[][] c = new char[1000][1000];
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int x;
		int y;
		int b = 0;
		int d = 0;
		int[] length = new int[200];
		int max;
		int min;

		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) != ' ') && (a.charAt(i) != ','))
			{
				c[b][d] = a.charAt(i);
				d++;
				length[b]++;
			}
			else if (((a.charAt(i) == ' ') && (a.charAt(i - 1) != ',')) || ((a.charAt(i) == ',') && (a.charAt(i + 1) == ' ')))
			{
				b++;
				d = 0;
			}
			else if ((a.charAt(i) == ' ') && (a.charAt(i - 1) == ','))
			{
				continue;
			}
		}


		max = length[0];
		x = 0;

		for (i = 0;i < b;i++)
		{
			if (max < length[i + 1])
			{
				max = length[i + 1];
				x = i + 1;
			}
		}
		for (j = 0;j < length[x];j++)
		{
			System.out.printf("%c",c[x][j]);
		}
		System.out.print("\n");


		min = length[0];
		y = 0;

		for (i = 0;i < b;i++)
		{
			if (min > length[i + 1])
			{
				min = length[i + 1];
				y = i + 1;
			}
		}
		for (j = 0;j < length[y];j++)
		{
			System.out.printf("%c",c[y][j]);
		}

		return 0;
	}

}
