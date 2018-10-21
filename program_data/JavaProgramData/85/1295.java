package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[256]);
	int l;
	int j = 0;
	int n;
	int k;
	int s = 0;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n + 1;i++)
	{
	a = new Scanner(System.in).nextLine();
	if (i == 1)
	{
		continue;
	}

	l = a.length();
	if ((a.charAt(0) < 97 || a.charAt(0)>122) && (a.charAt(0) < 65 || a.charAt(0)>90) && a.charAt(0) != 95)
	{
	System.out.print("no\n");
	continue;
	}
	for (j = 1;j < l;j++)
	{
	if ((a.charAt(j) < 97 || a.charAt(j)>122) && (a.charAt(j) < 65 || a.charAt(j)>90) && (a.charAt(j) < 48 || a.charAt(j)>57) && a.charAt(j) != 95)
	{
		System.out.print("no\n");
	s = 1;
	break;
	}
	}
	if (s == 0)
	{
		System.out.print("yes\n");
	}
	s = 0;
	}
	return 0;
	}
}

