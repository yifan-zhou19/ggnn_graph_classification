package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String v = new String(new char[2000]);
		char[][] a = new char[50][50];
		int i = 0;
		int m = 100;
		int n = 0;
		int p1;
		int p2;
		int k = 0;
		int j = 0;
		while ((v[i] = System.in.read()) != '\n')
		{
			if (v.charAt(i) != ' ')
			{
				a[j][k] = v.charAt(i);
				k++;
			}
			if (v.charAt(i) == ' ')
			{
				a[j][k] = '\0';
				j++;
				k = 0;
			}
			i++;
		}
		a[j][k] = '\0';
		for (i = 0;i <= j;i++)
		{
			if (String.valueOf(a[i]).length() > n)
			{
				n = String.valueOf(a[i]).length();
				p1 = i;
			}
			if (String.valueOf(a[i]).length() < m)
			{
				m = String.valueOf(a[i]).length();
				p2 = i;
			}
		}
				System.out.printf("%s\n",a[p1]);
				System.out.printf("%s\n",a[p2]);
	}

}
