package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20000]);
		char[][] b = new char[200][100];
		int[] c = new int[200];
		cin.get(a,20000);

		int i = 0;
		int j = 0;
		int k = 0;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == ' ' || a.charAt(i) == ',')
			{
				j++;
				k = 0;
			}
			else
			{
				b[j][k++] = a.charAt(i);
			}
			i++;
		}

		int max = String.valueOf(b[0]).length();
		int maxpis = 0;
		int min = String.valueOf(b[0]).length();
		int minpis = 0;
		for (i = 0 ; i < 200 ; i++)
		{
			c[i] = String.valueOf(b[i]).length();
			if (c[i] > max)
			{
				maxpis = i;
				max = c[i];
			}
			if (c[i] < min && c[i] > 0)
			{
				minpis = i;
				min = c[i];
			}
		}

		System.out.print(b[maxpis]);
		System.out.print("\n");
		System.out.print(b[minpis]);
		System.out.print("\n");

		return 0;
	}

}
