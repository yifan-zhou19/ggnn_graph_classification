package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		int t;
		int[][] b = new int[100][2];
		char x;
		char y;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		x = a.charAt(0);
		for (i = 1;;i++)
		{
			if (a.charAt(i) != x)
			{
			y = a.charAt(i);
			break;
			}
		}
			while (k < n / 2)
			{
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == '2')
			{
				continue;
			}
			for (j = i + 1;a.charAt(j) == '2';j++)
			{
				;
			}
			if (a.charAt(j) == a.charAt(i))
			{
				continue;
			}
			if (a.charAt(j) == y)
			{
				b[k][0] = i;
				b[k][1] = j;
				k++;
			a = tangible.StringFunctions.changeCharacter(a, i, '2');
			a = tangible.StringFunctions.changeCharacter(a, j, '2');
			}
		}
			}
		for (i = 0;i < n / 2 - 1;i++)
		{
			for (j = 0;j < n / 2 - 1 - i;j++)
			{
				if (b[j][1] > b[j + 1][1])
				{
					t = b[j + 1][1];
					b[j + 1][1] = b[j][1];
					b[j][1] = t;
				t = b[j + 1][0];
				b[j + 1][0] = b[j][0];
				b[j][0] = t;
				}
			}
		}
		for (i = 0;i < n / 2;i++)
		{
			System.out.printf("%d %d\n",b[i][0],b[i][1]);
		}

	}
}

