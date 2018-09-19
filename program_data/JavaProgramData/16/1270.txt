package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String a = new String(new char[10]);
		int i = 0;
		int n;
		while ((a[i] = System.in.read()) != '\n')
		{
			i++;
		}
		n = i;
			for (i = n;i >= 0;i--)
			{
		System.out.printf("%c",a.charAt(i));
			}
		return 0;
	}

}
