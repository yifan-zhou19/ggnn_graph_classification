package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1500]);
		int[] r = new int[300];
		int max;
		int smax;
		int i;
		int j;
		int num;
		a = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;a.charAt(i) != 0;)
		{
			if (a.charAt(i) == ',')
			{
				j++;
				i++;
				continue;
			}
			num = 0;
			for (;a.charAt(i) != ',' && a.charAt(i) != 0;i++)
			{
				num = num * 10 + a.charAt(i) - '0';
			}
			r[j] = num;
		}
		r[j + 1] = -1;
		max = -1;
		smax = -1;
		for (i = 0;r[i] != -1;i++)
		{
			if (r[i] > max)
			{
				max = r[i];
			}
		}
		for (i = 0;r[i] != -1;i++)
		{
			if (r[i] > smax && r[i] < max)
			{
				smax = r[i];
			}
		}
		if (smax > -1)
		{
			System.out.printf("%d\n",smax);
		}
		else
		{
			System.out.print("No\n");
		}
	}

}
