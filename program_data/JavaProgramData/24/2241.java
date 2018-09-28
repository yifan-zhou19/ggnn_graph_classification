package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[2000]);
		int[] k = new int[200];
		int i;
		int j = 1;
		int n;
		int m = 1;
		int l = 1;
		int[] o = new int[200];
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ',' && a.charAt(i) != ' ')
			{
				k[j]++;
			}
			else
			{
				if (a.charAt(i) == ' ')
				{
					o[j] = i;
					j++;
				}

			}
		}
		o[j] = n;

			for (i = 1;i <= j;i++)
			{
			for (l = 1;l <= j;l++)
			{
				if (k[i] < k[l])
				{
					break;
				}
			}
			if (l == j + 1)
			{
			break;
			}
			}
				for (l = o[i] - k[i];l < o[i];l++)
				{
			System.out.printf("%c",a.charAt(l));
				}
		System.out.print("\n");
		for (i = 1;i <= j;i++)
		{
			for (l = 1;l <= j;l++)
			{
				if (k[i] > k[l])
				{
					break;
				}
			}
			if (l == j + 1)
			{
			break;
			}
		}
		for (l = o[i] - k[i];l < o[i];l++)
		{
			System.out.printf("%c",a.charAt(l));
		}

	}

}
