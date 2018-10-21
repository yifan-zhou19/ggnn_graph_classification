package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k = 0;
		int p = 0;
		int max = 0;
		int submax = 0;
		int[] a = new int[300];
		String string = new String(new char[1500]);
		String = new Scanner(System.in).nextLine();
		for (i = 0;i < (int)String.length();i++)
		{
			if (String[i] != ',')
			{
				a[k] = a[k] * 10 + string.charAt(i) - '0';
			}
			else
			{
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
			return;
		}
		for (i = 0;i < k;i++)
		{
			if (a[i] != a[i + 1])
			{
				p = 1;
				break;
			}
		}
		if (p == 0)
		{
			System.out.print("No");
			return;
		}
		for (i = 0;i <= k;i++)
		{
			if (a[i] > max)
			{
				submax = max;
				max = a[i];
			}
			else if (a[i] == submax)
			{
				continue;
			}
			else if (a[i] > submax && a[i] < max)
			{
				submax = a[i];
			}
		}
		System.out.printf("%d",submax);
	}

}
