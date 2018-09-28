package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
	String a = new String(new char[81]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		a = new Scanner(System.in).nextLine();
	 if ((a.charAt(0) == '_') || ((a.charAt(0) <= 'z') && (a.charAt(0) >= 'a')) || ((a.charAt(0) <= 'Z') && (a.charAt(0) >= 'A')))
	 {
	 b = 1;
	 }
	else
	{
		b = 0;
	}
	j = 1;
	while ((b != 0) && (a.charAt(j) != '\0'))
	{
		if ((a.charAt(j) == '_') || (a.charAt(j) <= 'z' && a.charAt(j) >= 'a') || (a.charAt(j) <= 'Z' && a.charAt(j) >= 'A') || (a.charAt(j) <= 57 && a.charAt(j) >= 48))
		{
			b = 1;
		}
	else
	{
		b = 0;
	}
	j++;
	}
	System.out.printf("%d\n",b);
	}
	return 0;
	}

}

