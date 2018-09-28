package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] b = new int[200];
		int i;
		int j = 0;
		int k = 0;
		int m;
		String a = new String(new char[1000]);
		for (i = 0; a.charAt(i - 1) != '\n'; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) != ',' && a.charAt(i) >= 48 && a.charAt(i) <= 57)
			{
				b[k] = b[k] * 10 + a.charAt(i) - 48;
			}
			if (a.charAt(i) == ',')
			{
				k++;
			}
		}
		k++;
		for (i = 1; i <= k - 1; i++)
		{
			if (b[i] != b[i - 1])
			{
				break;
			}
			if (i > k - 2)
			{
				System.out.print("No\n");
			}
		}
		if (k == 1)
		{
			System.out.print("No\n");
		}
		else
		{
		for (i = 0; i < k; i++)
		{
			for (j = i + 1; j < k; j++)
			{
				if (b[i] < b[j])
				{
					m = b[i];
					b[i] = b[j];
					b[j] = m;
				}
			}
		}
		for (i = 1; i < k; i++)
		{
			if (b[i] != b[i - 1])
			{
				break;
			}
		}
		if (b[i] != 0)
		{
		System.out.printf("%d\n", b[i]);
		}
		}

	}


}

