package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l = 0;
		int max = 0;
		int min = 100;
		int i = 0;
		int k;
		String m = new String(new char[1000]);
		int max1;
		int min1;

		max1 = 0;
		min1 = 0;
		m = new Scanner(System.in).nextLine();
		k = m.length();

		for (i = 0;i < k;i++)
		{
				l++;
				if ((m.charAt(i + 1) == ' ') || (i == k - 1))
				{
					if (l > max)
					{
						max = l;
						max1 = i - l + 1;
					}
					if (l < min)
					{
						min = l;
						min1 = i - l + 1;
					}
					l = 0;
					i++;
				}
		}
		for (i = max1;i < max1 + max;i++)
		{
		   System.out.printf("%c",m.charAt(i));
		}
	   System.out.print("\n");
	   for (i = min1;i < min1 + min;i++)
	   {
		   System.out.printf("%c",m.charAt(i));
	   }
	}

}
