package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char a;
		int i = 0;
		for (;a != '\n';)
		{
		a = System.in.read();
		if (a != ' ')
		{
			System.out.printf("%c",a);
			i = 0;
		}
		else if ((a == ' ') && (i == 0))
		{
			i++;
			System.out.printf("%c",a);
			continue;
		}
		else
		{
			continue;
		}
		}
	}
}
