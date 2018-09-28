package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int len;
	String a = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n;i++)
	{
		a = new Scanner(System.in).nextLine();
	len = a.length();
	if (a.charAt(len - 1) == 'r' || a.charAt(len - 1) == 'y')
	{
		for (j = 0;j <= len - 3;j++)
		{
			System.out.printf("%c",a.charAt(j));
		}
	}
	else if (a.charAt(len - 1) == 'g')
	{
		for (j = 0;j <= len - 4;j++)
		{
			System.out.printf("%c",a.charAt(j));
		}
	}
	else
	{
		for (j = 0;j <= len - 1;j++)
		{
	System.out.printf("%c",a.charAt(j));
		}
	}
	 System.out.print("\n");
	}
	}

}

