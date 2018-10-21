package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String words = new String(new char[301]);
		int n;
		int i;
		int j;
		int k;
		int all;
		words = new Scanner(System.in).nextLine();
		n = words.length();
		all = 0;
		int[] a = new int[27]; //ci shu
		for (j = 1;j <= 26;j++)
		{
			a[j] = 0;
		}
		char[] b = {'0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		for (i = 0;i < n;i++)
		{
			if (words.charAt(i) == 'a')
			{
				a[1] = a[1] + 1;
			}
			if (words.charAt(i) == 'b')
			{
				a[2] = a[2] + 1;
			}
			if (words.charAt(i) == 'c')
			{
				a[3] = a[3] + 1;
			}
			if (words.charAt(i) == 'd')
			{
				a[4] = a[4] + 1;
			}
			if (words.charAt(i) == 'e')
			{
				a[5] = a[5] + 1;
			}
			if (words.charAt(i) == 'f')
			{
				a[6] = a[6] + 1;
			}
			if (words.charAt(i) == 'g')
			{
				a[7] = a[7] + 1;
			}
			if (words.charAt(i) == 'h')
			{
				a[8] = a[8] + 1;
			}
			if (words.charAt(i) == 'i')
			{
				a[9] = a[9] + 1;
			}
			if (words.charAt(i) == 'j')
			{
				a[10] = a[10] + 1;
			}
			if (words.charAt(i) == 'k')
			{
				a[11] = a[11] + 1;
			}
			if (words.charAt(i) == 'l')
			{
				a[12] = a[12] + 1;
			}
			if (words.charAt(i) == 'm')
			{
				a[13] = a[13] + 1;
			}
			if (words.charAt(i) == 'n')
			{
				a[14] = a[14] + 1;
			}
			if (words.charAt(i) == 'o')
			{
				a[15] = a[15] + 1;
			}
			if (words.charAt(i) == 'p')
			{
				a[16] = a[16] + 1;
			}
			if (words.charAt(i) == 'q')
			{
				a[17] = a[17] + 1;
			}
			if (words.charAt(i) == 'r')
			{
				a[18] = a[18] + 1;
			}
			if (words.charAt(i) == 's')
			{
				a[19] = a[19] + 1;
			}
			if (words.charAt(i) == 't')
			{
				a[20] = a[20] + 1;
			}
			if (words.charAt(i) == 'u')
			{
				a[21] = a[21] + 1;
			}
			if (words.charAt(i) == 'v')
			{
				a[22] = a[22] + 1;
			}
			if (words.charAt(i) == 'w')
			{
				a[23] = a[23] + 1;
			}
			if (words.charAt(i) == 'x')
			{
				a[24] = a[24] + 1;
			}
			if (words.charAt(i) == 'y')
			{
				a[25] = a[25] + 1;
			}
			if (words.charAt(i) == 'z')
			{
				a[26] = a[26] + 1;
			}
		}
		for (k = 1;k <= 26;k++)
		{
			if (a[k] > 0)
			{
				System.out.printf("%c=%d\n",b[k],a[k]);
				all++;
			}


		}
		if (all == 0)
		{
			System.out.print("No");
		}
	}

}
