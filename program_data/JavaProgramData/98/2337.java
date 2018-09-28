package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[9999][41];
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		s = 0;
		System.out.print(a[0]);
		for (int i = 0;a[0][i] != '\0';i++)
		{
			s++;
		}
		for (int i = 1;i < n;i++)
		{
			for (int j = 0;a[i][j] != '\0';j++)
			{
				s++;
			}
			s++;
			if (s <= 80)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
			else
			{
				System.out.print("\n");
				s = 0;
				System.out.print(a[i]);
				for (int j = 0;a[i][j] != '\0';j++)
				{
					s++;
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

