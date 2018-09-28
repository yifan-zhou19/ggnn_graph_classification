package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[200];
		int i;
		int j;
		int k;
		int e;
		int t = 0;
		int l = 0;
		int n = 0;
		String a = new String(new char[2000]);
		String p;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 200;i++)
		{
			b[i] = 0;
		}
		i = 0;
		for (p = a; p != '\0';p++)
		{
			if (p != ' ' && p != ',')
			{
				b[i]++;
			}
			else
			{
				i++;
				if (p == ',')
				{
				  p = p.Substring(1);
				}

			}
		}
		if (i == 0)
		{
			System.out.printf("%s\n%s\n",a,a);
		}
		else
		{
		for (k = 1;k <= i + 1;k++)
		{
			for (j = 0;j < i + 1 - k;j++)
			{
				if (b[j] <= b[j + 1])
				{
					e = b[j];
					b[j] = b[j + 1];
					b[j + 1] = e;
				}
			}
		}

		if (b[0] == b[i])
		{
			for (p = a; p != ' ';p++)
			{
			   System.out.printf("%c", p);
			}
			System.out.print("\n");
			for (p = a; p != ' ';p++)
			{
			   System.out.printf("%c", p);
			}

		}
		else
		{
		for (p = a; p != '\0';p++)
		{
			if (p != ' ' && p != ',')
			{
				t++;


			}
			else
			{

				if (t == b[0])
				{
					for (p = p - t; p != ' ';p++)
					{
						System.out.printf("%c", p);
						l = 1;
					}
					break;
				}
				t = 0;

			}
		}
		if (l == 0)
		{
			System.out.printf("%s\n",p - t);
		}
		else
		{
			System.out.print("\n");
		}
		t = 0;

		for (p = a; p != '\0';p++)
		{

			if (p != ' ' && p != ',')
			{
				t++;

			}
			if (p == ' ' || p == ',')
			{
				if (t == b[i])
				{
					for (p = p - t; p != ' ';p++)
					{
						System.out.printf("%c", p);
						n = 1;
					}
					break;
				}
				t = 0;

			}
		}
		if (n == 0)
		{
			System.out.printf("%s\n",p - t);
		}
		}
		}

		return 0;
	}




}
