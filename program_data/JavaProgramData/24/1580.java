package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dc = new String(new char[4000]);
		int i;
		int j;
		int k = 1;
		int len;
		int[] zms = new int[201];
		int max = 0;
		int min = 0;
		int maxnum;
		int minnum;
		dc = new Scanner(System.in).nextLine();
		len = dc.length();
		for (i = 0;i < len;i++)
		{
			if (dc.charAt(i) == ' ' || dc.charAt(i) == ',')
			{
				dc = dc.substring(0, i);
				zms[k] = i;
				k++;
			}
		}
		zms[k] = len;
		maxnum = zms[1];
		minnum = zms[1];
		for (j = 1;j < k;j++)
		{
			if (zms[j + 1] - zms[j] - 1 > maxnum)
			{
				maxnum = zms[j + 1] - zms[j] - 1;
				max = zms[j] + 1;
			}
		}
		for (j = 1;j < k;j++)
		{
			if (zms[j + 1] - zms[j] - 1 < minnum && zms[j + 1] - zms[j] - 1>0)
			{
				minnum = zms[j + 1] - zms[j] - 1;
				min = zms[j] + 1;
			}
		}
		System.out.printf("%s\n", dc.charAt(max));
		System.out.printf("%s\n", dc.charAt(min));
		return 0;
	}

}
