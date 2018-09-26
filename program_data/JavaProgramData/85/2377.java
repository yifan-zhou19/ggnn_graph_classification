package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String dz = new String(new char[N]);
	int n;
	int l;
	int t = 0;
	int i = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		dz = tempVar2.charAt(0);
	}
	t = 0;

	 if ((dz.charAt(0) >= 'a' && dz.charAt(0) <= 'z') || (dz.charAt(0) >= 'A' && dz.charAt(0) <= 'Z') || (dz.charAt(0) == '_'))
	 {

	l = dz.length();

	for (i = 1;i < l;i++)
	{
	if ((dz.charAt(i) >= 'a' && dz.charAt(i) <= 'z') || (dz.charAt(i) >= 'A' && dz.charAt(i) <= 'Z') || (dz.charAt(i) >= '0' && dz.charAt(i) <= '9') || (dz.charAt(i) == '_'))
	{
		continue;
	}
	else
	{
		t = t + 1;
	}
	}
	if (t == 0)
	{
		System.out.print("yes\n");

	}
	else
	{
		System.out.print("no\n");
	}
	 }
	else
	{
		System.out.print("no\n");
	}
	}
	return 0;
	}



}

