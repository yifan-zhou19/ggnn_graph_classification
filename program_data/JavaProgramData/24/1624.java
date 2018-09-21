package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		char[][] b = new char[200][50];
		String x = new String(new char[50]);
		int[] c = new int[200];
		int k;
		int m = 0;
		int n;
		int i;
		int max;
		int min;
		int want1;
		int want2;
		a = new Scanner(System.in).nextLine();
		for (k = 0;k < 200;k++)
		{
			for (i = 0;a.charAt(m) != ' ' && a.charAt(m) != ',' && a.charAt(m) != '\0';i++, m++)
			{
				x = tangible.StringFunctions.changeCharacter(x, i, a.charAt(m));
			}
			x = tangible.StringFunctions.changeCharacter(x, i, '\0');
			b[k] = x;
			 if (a.charAt(m) == '\0')
			 {
				break;
			 }
			 if (a.charAt(m) == ',')
			 {
				 m = m + 2;
			 }
			 else
			 {
			m = m + 1;
			 }
		}
		n = k + 1;
		for (i = 0;i < n;i++)
		{
			c[i] = String.valueOf(b[i]).length();
		}
		max = c[0];
		want1 = 0;
		for (i = 1;i < n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
				want1 = i;
			}
		}
	   min = c[0];
	   want2 = 0;
		for (i = 1;i < n;i++)
		{
			if (c[i] < min)
			{
				min = c[i];
				want2 = i;
			}
		}
		System.out.printf("%s\n",b[want1]);
		System.out.printf("%s",b[want2]);
		return 0;
	}

}

