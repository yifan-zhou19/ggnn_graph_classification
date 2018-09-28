package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int[] c = new int[100];
	int t;
	int n;
	int i = 0;
	int j = 0;
	int q;
	int r;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	n = a.length();
	if (n == 2)
	{

	r = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
	System.out.printf("%d\n%d",r / 13,r % 13);
	}
	else if (n == 1)
	{
	r = a.charAt(0) - '0';
	System.out.printf("%d\n%d",0,r);
	}





	else
	{


	t = a.charAt(0) - '0';
	for (i = 0;i < n - 1;i++)
	{
	t = (a.charAt(i + 1) - '0') + t * 10;
	if (t >= 13)
	{
		b = tangible.StringFunctions.changeCharacter(b, i, t / 13 + '0');
		c[i] = t % 13;
		t = t % 13;
	}
	else
	{
	b = tangible.StringFunctions.changeCharacter(b, i, '0');
	c[i] = t;

	}
	}
	int m;
	m = b.length();
	if (b.charAt(0) > '0')
	{
	System.out.printf("%c",b.charAt(0));
	}
	for (i = 1;i<m,b.charAt(i) >= '0';i++)
	{
	System.out.printf("%c",b.charAt(i));
	q = i;
	}
	System.out.printf("\n%d",c[q]);
	}
	}
}

