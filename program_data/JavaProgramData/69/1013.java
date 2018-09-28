package <missing>;

public class GlobalMembers
{
	public static int[] n1 = new int[251];
	public static int[] n2 = new int[251];
	public static String s1 = new String(new char[251]);
	public static String s2 = new String(new char[251]);
	public static void Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s1 = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s2 = tempVar2.charAt(0);
	}
	int i;
	int j;
	int l = s1.length();
	j = 0;
	for (i = l - 1;i >= 0;i--)
	{
	n1[j++] = s1.charAt(i) - '0';
	}
	l = s2.length();
	j = 0;
	for (i = l - 1;i >= 0;i--)
	{
	n2[j++] = s2.charAt(i) - '0';
	}
	for (i = 0;i < 250;i++)
	{
	n1[i] += n2[i];
	if (n1[i] > 9)
	{
		n1[i] -= 10;
		n1[i + 1]++;
	}
	}
	int b = 0;
	for (i = 250;i >= 0;i--)
	{
	if (b != 0)
	{
	System.out.printf("%d",n1[i]);
	}
	else if (n1[i])
	{
		System.out.printf("%d",n1[i]);
		b = 1;
	}
	}
	if (b == 0)
	{
	System.out.print("0");
	}
	}
}

