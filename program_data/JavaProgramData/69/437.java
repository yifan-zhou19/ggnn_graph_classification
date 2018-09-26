package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s1 = new String(new char[250]);
	String s2 = new String(new char[250]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s1 = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s2 = tempVar2.charAt(0);
	}
	int l1;
	int l2;
	l1 = s1.length();
	l2 = s2.length();

	int t;
	int i;
	int[] p = new int[251];
	for (i = 0;i < 250;i++)
	{
	if (i < l1 && i < l2)
	{
	t = s1.charAt(l1 - i - 1) + s2.charAt(l2 - i - 1) - '0'-'0';
	}
	else if (i >= l1 != 0 && i < l2)
	{
	t = s2.charAt(l2 - i - 1) - '0';
	}
	else if (i >= l2 != 0 && i < l1)
	{
	t = s1.charAt(l1 - i - 1) - '0';
	}
	else if (i >= l1 != 0 && i >= l2)
	{
	 break;
	}
	p[i] = p[i] + t;
	if (p[i] > 9)
	{
	p[i] = p[i] - 10;
	p[i + 1]++;
	}
	}
	while (p[i] == 0 && i > 0)
	{
	i--;
	}
	for (;i >= 0;i--)
	{
	System.out.printf("%d",p[i]);



	}


	}



}

