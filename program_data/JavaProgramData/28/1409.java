package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[6000]);
		zfc = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k = 1;
		int len;
		int[] num = new int[305];
		int time = 0;
		int sum = 0;
		int sum2 = 0;
		len = zfc.length();
		num[0] = 0;
		for (i = 0;i < len;i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				sum = sum + num[k - 1];
				time++;
				while (zfc.charAt(i + 1) == ' ')
				{
					time++;
					i++;
				}
				num[k] = i - time - sum + 1;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			sum2 += num[i];
		}
		num[k] = len - time - sum2;
		for (i = 1;i < k;i++)
		{
			System.out.printf("%d,", num[i]);
		}
		System.out.printf("%d", num[k]);
		return 0;
	}
}
