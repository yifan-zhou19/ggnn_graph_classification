package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0'};
		int i = 0;
		while ((a[i] = System.in.read()) != '\n')
		{
			i++;
		}
			for (; i >= 0; i--)
			{
				System.out.print(a[i]);
			}
		return 0;
	}
}
