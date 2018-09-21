package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[500]);
	int i;
	int j;
	int longest = 0;
	int shortest = 20;
	int lenth;
	int k = -1;
	int a;
	int b;
	int c;
	int d;
	str = new Scanner(System.in).nextLine();
	for (i = 0;str.charAt(i) != '\0';i++)
	{
		if (str.charAt(i) == ' ')
		{
		lenth = i - k;
	if (lenth > longest)
	{
		longest = lenth;
	a = i;
	b = k;
	}
	if (lenth < shortest)
	{
		shortest = lenth;
	c = i;
	d = k;
	}
	k = i;
		}
	}
	if (str.charAt(i) == '\0')
	{
		lenth = i - k;
	if (lenth > longest)
	{
		longest = lenth;
	a = i;
	b = k;
	}
	if (lenth < shortest)
	{
		shortest = lenth;
	c = i;
	d = k;
	}
	}
	for (j = b + 1;j < a;j++)
	{
	System.out.printf("%c",str.charAt(j));
	}
	System.out.print("\n");
	for (j = d + 1;j < c;j++)
	{
	System.out.printf("%c",str.charAt(j));
	}
	return 0;
	}

}
