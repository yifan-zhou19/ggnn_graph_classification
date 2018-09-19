package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		char i = 0;
		char[] num = {0, '\0', '\0', '\0', '\0', '\0', '\0'};
		while ((c = System.in.read()) != '\n')
		{
			num[i++] = c;
		}
		for (i = i - 1;i >= 0; i--)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		return 0;
	}
}
