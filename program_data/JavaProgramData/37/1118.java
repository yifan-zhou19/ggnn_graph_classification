package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int t;
	int[] sum = new int[26];
	int i;
	int min;
	int j;
	int b;
	int c;
	String a = new String(new char[100001]);

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	while (t > 0)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}

	for (j = 0;j < 26;j++)
	{
	sum[j] = 0;
	}
	for (j = 0;j < a.length();j++)
	{
	sum[a.charAt(j) - 'a']++;
	}
	min = 0;
	for (j = 0;j < a.length() + 1;j++)
	{
		if (sum[a.charAt(j) - 'a'] == 1)
		{
		System.out.printf("%c\n",a.charAt(j));
	break;
		}
	if (j == a.length())
	{
		System.out.print("no\n");
	}
	}
	t--;
	}

	}
}

