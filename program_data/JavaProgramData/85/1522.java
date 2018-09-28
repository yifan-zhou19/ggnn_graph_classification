package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int[] a = new int[100];
	String s = new String(new char[21]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || (s.charAt(0) == '_'))
	{
	for (j = 1;s.charAt(j) != '\0';j++)
	{
	if ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) == '_') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
	{
		a[i] = 1;
	}
	else
	{
	a[i] = 0;
	break;
	}
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] == 1)
	{
		System.out.print("yes\n");
	}
	else
	{
		System.out.print("no\n");
	}
	}
	return 0;
	}

}

