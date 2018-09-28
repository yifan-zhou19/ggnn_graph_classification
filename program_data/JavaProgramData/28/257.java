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
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[t]++;
			}
			else if (a.charAt(i - 1) != ' ')
			{
				t++;
			}
		}
		for (i = 0;i <= t;i++)
		{
			if (i > 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",b[i]);
		}
	}
}
