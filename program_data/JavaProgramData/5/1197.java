package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int len1;
	int len2;
	int i;
	int count = 0;
	int error = 0;
	double line;
	String str1 = new String(new char[600]);
	String str2 = new String(new char[600]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		line = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str1 = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		str2 = tempVar3.charAt(0);
	}

	len1 = str1.length();
	len2 = str2.length();

	if (len1 != len2)
	{
	System.out.print("error\n");
	return;
	}

	for (i = 0 ; i < len1 ; i++)
	{
	if (str1.charAt(i) != 'A' && str1.charAt(i) != 'C' && str1.charAt(i) != 'G' && str1.charAt(i) != 'T')
	{
	error++;
	}
	if (str2.charAt(i) != 'A' && str2.charAt(i) != 'C' && str2.charAt(i) != 'G' && str2.charAt(i) != 'T')
	{
	error++;
	}

	if (str1.charAt(i) != str2.charAt(i))
	{
	count++;
	}
	}

	if (error != 0)
	{
	System.out.print("error\n");
	}
	else
	{
	if ((double)(len1 - count) / len1 > line)
	{
	System.out.print("yes\n");
	}
	else
	{
	System.out.print("no\n");
	}
	}

	}
}

