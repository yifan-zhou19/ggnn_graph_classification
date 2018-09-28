package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j = 0;
		int l;
		int t = 0;
		String line = new String(new char[1200]);
		line = new Scanner(System.in).nextLine();
		l = line.length();
		for (i = 0;i < l;i++)
		{
			if (line.charAt(i) != ' ')
			{
			   j++;
			}
			if ((line.charAt(i) == ' ') && (line.charAt(i + 1) != ' '))
			{
			t++;
			a[t] = j;
			j = 0;
			}
		}
	for (i = 1;i <= t;i++)
	{
		System.out.printf("%d,",a[i]);
	}
	System.out.printf("%d",j);
	}

}
