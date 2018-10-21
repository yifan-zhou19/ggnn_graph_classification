package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[80]);
	s = new Scanner(System.in).nextLine();
	String z = new String(new char[100000]);
	int n = Integer.parseInt(s);
	int i;
	int j;
	int a;
	int k;
	int m;
	int b;
	for (i = 0;i < n;i++)
	{
		z = new Scanner(System.in).nextLine();
		a = z.length();
		m = 0;
		b = 0;
		for (j = 0;j < a;j++)
		{
			m = 0;
			for (k = 0;k < a;k++)
			{
				if ((z.charAt(j) == z.charAt(k)) && (j != k))
				{
					m = 1;
					break;
				}
			}
			if (m == 0)
			{
				System.out.printf("%c\n",z.charAt(j));
				b = 1;
				break;
			}
		}
		   if (b == 0)
		   {
				System.out.print("no\n");
		   }

	}

	return 0;
	}
}
