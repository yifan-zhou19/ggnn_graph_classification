package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String zfc = new String(new char[300]);
	char i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		zfc = tempVar.charAt(0);
	}
	int k = zfc.length();
	int x = 0;
	// printf("%d",k);
	for (i = 'A';i <= 'Z';i++)
	{
	int m = 0;
	for (int j = 0;j < k;j++)
	{
	if (zfc.charAt(j) == i)
	{
	m++;
	x++;
	}
	}
	if (m > 0)
	{
	System.out.printf("%c=%d\n",i,m);
	}
	}
	for (i = 'a';i <= 'z';i++)
	{
			int q = 0;
	for (int j = 0;j < k;j++)
	{
	if (zfc.charAt(j) == i)
	{
	q++;
	x++;
	}
	}
	if (q > 0)
	{
	System.out.printf("%c=%d\n",i,q);
	}
	}
	if (x == 0)
	{
	System.out.print("No");
	}
	return 0;
	}

}

