package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int i = 0;
		for (;a != '\n';)
		{
		a = System.in.read();
		if (a >= 48 && a <= 57)
		{
			System.out.printf("%c",a);
			i = 0;
		}
		else if ((a < 48 || a>57) && (i == 0))
		{
			i++;
			System.out.print("\n");
			continue;
		}
		else
		{
			continue;
		}
		}
	}

}
