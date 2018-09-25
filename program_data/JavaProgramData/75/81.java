package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5000]);
		String b = new String(new char[5000]);
		int[] c = new int[1000];
		int[] d = new int[1000];
		int i;
		int j;
		int t = 0;
		int count;

		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = a.length();
		j = 0;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != ',')
			{
				c[j] = c[j] * 10 + (a.charAt(i) - '0');
			}
			else
			{
				j++;
			}
		}
		int l1 = b.length();
		j = 0;
		for (i = 0;i < l1;i++)
		{
			if (b.charAt(i) != ',')
			{
				d[j] = d[j] * 10 + (b.charAt(i) - '0');
			}
			else
			{
				j++;
				t++;
			}
		}
		int sum = 0;
		for (i = 1;i < 1000;i++)
		{
			count = 0;
			for (j = 0;j < t + 1;j++)
			{
				if (i >= c[j] != 0 && i < d[j])
				{
					count++;
				}
			}
			sum = (sum > count)? sum : count;
		}
		System.out.print(t + 1);
		System.out.print(" ");
		System.out.print(sum);

		return 0;
	}


}

