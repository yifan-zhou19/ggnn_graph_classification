package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int l;
		int i;
		int[] b = new int[1000];
		int t = 0;
		int max = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != ',')
			{
				b[t] = b[t] * 10 + (int)a.charAt(i) - 48;
			}
			else
			{
				t++;
			}
		}
		for (i = 0;i <= t;i++)
		{
			max = MAX(max,b[i]);
		}
		for (i = 0;i <= t;i++)
		{
			if (b[i] == max)
			{
				b[i] = 0;
			}
		}
		max = 0;
		for (i = 0;i <= t;i++)
		{
			max = MAX(max,b[i]);
		}
		if (max != 0)
		{
			System.out.printf("%d",max);
		}
		else
		{
			System.out.print("No");
		}
	}
}
