package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len1;
		int len2;
		String a = new String(new char[4000]);
		String b = new String(new char[4000]);
		char[][] c = new char[1000][4];
		char[][] d = new char[1000][4];
		int[] ren = new int[1000];
		int[] ren2 = new int[1000];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = a.length();
		len2 = b.length();
		int k = 0;
		int j = 0;
		for (int i = 0;i < len1;i++)
		{
			if (a.charAt(i) == ',')
			{
					j++;
			k = 0;
			}
			else
			{
				c[j][k] = a.charAt(i);
				k++;
			}
		}
		System.out.print(j + 1);
		System.out.print(" ");
		j = 0,k = 0;
		for (int i = 0;i < len2;i++)
		{
			if (b.charAt(i) == ',')
			{
				j++;
				k = 0;
			}
			else
			{
				d[j][k] = b.charAt(i);
				k++;
			}
		}
			for (int i = 0;i <= j;i++) //???int?
			{
				ren[i] = (int)Double.parseDouble(c[i]);
			}
			for (int i = 0;i <= j;i++)
			{
				ren2[i] = (int)Double.parseDouble(d[i]);
			}
			int[] count = new int[2000];
			for (int i = 0;i < 2000;i++)
			{
				count[i] = 0;
			}
			for (int i = 0;i < 2000;i++)
			{
				for (int k = 0;k <= j;k++)
				{
					if (ren[k] <= i != 0 && ren2[k]> i)
					{
						count [i]++;
					}
				}
			}
			int max = 0;
			for (int i = 0;i < 2000;i++)
			{
				if (count[i] > max)
				{
					max = count[i];
				}
			}
			System.out.print(max);
			System.out.print("\n");
		return 0;
	}
}

