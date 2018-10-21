package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int[] b = new int[300];
		int i;
		int j;
		int n;
		int max;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0,j = 0;i < n;i++)
		{
			if (a.charAt(i) == ',')
			{
				j++;
			}
			else
			{
				b[j] = b[j] * 10 + (a.charAt(i) - '0');
			}
		}
		max = b[0];
		for (i = 0;i <= j;i++)
		{
			max = b[i] > max != 0?b[i]:max;
		}
		for (i = 0;i <= j;i++)
		{
			if (b[i] == max)
			{
				b[i] = -1;
			}
		}
		max = b[0];
		for (i = 0;i <= j;i++)
		{
			max = b[i] > max != 0?b[i]:max;
		}
		if (max == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",max);
		}
	}

}
