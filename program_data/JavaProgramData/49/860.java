package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		int i;
		int num = 0;
		int j;
		int z;
		int m;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			num++;
		}
		for (i = 2; i <= num; i++)
		{
			for (j = 0; j <= num - i + 1; j++)
			{
				if (i % 2 == 0)
				{
					for (z = j; z <= j + i / 2 - 1; z++)
					{
						m = j + i - 1 - z + j;
						if (a.charAt(z) != a.charAt(m))
						{
							break;
						}
					}
					if (z == j + i / 2)
					{
						for (z = j; z <= j + i - 1; z++)
						{
							System.out.print(a.charAt(z));
						}
						System.out.print("\n");
					}
				}
				if (i % 2 == 1)
				{
					for (z = j; z <= j + (i - 1) / 2 - 1; z++)
					{
						m = j + i - 1 - z + j;
						if (a.charAt(z) != a.charAt(m))
						{
							break;
						}
					}
					if (z == j + (i - 1) / 2)
					{
						for (z = j; z <= j + i - 1; z++)
						{
							System.out.print(a.charAt(z));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}


}

