package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	String str = new String(new char[300]);
	String ps;
	char i;
	int count = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	for (i = 0;str.charAt(i) != '\0';i++)
	{
	if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
	{
	count++;
	}
	}
	if (count == 0)
	{
	System.out.print("No");
	}
	else
	{
	for (i = 97;i <= 122;i++)
	{
	count = 0;
	for (ps = str; ps != '\0';ps++)
	{
	if (ps == i)
	{
	count++;
	}
	}
	if (count != 0)
	{
	System.out.printf("%c=%d\n",i,count);
	}
	}
	}
	}

}

