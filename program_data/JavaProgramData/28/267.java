package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[20]);
	int i = 1;
	int n;
	char c;
	do
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	n = a.length();
	if (i == 1)
	{
	System.out.printf("%d",n);
	}
	else
	{
	System.out.printf(",%d",n);
	}
	i++;
	} while ((c = System.in.read()) != '\n');
	}


}

