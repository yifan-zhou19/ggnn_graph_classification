package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_c = new int[1002];
	public static void Main()
	{
	int i;
	int j;
	int k;
	int m = 0;
	int n;
	int m1 = 0;
	int m2 = 0;
	int i1;
	int i2;
	int t;
	int[] a = new int[1000];
	int[] b = new int[1000];
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static int c[1002];
	String s = new String(new char[10000]);

	s = new Scanner(System.in).nextLine();
	m = 0;
	j = 0;

	for (i = 0;s.charAt(i) != '\0';i++)
	{
	if (s.charAt(i) == ',')
	{
		a[j] = m;
		j++;
		m = 0;
	}
	else
	{
		m = m * 10 + s.charAt(i) - '0';
	}
	}
	a[j] = m;
	j++;

	s = new Scanner(System.in).nextLine();
	m = 0;
	j = 0;

	for (i = 0;s.charAt(i) != '\0';i++)
	{
	if (s.charAt(i) == ',')
	{
		b[j] = m;
		j++;
		m = 0;
	}
	else
	{
		m = m * 10 + s.charAt(i) - '0';
	}
	}
	b[j] = m;
	j++;
	m = 0;

	n = j;

	m1 = 0;
	for (i = 0;i < n;i++)
	{
	for (j = a[i];j < b[i];j++)
	{
		Main_c[j]++;
	}
	}

	for (i = 0;i < 1001;i++)
	{
	if (Main_c[i] > m1)
	{
		m1 = Main_c[i];
	}
	}

	System.out.printf("%d %d\n",n,m1);


	}


}
