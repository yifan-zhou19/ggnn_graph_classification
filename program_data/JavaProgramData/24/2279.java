package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int min;
		int max;
		int k;
		int l;
		int n;
		int[] a = new int[200];
		String ch = new String(new char[1001]);
		char[][] str = new char[200][20];
		ch = new Scanner(System.in).nextLine();
		n = ch.length();
		ch = tangible.StringFunctions.changeCharacter(ch, n, '\0');
		for (i = 0;i < n;i++)
		{
			if (ch.charAt(i) == ',')
			{
				ch = tangible.StringFunctions.changeCharacter(ch, i, ' ');
			}
			if ((ch.charAt(i) == ' ') && (ch.charAt(i + 1) == ' '))
			{
				for (j = i + 1;j < n - 1;j++)
				{
					ch = tangible.StringFunctions.changeCharacter(ch, j, ch.charAt(j + 1));
				}
				n = n - 1;
			}
		}
		l = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{

			if ((ch.charAt(i) == ' ') && (i != 0) && (i != n - 1))
			{
				l = l + 1;
				k = 0;
			}
			else
			{
				str[l][k] = ch.charAt(i);
			a[l] = k;
			k = k + 1;
			}
		}
		if (l == 0)
		{
			for (i = 0;i < a[0] + 1;i++)
			{
		System.out.printf("%c",str[0][i]);
			}
		System.out.print("\n");
		for (i = 0;i < a[0] + 1;i++)
		{
		System.out.printf("%c",str[0][i]);
		}
		}
		else
		{
			min = a[0];
		max = a[0];
		n = 0;
		k = 0;
		for (i = 0;i <= l;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
				n = i;
			}
				if (a[i] > max)
				{
					max = a[i];
					k = i;
				}
		}
		if (min == max)
		{
			for (i = 0;i < a[0] + 1;i++)
			{
		System.out.printf("%c",str[0][i]);
			}
		System.out.print("\n");
		for (i = 0;i < a[0] + 1;i++)
		{
		System.out.printf("%c",str[0][i]);
		}
		}
		else
		{
			for (i = 0;i < max + 1;i++)
			{
				System.out.printf("%c",str[k][i]);
			}
			System.out.print("\n");
			for (i = 0;i < min + 1;i++)
			{
				System.out.printf("%c",str[n][i]);
			}
		}
		}
		return 0;
	}

}

