package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[300][41];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		p = a[0];
		int sum = 0;
		for (int i = 0;i < n;i++)
		{
			p = a[i];
			if (sum + String.valueOf(a[i]).length() > 79)
			{
				i = i - 1;
				sum = 0;
				System.out.print("\n");
			}
			else if (sum + String.valueOf(a[i]).length() == 79)
			{
				if (sum != 0)
				{
					System.out.print(" ");
				}
				do
				{
					System.out.print(p);
					p = p + 1;
				}while (*p != '\0');
				System.out.print("\n");
				sum = 0;
			}
			else
			{
				if (sum != 0)
				{
					System.out.print(" ");
					sum = sum + 1;
				}
				do
				{
					System.out.print(p);
					p = p + 1;
				}while (*p != '\0');
				sum = sum + String.valueOf(a[i]).length();
			}
		}
		System.out.print("\n");
		return 0;
	}

}

