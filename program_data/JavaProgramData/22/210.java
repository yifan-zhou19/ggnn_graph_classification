package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1201]);
		int i;
		int l;
		int[] d = new int[301];
		int k;
		int max;
		int les;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		k = 0;
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) != ',')
			{
				 d[k] = d[k] * 10 + s.charAt(i) - '0';
			}
			if (s.charAt(i + 1) == ',')
			{
				k++;
			}
		}
		les = -1;
		max = d[0];
		for (i = 1;i <= k;i++)
		{
			if (d[i] > max)
			{
				les = max;
				max = d[i];
			}
			if (d[i] > les && d[i] < max)
			{
				les = d[i];
			}
		}
		if (les == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",les);
		}
	}


}
