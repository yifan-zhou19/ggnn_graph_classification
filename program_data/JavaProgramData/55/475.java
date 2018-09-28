package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String k = new String(new char[32]);
	int[] l = new int[32];
	int a;
	int b;
	int d;
	int i;
	int s;
	int n = 0;
	s = 1;
	n = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	d = k.length();
	i = d - 1;
	while (i >= 0)
	{
	if (k.charAt(i) >= 'A' && k.charAt(i) <= 'Z')
	{
	n = n + (k.charAt(i) - 'A' + 10) * s;
	}
	else if (k.charAt(i) >= 'a' && k.charAt(i) <= 'z')
	{
	n = n + (k.charAt(i) - 'a' + 10) * s;
	}
	else
	{
	n = n + (k.charAt(i) - '0') * s;
	}
	i--;
	s *= a;
	}
	if (n == 0)
	{
	 System.out.print("0");
	 return 0;
	}
	for (i = 0;n > 0;i++)
	{
	l[i] = n % b;
	n /= b;
	}
	d = i;
	for (i = d - 1;i >= 0;i--)
	{
	if (l[i] >= 10)
	{
	System.out.printf("%c",l[i] - 10 + 'A');
	}
	else
	{
	System.out.printf("%d",l[i]);
	}
	}
	System.out.print("\n");
	}

}

