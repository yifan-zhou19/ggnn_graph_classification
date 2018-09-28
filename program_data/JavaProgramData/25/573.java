package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "1";
		char temp;
		int s;
		int[] b = new int[105];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		while (s-- != 0)
		{
			for (i = 0;a.charAt(i) != 0;i++)
			{
				b[i] = (a.charAt(i) - '0') * 2;
			}
			for (j = 0;j < i;j++)
			{
				if (j == i - 1 && b[j] >= 10)
				{
					b[j] -= 10;
					b[j + 1] = 1;
					i++;
					break;
				}
				if (b[j] >= 10)
				{
					b[j] -= 10;
					b[j + 1]++;
				}
			}
			for (j = 0;j < i;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, b[j] + '0');
			}
			a = a.substring(0, j);
		}
		for (j = 0,k = i - 1;j < k;j++,k--)
		{
			temp = a.charAt(j);
			a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(k));
			a = tangible.StringFunctions.changeCharacter(a, k, temp);
		}
		System.out.println(a);
	}
}

