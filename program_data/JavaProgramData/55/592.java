package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int len;
	int a;
	int b;
	int t = 0;
	int shu1;
	String s = new String(new char[100]);
	int[] c = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	len = s.length();
	if (a <= 10)
	{
	shu1 = s.charAt(0) - '0';
	for (i = 1;i < len;i++)
	{
	shu1 = shu1 * a + s.charAt(i) - '0';
	}
	}
	else
	{
	if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
	{
	shu1 = s.charAt(0) - '0';
	}
	else if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
	{
	shu1 = s.charAt(0) - 'a' + 10;
	}
	else if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
	{
	shu1 = s.charAt(0) - 'A' + 10;
	}
	for (i = 1;i < len;i++)
	{
	if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
	{
	shu1 = shu1 * a + s.charAt(i) - '0';
	}
	else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
	{
	shu1 = shu1 * a + s.charAt(i) - 'a' + 10;
	}
	else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	{
	shu1 = shu1 * a + s.charAt(i) - 'A' + 10;
	}
	}
	}
	if (b <= 10)
	{
	if (shu1 == 0)
	{
	System.out.print("0\n");
	}
	else
	{
	for (i = 0;shu1 != 0;i++)
	{
	c[i] = shu1 % b;
	shu1 = shu1 / b;
	}
	for (j = i - 1;j >= 0;j--)
	{
	System.out.printf("%d",c[j]);
	}
	System.out.print("\n");
	}
	}
	else if (b > 10)
	{
	if (shu1 == 0)
	{
	System.out.print("0\n");
	}
	else
	{
	for (i = 0;shu1 != 0;i++)
	{
	c[i] = shu1 % b;
	shu1 = shu1 / b;
	}
	for (j = i - 1;j >= 0;j--)
	{
	if (c[j] >= 10)
	{
	System.out.printf("%c",'A' + c[j] - 10);
	}
	else
	{
	System.out.printf("%d",c[j]);
	}
	}
	}
	System.out.print("\n");
	}
	return 0;
	}

}

