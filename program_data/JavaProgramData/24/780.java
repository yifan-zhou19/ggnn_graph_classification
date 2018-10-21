package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		String r;
		int i = 0;
		int j = 0;
		int n;
		int k;
		int min = 50;
		int max = 0;
		int word = 1;
		int x = 0;
		int y = 50;
		a = new Scanner(System.in).nextLine();
	n = a.length();
	p = a;
	do
	{
		if (*p == ' ' || p == a.charAt(n))
		{
			word = 0;
		}
		else
		{
			word = 1;
		}
	if (word == 1)
	{
	i++;
	}
	else
	{
		if (i > max)
		{
			max = i;
			q = p;
		}
		if (i < min)
		{
			min = i;
			r = p;
		}
		i = 0;
	}
	p++;
	}while (p != a.charAt(n + 1));
	for (p = q - max;p < q;p++)
	{
	System.out.printf("%c",*p);
	}
	System.out.print("\n");
	for (p = r - min;p < r;p++)
	{
	System.out.printf("%c",*p);
	}
	System.out.print("\n");
	}


}
