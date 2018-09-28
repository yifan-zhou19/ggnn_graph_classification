package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c1 = new String(new char[10000]);
		String c2 = new String(new char[10000]);
		int len;
		int i;
		int j;
		int b = 0;
		int k = 0;
		int[][] a = new int[1200][2];
		int[] t = new int[1200];
		int max = 0;
		c1 = new Scanner(System.in).nextLine();
		c2 = new Scanner(System.in).nextLine();
		len = c1.length();
		for (i = 0;i < len;i++)
		{
			if (c1.charAt(i) != ',' && b == 0)
			{
				a[k][0] = c1.charAt(i) - '0';
				b = 1;
			}
			else if (c1.charAt(i) != ',')
			{
				a[k][0] = a[k][0] * 10 + c1.charAt(i) - '0';
			}
			else if (c1.charAt(i) == ',')
			{
				b = 0;
				k++;
			}
		}
		k = 0;
		b = 0;
		len = c2.length();
		for (i = 0;i < len;i++)
		{
			if (c2.charAt(i) != ',' && b == 0)
			{
				a[k][1] = c2.charAt(i) - '0';
				b = 1;
			}
			else if (c2.charAt(i) != ',')
			{
				a[k][1] = a[k][1] * 10 + c2.charAt(i) - '0';
			}
			else if (c2.charAt(i) == ',')
			{
				b = 0;
				k++;
			}
		}
		for (i = 0;i <= k;i++)
		{
			for (j = a[i][0];j < a[i][1];j++)
			{
				t[j]++;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (t[i] > max)
			{
				max = t[i];
			}
		}
		System.out.printf("%d %d",k + 1,max);
	}

}
