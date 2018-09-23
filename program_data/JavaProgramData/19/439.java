package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int na;
		int nb;
		int nc;
		int i;
		int j;
		int k;
		int p;
		int num = 0;

	String a = new String(new char[1000]);
	String b = new String(new char[100]);
	String c = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		na = a.length();
	nb = b.length();
	nc = c.length();

	for (i = 0;i < 1000;i++)
	{
		for (j = 0;j < nb;j++)
		{
	if (*(a.Substring(i) + j) != *(b.Substring(j)))
	{
	 break;
	}
		}
	if ((j == nb && *(a.Substring(i) + nb) == ' ' && *(a.Substring(i) - 1) == ' ') || (j == nb && i == 0 && *(a.Substring(i) + nb) == ' ') || (j == nb && i == na + num * (nc - nb) - nb && *(a.Substring(i) - 1) == ' '))
	{
		num++;
		if (nb >= nc)
		{
			for (k = 0;k < nc;k++)
			{
			*(a.Substring(i) + k) = *(c.Substring(k));
			}
		for (p = 0;p < na + num * (nc - nb);p++)
		{
			*(a.Substring(i) + nc + p) = *(a.Substring(i) + nb + p);
		}
		}
	if (nb < nc)
	{
		for (p = ((nc - nb) * num + na - 1);p > i + nb - 1;p--)
		{
	*(a.Substring(p)) = *(a.Substring(p) - (nc - nb));
		}
	for (k = 0;k < nc;k++)
	{
	*(a.Substring(i) + k) = *(c.Substring(k));
	}
	}
	}
	}
	for (i = 0;i < (na + num * (nc - nb));i++)
	{
	System.out.printf("%c",*(a.Substring(i)));
	}


	}
}
