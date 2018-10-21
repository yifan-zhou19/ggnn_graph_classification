package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		int n;
		int k;
		int l;
		int m;
		int s;
		int max;
		int min;
		int[] num = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();

		for (k = 0,i = 0,j = 0;a.charAt(k) != 0;k++)
		{
			if (a.charAt(k) == ' ' || a.charAt(k) == ',')
			{
				num[i] = j;
				i++;
				j = 0;
			}
			else
			{
				b[i][j] = a.charAt(k);
				j++;
			}
		}

			num[i] = j;
			n = i;
			l = s = 0;
			max = min = num[0];

		for (i = 1;i <= n;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				l = i;
			}
			else if (num[i] < min && num[i]>0)
			{
				min = num[i];
				s = i;
			}
		}

		System.out.println(b[l]);
		System.out.println(b[s]);

	}

}

