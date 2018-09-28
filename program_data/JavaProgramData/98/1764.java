package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[1000];
		int c = 0;
		char[][] a = new char[1000][40]; //??????
		for (i = 0;i < m;i++) //??????????????????
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < m;i++) //????????????
		{
			for (j = 0;;j++)
			{
				if (a[i][j] != '\0')
				{
					b[i]++;
				}
				else
				{
					break;
				}
			}
		}
		i = 0;
		for (i = 0;i < m;i++) //?k???????
		{
			k = k + b[i] + 1; //??????

			if (k > 81) //??k??80????
			{
				for (j = c;j < i - 1;j++)
				{
					System.out.print(a[j]);
					System.out.print(" ");
				}
				System.out.print(a[j]);
				System.out.print("\n");
					k = 0;
					c = i;
					i--;
			}
		}
		for (j = c;j < i - 1;j++)
		{
			System.out.print(a[j]);
			System.out.print(" ");
		}
		System.out.print(a[j]);
		System.out.print("\n");

		return 0;
	}
}

