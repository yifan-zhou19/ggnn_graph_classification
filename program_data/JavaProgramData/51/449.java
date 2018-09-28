package <missing>;

public class GlobalMembers
{
	public static int compare(String str1, String str2, int x)
	{
		int i;
		int l;
		l = str1.length();
		for (i = 0;i < l;i++)
		{
			if (str1[i].equals(str2[i + x]))
			{
				continue;
			}
			else
			{
				return 1;
			}
		}
		return 0;
	}

	public static void Main()
	{
		int i;
		int j;
		int l;
		int k;
		int n;
		int sum;
		int max = 0;
		final String a = "";
		final String b = "";
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i <= l - n;i++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i + j));
			}
			b = tangible.StringFunctions.changeCharacter(b, n, '\0');
			for (j = 0;j <= l - n;j++)
			{
				if (compare(b, a, j) == 0)
				{
					sum++;
				}
			}
			if (sum > max)
			{
				max = sum;
			}
		}
		for (k = 0,i = 0;i <= l - n;i++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i + j));
			}
			b = tangible.StringFunctions.changeCharacter(b, n, '\0');
			for (j = i;j <= l - n;j++)
			{
				if (compare(b, a, j) == 0)
				{
					sum++;
				}
			}
			if (sum == max)
			{
				c = tangible.StringFunctions.changeCharacter(c, k, b);
				k++;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			return;
		}
		System.out.printf("%d\n",max);
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",c.charAt(i));
		}
	}
}

