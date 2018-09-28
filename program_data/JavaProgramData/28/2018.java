package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int k;
	 int i;
	 int j = 0;
	 int m = 0;
	 int[] s = new int[300];
	 String sz = new String(new char[3000]);
	  k = sz.length();
		sz = new Scanner(System.in).nextLine();
	for (i = 0;sz.charAt(i) != 0;i++)
	{
	if (sz.charAt(i) != 32)
	{
	m++;
	}
	else
	{
	s[j] = m;
	if (m != 0)
	{
		j++;
	}
	m = 0;
	}
	}
	s[j] = m;
	for (i = 0;i < j;i++)
	{
	System.out.printf("%d,",s[i]);
	}
	System.out.printf("%d",s[j]);
	return 0;
	}

}
