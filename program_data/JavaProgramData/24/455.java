package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int m;
		int maxnum;
		int minnum;
		int temp0;
		int max;
		int min;
		final String a = "";
		char temp;
		k = 0;
		m = 0;
		while ((temp = System.in.read()) != '\n')
		{
			if (temp != ' ')
			{
				a.charAt(k)[m] = temp;
				m++;
			}
			else
			{
				k++;
				m = 0;
			}
		}

		max = 0;
		min = 100;
		for (i = 0;i <= k;i++)
		{
			temp0 = String.valueOf(a.charAt(i)).length();
			if (temp0 > max)
			{
				maxnum = i;
				max = temp0;
			}
			if (temp0 < min)
			{
				minnum = i;
				min = temp0;
			}
		}

		System.out.printf("%s\n",a.charAt(maxnum));
		System.out.printf("%s\n",a.charAt(minnum));
	}
}
