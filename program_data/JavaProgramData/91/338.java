package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t = 0;
	String a = new String(new char[111]);
	String b = new String(new char[110]);
	for (int i = 0;i < 111;i++)
	{
		*(a.Substring(i)) = '\n';
	}
	for (int i = 0;i < 110;i++)
	{
		*(a.Substring(i)) = System.in.read();
	if (*(a.Substring(i)) == '\n')
	{
		*(a.Substring(i)) = *a;
		break;
	}
	else
	{
		t++;
	}
	}
	for (int i = 0;i < t;i++)
	{
		*(b.Substring(i)) = (char)((int) * (a.Substring(i)) + (int) * (a.Substring(i) + 1));
	}
	for (int i = 0;i < t;i++)
	{
		System.out.print((b.Substring(i)));
	}
		return 0;
	}

}
