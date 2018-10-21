package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		char tempc;
		a = new Scanner(System.in).nextLine();
		int n;
		int i;
		int j = 0;
		int k = 0;
		int sign = 0;
		int[] c = new int[52];
		int tempi;
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
			{
				sign = 0;
				for (j = 0;j < k;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						c[j]++;
						sign++;
						break;
					}
				}
				if (sign == 0)
				{
					k++;
					b = tangible.StringFunctions.changeCharacter(b, k - 1, a.charAt(i));
					c[k - 1]++;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (b.charAt(j) > b.charAt(j + 1))
				{
					tempc = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, tempc);
					tempi = c[j];
					c[j] = c[j + 1];
					c[j + 1] = tempi;
				}
			}
		}
		if (k != 0)
		{
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%c=%d\n",b.charAt(i),c[i]);
		}
		}
		else
		{
			System.out.print("No");
		}
	}


}

