package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	final int last = 1000;
	String s = new String(new char[1050]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	int[] num = new int[1050];
	int len = s.length();
	int i;
	i = last + 1;
	for (int j = len - 1;j >= 0;j--)
	{
		i--;
	num[i] = (s.charAt(j) - '0');
	}
	int st = i;
	num[last + 1] = 0;
	while (i <= last)
	{
	num[i + 1] += num[i] % 13 * 10;
	num[i] = num[i] / 13;
	i++;
	}
	while (num[st] == 0)
	{
		st++;
	}
	if (st > last)
	{
		System.out.print("0");
	}
	for (i = st;i <= last;i++)
	{
	System.out.printf("%c",num[i] + '0');
	}
	System.out.print("\n");
	System.out.printf("%d",num[last + 1] / 10);
	}

}

