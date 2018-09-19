package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int count = 0;
		String a = new String(new char[20000]);
		while ((a[count] = System.in.read()) != '\n')
		{
			count++;
		}
		for (i = count - 1; i >= 0; i--)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
	}

}
