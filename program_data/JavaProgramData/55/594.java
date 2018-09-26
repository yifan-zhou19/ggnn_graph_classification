package <missing>;

public class GlobalMembers
{
	public static int qr(int x,int y)
	{
	if (y <= 0)
	{
	return (1);
	}
	else
	{
		return x * qr(x, (y - 1));
	}
	}
	public static int Main()
	{
	int a;
	int b;
	int n;
	int i;
	int j;
	int[] d = new int[100];
	int k = 0;
	String p = new String(new char[100]);
	String q = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		p = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	n = p.length();
	for (i = 0;i < n;i++)
	{
		if (p.charAt(i) <= 'z' && p.charAt(i) >= 'a')
		{
			p.charAt(i) -= 32;
		}
	}
	for (i = 0;i < n;i++)
	{
		if (p.charAt(i) >= 'A' && p.charAt(i) <= 'Z')
		{
		k += (qr(a, (n - 1 - i)) * (p.charAt(i) - 'A' + 10));
		}
		else
		{
		k += (qr(a, (n - 1 - i)) * (p.charAt(i) - '0'));
		}
	}
	for (i = 0;;i++)
	{
		if (k >= b)
		{
			d[i] = (k - (k / b) * b);
			k = k / b;
		}
		else
		{
			d[i] = k;
			break;
		}
	}
	for (j = 0;j <= i;j++)
	{
		if (d[j] <= 9)
		{
		q = tangible.StringFunctions.changeCharacter(q, j, d[j] + '0');
		}
		else
		{
		q = tangible.StringFunctions.changeCharacter(q, j, d[j] - 10 + 'A');
		}
	}
	for (j = i;j >= 0;j--)
	{
	System.out.printf("%c",q.charAt(j));
	}
	return (0);
	}

}

