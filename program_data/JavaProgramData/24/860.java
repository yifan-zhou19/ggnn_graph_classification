package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[2000]);
	int n;
	int lmax = 0;
	int lmin = 0;
	int smax = 0;
	int smin = 0;
	int e = 0;
	int s = 0;
	int i;
	int emax;
	int emin;
	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (i = 0;i < n;i++)
	{
	if (a.charAt(i) == ' ')
	{
	lmax = i;
	lmin = i;
	emax = i;
	emin = i;
	break;
	}
	}
	for (i = 0;i <= n;i++)
	{
	if (a.charAt(i) == ' ' || (i == n))
	{
	e = i;
	if (e - s > lmax)
	{
	lmax = e - s;
	smax = s;
	emax = e;
	}
	if (e - s < lmin)
	{
	lmin = e - s;
	smin = s;
	emin = e;
	}
	while (a.charAt(i) == ' ')
	{
	i++;
	}
	s = i;
	}
	}
	String max = new String(new char[300]);
	String min = new String(new char[300]);
	int j = 0;
	for (i = smax;i < emax;i++)
	{
	max = tangible.StringFunctions.changeCharacter(max, j, a.charAt(i));
	j++;
	}
	max = tangible.StringFunctions.changeCharacter(max, lmax, '\0');
	j = 0;
	for (i = smin;i < emin;i++)
	{
	min = tangible.StringFunctions.changeCharacter(min, j, a.charAt(i));
	j++;
	}
	min = tangible.StringFunctions.changeCharacter(min, lmin, '\0');
	System.out.println(max);
	System.out.println(min);
	return 0;
	}
}

