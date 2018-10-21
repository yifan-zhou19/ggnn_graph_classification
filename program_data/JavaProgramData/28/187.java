package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char s;

		int i = 0;
		int m;
		while ((s = System.in.read()) != '\n')
		{
			if (s != ' ')
			{
			i++;
			}
			else if (i > 0)
			{
			System.out.printf("%d,",i);
			i = 0;
			}
		}
		System.out.printf("%d",i);

	}
}
