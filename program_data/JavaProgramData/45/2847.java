package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str1 = new String(new char[60]);
	 String str2 = new String(new char[60]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 str1 = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 str2 = tempVar2.charAt(0);
	 }
	int n;
	int m;
	n = str1.length();
	m = str2.length();
	int i;
	int j = 0;

	int k = 0;
	for (i = 0;i < m;i++)
	{
		if (str2.charAt(i) == str1.charAt(j))
		{
				k += 1;
				j += 1;
		}
		else
		{
			k = 0;
			j = 0;
		}
		if (k == n)
		{
			break;
		}
	}
	i = i - n + 1;
	System.out.printf("%d",i);
	return 0;
	}
}

