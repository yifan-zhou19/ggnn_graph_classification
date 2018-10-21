package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String c = "";
		int b;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int r = 0;
		int s;
		int t;
		int w;
	a = new Scanner(System.in).nextLine();
	b = a.length();
	w = 0;
	for (i = 0;i < b;i++)
	{
		if (a.charAt(i) == ' ')
		{
			w = 0;
		}
	 else if (w == 0)
	 {
		 w = 1;
		 j = i;
		 for (k = j, s = 0;a.charAt(k) != ' ' && a.charAt(k) != '\0';k++, s++)
		 {
			 c.charAt(r)[s] = a.charAt(k);
		 }
		 r++;
	 }
	}
	t = r;


	m = String.valueOf(c.charAt(0)).length();
	for (r = 0;r < t;r++)
	{
		l = String.valueOf(c.charAt(r)).length();
	 if (l > m)
	 {
		 m = l;
	 }
	}
	for (r = 0;r < t;r++)
	{
		l = String.valueOf(c.charAt(r)).length();
	 if (l == m)
	 {
		 System.out.println(c.charAt(r));
		 break;
	 }
	}

	n = String.valueOf(c.charAt(0)).length();
	for (r = 0;r < t;r++)
	{
		l = String.valueOf(c.charAt(r)).length();
	 if (l < n)
	 {
		 n = l;
	 }
	}
	for (r = 0;r < t;r++)
	{
		l = String.valueOf(c.charAt(r)).length();
	 if (l == n)
	 {
		 System.out.println(c.charAt(r));
		 break;
	 }
	}
	}
}
