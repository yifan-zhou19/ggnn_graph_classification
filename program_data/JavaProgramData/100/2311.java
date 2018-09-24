package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int h = 1;
		int[] b = new int[300];
		int k;
		char c;
		String a = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;(c = a.charAt(i)) != '\0';i++)


		{

			for (k = 0;k < 254;k++)
			{
			if (a.charAt(i) == k)
			{

			b[k] = b[k] + 1;
			}
			}
		}
		for (k = 65;k < 91;k++)
		{
			if (b[k] != 0)

			{
			c = k;
	System.out.printf("%c=%d\n",c,b[k]);
	h = 2;
			}
		}
		for (k = 97;k < 123;k++)
		{
			if (b[k] != 0)

			{
			c = k;
	System.out.printf("%c=%d\n",c,b[k]);
	h = 2;
			}

		}
		if (h == 1)
		{
			System.out.print("No");
		}

	return (0);
	}
}
