package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

	int n;
	int m;
	int o;
	int i;
	int j;

	double[] a = new double[81];
	double[] male = new double[50];
	double[] female = new double[50];

	char[][] b = new char[41][7];

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	m = 0;
	o = 0;
	for (i = 1;i <= n;i++)
	{
	b[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	if (b[i][0] == 'm')
	{
		m++;
		male[m] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	}
	 if (b[i][0] == 'f')
	 {
	o++;
	female[o] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	 }
	}

	/*double x;
	for(i=1;i<=m-1;i++) 
	{
	for(j=m;j>i;j--)
	{ 
	if(male[j]<male[j-1])
	{
	x=male[j];
	male[j]=male[j-1];
	male[j-1]=x;
	}
	}
	}
	 
	for(i=1;i<=o-1;i++) 
	{
	for(j=o;j>i;j--)
	{
	if(female[j]>female[j-1])
	{
	x=female[j];
	female[j]=female[j-1];
	female[j-1]=x;
	}
	}
	 
	}
	*/
	sort(male+1,male + m + 1);
	sort(female+1,female + o + 1);
	for (i = 1;i <= m;i++)

	{

	System.out.printf("%.2f", male[i]);
	System.out.printf("%.2f", " ");

	}
	for (i = o;i >= 2;i--)

	{

	System.out.printf("%.2f", female[i]);
	System.out.printf("%.2f", " ");

	}
	if (o > 0)
	{

	System.out.printf("%.2f", female[1]);
	System.out.printf("%.2f", "\n");
	}
	return 0;
	}

}

