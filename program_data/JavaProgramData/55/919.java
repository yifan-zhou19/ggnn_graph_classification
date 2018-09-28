package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	long e;
	long d;
	long i;
	long j;
	long k;
	long q;
	long sum = 0;
	int a;
	int b = 0;
	int[] w = new int[1000];

	String c = new String(new char[10000]);
	String t = new String(new char[10000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	d = c.length();
	sum = 0;
	q = 1;
	for (i = 0;i <= (d - 1);i++)
	{
	e = 0;
	if ((c.charAt(i) >= 'A') && (c.charAt(i) <= 'Z'))
	{
	e = c.charAt(i) - 'A' + 10;
	}
	else
	{
	if ((c.charAt(i) >= 'a') && (c.charAt(i) <= 'z'))
	{
	e = c.charAt(i) - 'a' + 10;
	}
	else
	{
	e = c.charAt(i) - '0';
	}
	}
	for (j = 1;j <= d - 1 - i;j++)
	{
	e = e * a;
	}
	sum = sum + e;
	}
	for (k = 1;;k++)
	{
	q = q * b;
	if (q > sum)
	{
	break;
	}
	}
	for (i = k - 1;i >= 0;i--)
	{
	w[i] = sum % b;
	sum = sum - w[i];
	sum = sum / b;
	}

	for (j = 0;j < k;j++)
	{

	if (w[j] >= 10)
	{
	t = tangible.StringFunctions.changeCharacter(t, j, w[j] + 'A' - 10);
	}
	else
	{
	t = tangible.StringFunctions.changeCharacter(t, j, w[j] + '0');
	}
	}

	System.out.printf("%s",t);
	System.out.print("\n");
	System.in.read();
	System.in.read();
	System.in.read();
	}






}

