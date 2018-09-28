package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[6600]);
	char c;
	char[][] a1 = new char[300][210];
	String d = new String(new char[401]);
	int i = 0;
	int j;
	int n;
	int k = 0;
	int x;
	int y;
	int z;
	int[] b = new int[300];
	c = System.in.read();
	while (c != '\n')
	{

		if (c == ' ' || c == ',')
		{
			a1[i][k] = '\0';
			k = 0;
			i++;
		}
		else
		{
			b[i]++;
			a1[i][k] = c;
			k++;
		}
		c = System.in.read();




	}
	a1[i][k] = '\0';

	n = i;
	k = 0;

	if (b[0] == b[1] && b[1] == b[2] && b[2] == b[3])
	{
		System.out.printf("%s\n%s\n",a1,a1);
	}
	else
	{
	for (j = 0;j < n;j++)
	{
	if (b[j] >= b[j + 1])
	{
		z = b[j];
		b[j] = b[j + 1];
		b[j + 1] = z;
		d = a1[j];
		a1[j] = a1[j + 1];
		a1[j + 1] = d;
	}
	}
	System.out.printf("%s\n",a1[n]);
	for (j = 0;j < n;j++)
	{
	if (b[j] <= b[j + 1] != 0 && b[j]>0 || b[j + 1] == 0)
	{
		z = b[j];
		b[j] = b[j + 1];
		b[j + 1] = z;
		d = a1[j];
		a1[j] = a1[j + 1];
		a1[j + 1] = d;
	}
	}
	System.out.printf("%s\n",a1[n]);
	}

	}
}
