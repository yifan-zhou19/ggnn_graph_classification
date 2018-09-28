package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	String a = new String(new char[30]);
	String max = new String(new char[30]);
	String min = new String(new char[30]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	max = a;
	min = a;
	for (i = 2;i <= n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = tempVar3.charAt(0);
		}
	if (a.length() < min.length())
	{
		min = a;
	}
	if (a.length() > max.length())
	{
		max = a;
	}
	}
	System.out.println(max);
	System.out.println(min);
	return 0;
	}
}

