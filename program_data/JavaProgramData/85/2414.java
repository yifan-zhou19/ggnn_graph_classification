package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m;
	String z = new String(new char[21]);
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
		z = tempVar2.charAt(0);
	}
	int k = 0;
	if ((z.charAt(0) >= 'A' && z.charAt(0) <= 'Z') || (z.charAt(0) >= 'a' && z.charAt(0) <= 'z') || (z.charAt(0) == '_'))
	{
	for (j = 1;z.charAt(j) != '\0';j++)
	{
	if (z.charAt(j) >= '0' && z.charAt(j) <= '9')
	{
	k++;
	}
	else if (z.charAt(j) >= 'a' && z.charAt(j) <= 'z')
	{
	k++;
	}
	   else if (z.charAt(j) >= 'A' && z.charAt(j) <= 'Z')
	   {
	k++;
	   }
	   else if (z.charAt(j) == '_')
	   {
	k++;
	   }
	else
	{
		break;
	}
	}
	m = z.length();
	if (k == m - 1)
	{
	System.out.print("yes\n");
	}
	else
	{
	System.out.print("no\n");
	}
	}
	else if (z.charAt(0) <= '9' && z.charAt(0) >= '0')
	{
	System.out.print("no\n");
	}
	else
	{
	System.out.print("no\n");
	}
	}
	return 0;
	}
}

