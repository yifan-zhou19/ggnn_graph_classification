package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		int i;
		int[] a = new int[300];
		int l;
		int t;
		int k;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
			{
				t = s.charAt(i) - 'A';
				a[t]++;
			}
		}
		k = 0;
		for (i = 0;i <= 75;i++)
		{
			if (a[i] != 0)
			{
				k++;
				t = i + 'A';
				System.out.printf("%c=%d\n",t,a[i]);
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
	}
}
