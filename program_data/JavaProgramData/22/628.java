package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1501]);
		int[] b = new int[300];
		int l;
		int n;
		int i;
		int j;
		int max;
		int maxi = 0;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		n = 0;
		for (i = 0;i < l;)
		{
			b[n] = 0;
			j = i;
			while (a.charAt(j) != ',' && j < l)
			{
				b[n] = b[n] * 10 + a.charAt(j) - '0';
				j++;
			}
			n++;
			i = j + 1;
		}

		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] < max && b[i]> maxi)
			{
				maxi = b[i];
			k++;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",maxi);
		}



		return 0;
	}
}
