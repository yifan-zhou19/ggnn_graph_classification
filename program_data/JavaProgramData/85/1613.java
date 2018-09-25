package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	String sb = new String(new char[24]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	m = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sb = tempVar2.charAt(0);
	}
	for (int k = 0;sb.charAt(k) != '\0';k++)
	{
	if (!((sb.charAt(k) == '_') || (sb.charAt(k) >= '0' && sb.charAt(k) <= '9') || (sb.charAt(k) >= 'a' && sb.charAt(k) <= 'z') || (sb.charAt(k) >= 'A' && sb.charAt(k) <= 'Z')))
	{
	m = 1;
	}
	}
	if (!(sb.charAt(0) == '_' || (sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z') || (sb.charAt(0) >= 'A' && sb.charAt(0) <= 'Z')))
	{
	m = 1;
	}
	if (m == 1)
	{
		System.out.print("no\n");
	}
	else
	{
		System.out.print("yes\n");
	}
	}
	return 0;
	}
}

