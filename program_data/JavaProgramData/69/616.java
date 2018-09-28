package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int[] b = new int[300];
	public static int la;
	public static int lb;
	public static void putin()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(b,0,(Integer.SIZE / Byte.SIZE));
	String k = new String(new char[300]);
	k = ConsoleInput.readToWhiteSpace(true).charAt(0);
	la = k.length();
	for (int i = 0;i < la;i++)
	{
		a[la - i - 1] = k.charAt(i) - '0';
	}
	while (a[la] == 0 && la != 0)
	{
		la--;
	}
	la++;
	k = ConsoleInput.readToWhiteSpace(true).charAt(0);
	lb = k.length();
	for (int i = 0;i < lb;i++)
	{
		b[lb - i - 1] = k.charAt(i) - '0';
	}
	while (b[lb] == 0 && lb != 0)
	{
		lb--;
	}
	lb++;
	}
	public static void add()
	{
	if (lb > la)
	{
		la = lb;
	}
	for (int i = 0;i < la;i++)
	{
		a[i] += b[i];
	}
	for (int i = 0;(i < la) || (a[la]>0);i++)
	{
		a[i + 1] += a[i] / 10;
		a[i] %= 10;
		if (i > la)
		{
			la = i;
		}
	}
	while (a[la] == 0 && la != 0)
	{
		la--;
	}
	la++;
	}
	public static void pr()
	{
	for (int i = la - 1;i >= 0;i--)
	{
		System.out.print(a[i]);
	}
	System.out.print("\n");
	}
	public static int Main()
	{
	putin();
	add();
	pr();

	return 0;
	}

}

