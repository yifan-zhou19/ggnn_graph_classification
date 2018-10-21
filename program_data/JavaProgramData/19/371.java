package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		final String c = "";
		final String d = "";
		int h;
		int i;
		int j;
		int k;
		int m;
		int n;
		int r;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	c = new Scanner(System.in).nextLine();
	m = b.length();
	n = c.length();
	for (h = 0,i = 0; * (a.Substring(i)) != '\0';)
	{
		if ((*(a.Substring(i)) == *b) && ((i >= 1 && *(a.Substring(i) - 1) == ' ' && (*(a.Substring(i) + m) == ' ' || *(a.Substring(i) + m) == '\0')) || (i == 0 && (*(a.Substring(i) + m) == ' ' || *(a.Substring(i) + m) == '\0'))))
		{
		 r = i;
	   for (j = 0;j < m;j++)
	   {
		   if (*(a.Substring(r) + j) != *(b.Substring(j)))
		   {
			   break;
		   }
	   }
		   if (j == m)
		   {
			   for (k = 0;k < n;k++)
			   {
				   *(d.Substring(h)) = *(c.Substring(k));
				   h++;
				   i++;
			   }
			   i = i + m - n;
	 continue;
		   }
		}
	 *(d.Substring(h)) = *(a.Substring(i));
	 h++;
	 i++;
	}
	System.out.println(d);
	}


}
