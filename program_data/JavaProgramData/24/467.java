package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		char[][] b = new char[50][100];
		int n;
		int i;
		int j;
		int k;
		int max = 0;
		int min;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		min = n;
		for (i = 0,k = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				for (j = i;j < n;j++)
				{
					if (a.charAt(j) == ' ')
					{
						break;
					}
					else
					{
						b[k][j - i] = a.charAt(j);
					}
				}
				b[k++][j - i] = '\0';
				i = j;
			}

		}
		for (i = 0;i < k;i++)
		{
			if ((int)String.valueOf(b[i]).length() > max)
			{
				max = String.valueOf(b[i]).length();
			}
			if ((int)String.valueOf(b[i]).length() < min)
			{
				min = String.valueOf(b[i]).length();
			}
		}
		for (i = 0;i < k;i++)
		{
			if ((int)String.valueOf(b[i]).length() == max)
			{
			System.out.printf("%s\n",b[i]);
			break;
			}
		}
		for (i = 0;i < k;i++)
		{
			if ((int)String.valueOf(b[i]).length() == min)
			{
			System.out.printf("%s\n",b[i]);
			break;
			}
		}
	}
}
