package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int k;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j <= n;j++)
	{
	String x = new String(new char[50]);
	x = new Scanner(System.in).nextLine();
	k = x.length();
	if (x.charAt(k - 3) == 'i' && x.charAt(k - 2) == 'n' && x.charAt(k - 1) == 'g')
	{
		for (i = 0;i < k - 3;i++)
		{
			System.out.printf("%c",x.charAt(i));
		}
	}
	else if (x.charAt(k - 2) == 'e' && x.charAt(k - 1) == 'r')
	{
		for (i = 0;i < k - 2;i++)
		{
			System.out.printf("%c",x.charAt(i));
		}
	}
	else
	{
		for (i = 0;i < k - 2;i++)
		{
			System.out.printf("%c",x.charAt(i));
		}
	}
	System.out.print("\n");
	}
	}

}

