package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[1000]);
		int[] c = new int[300];
		sz = new Scanner(System.in).nextLine();
		int i;
		int k;
		int j;
		k = 0;
		j = 0;
		int n;
		n = sz.length();
		for (i = 0;i < n;i++)
		{
			if (sz.charAt(i) != ' ')
			{
				k++;
			}
			else
			{
				c[j] = k;
				if (k != 0)
				{
				j++;
				}
				k = 0;
			}
		}
		c[j] = k;
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",c[i]);
		}
		System.out.printf("%d",c[j]);
	return 0;
	}


}
