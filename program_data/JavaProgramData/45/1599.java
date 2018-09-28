package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
	int i;
	int j;
	int k;
	int m;
	int n;
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
	m = a.length();
	n = b.length();
	j = 0;
	i = 0;
	do
	{
		if (a.charAt(i) != b.charAt(j))
		{
		   j++;
		   i = 0;
		}
	if (a.charAt(i) == b.charAt(j))
	{
			j++;
			i++;
	}
	} while (i < m && j < n);

	k = j - m;
	System.out.printf("%d",k);
	}

}

