package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int i;
		int j;
		int k;
		int n = 0;
		int[] posi = new int[300];
		int b1;
		int b2 = -1;
		int t;
		String s = new String(new char[2000]);
		s = new Scanner(System.in).nextLine();
		posi[0] = 0;
		for (i = 1,j = 1;i <= s.length() - 1;i++)
		{
			if (s.charAt(i) == ',')
			{
				posi[j] = i + 1;
				j++;
			}
		}
		posi[j] = s.length() + 1; //?j???posi[0]to posi j-1
		for (i = 0;i <= j - 1;i++)
		{
			for (k = posi[i];k <= posi[i + 1] - 2;k++)
			{
				a[i] = s.charAt(k) - 48 + 10 * a[i];
			}
		}
		b1 = a[0];
		for (i = 1;i <= j - 1;i++)
		{
			if (a[i] > b1)
			{
				t = b1;
				b1 = a[i];
				b2 = t;
			}
			else if (a[i] < b1 && a[i]> b2)
			{
				b2 = a[i];
			}
		}
		if (b2 >= 0)
		{
			System.out.printf("%d\n",b2);
		}
		else
		{
			System.out.print("No\n");
		}
		return 0;
	}

}
