package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String f = new String(new char[1000]);
		String b = new String(new char[1000]);
		int[] c = new int[1000];
		int q;
		int k;
		int i;
		int ff;
		int j;
		int t;
		int max;
		int max2;
		f = new Scanner(System.in).nextLine();
		b = tangible.StringFunctions.changeCharacter(b, 0, -1);
		k = f.length();
		q = 1;
		for (i = 0;i < k;i++)
		{
			if (f.charAt(i) == ',')
			{
				b = tangible.StringFunctions.changeCharacter(b, q, i);
				q++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, q, k);
		if (q == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 0;i < q;i++)
		{
			for (j = b.charAt(i) + 1;j < b.charAt(i + 1);j++)
			{
				t = f.charAt(j) - '0';
				c[i] = c[i] * 10 + t;
			}
		}
		max = c[0];
		for (i = 0;i < q;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		for (i = 0;i < q;i++)
		{
			if (c[i] != max)
			{
				ff = 1;
				break;
			}
		}

		max2 = -10000;
		for (i = 0;i < q;i++)
		{
			if (c[i] > max2 && c[i] != max)
			{
				max2 = c[i];
			}
		}
		if (max2 == -10000)
		{
			System.out.print("No");
		}
		else
		{
		System.out.printf("%d",max2);
		}

		}
	}
}

