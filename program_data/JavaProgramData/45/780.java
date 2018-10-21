package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	String a = new String(new char[50]);
	String b = new String(new char[50]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	for (j = 0;b.charAt(j) != '\0';j++)
	{
		i = 0;
	if (b.charAt(j) == a.charAt(i))
	{
			if (b.charAt(j + 1) != a.charAt(1))
			{
	continue;
			}
			if (b.charAt(j++) == a.charAt(i++))
			{
	System.out.printf("%d",j - 1);
	return 0;
			}
	}
	}
	return 0;
	}


}

