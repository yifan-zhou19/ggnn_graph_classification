package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[][] b = new int[2][50];
		int i;
		int j;
		int k;
		int l = 0;
		int len;
		final String str = "";
		char c;
		char d;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < len;i++)
		{
			a[i] = i;
		}
		c = str.charAt(0);
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) != c)
			{
				d = str.charAt(i);
				break;
			}
		}
		for (i = 0;i < len / 2;i++)
		{
			for (j = 0;j < len - i * 2;j++)
			{
				if (str.charAt(j) == c && str.charAt(j + 1) == d)
				{
					b[0][i] = a[j];
					b[1][i] = a[j + 1];
					for (k = j;k < len - 2 * i - 2;k++)
					{
						a[k] = a[k + 2];
						str = tangible.StringFunctions.changeCharacter(str, k, str.charAt(k + 2));
					}
					str = tangible.StringFunctions.changeCharacter(str, len - 2 * i - 2, '\0');
					break;
				}
			}
		}
		for (i = 0;i < len / 2;i++)
		{
			System.out.printf("%d %d\n",b[0][i],b[1][i]);
		}
		return 0;
	}
}

