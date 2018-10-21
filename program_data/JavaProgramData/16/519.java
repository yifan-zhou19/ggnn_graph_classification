package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char n;
		int[] p = new int[6];
		int i = 0;
		int j = 0;
		int k = 0;
		while ((n = System.in.read()) != '\n')
		{
			k = n - '0';
			p[i] = k;
			i++;
		}
		for (j = (i - 1); j >= 0; j = j - 1)
		{
			System.out.print(p[j]);
		}
		return 0;
	}


}
