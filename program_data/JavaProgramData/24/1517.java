package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[NUM]);
		final String b = "";
		String max;
		String min;
		int m;
		int n;
		int i;
		int t;
		int j;
		a = new Scanner(System.in).nextLine();
		j = a.length();
		t = 0;
		n = 0;
		for (m = 0;m < j;m++)
		{
			if ((a.charAt(m) != ' ' && a.charAt(m) != '\0') && a.charAt(m) != ',')
			{
				b.charAt(n)[t] = a.charAt(m);
				t++;
			}
			else
			{
				n++;
				t = 0;
			}
		}
		max = b.charAt(0);
		min = b.charAt(0);
		for (i = 1;i < n + 1;i++)
		{
			if (max.length() < String.valueOf(b.charAt(i)).length())
			{
				max = b.charAt(i);
			}
			if (min.length() > String.valueOf(b.charAt(i)).length() && (String.valueOf(b.charAt(i)).length() != 0))
			{
				min = b.charAt(i);
			}
		}
		System.out.println(max);
		System.out.println(min);
		return 0;
	}

}
