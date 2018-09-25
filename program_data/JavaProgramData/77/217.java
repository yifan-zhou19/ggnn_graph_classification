package <missing>;

public class GlobalMembers
{
	public static void line(String a, int b)
	{
		int i;
		int j;
		for (i = 0;i < b;i++)
		{
			if (!a[i].equals(a[0]))
			{
				for (j = i;j >= 0;j--)
				{
					if (!a[j].equals(a[i]) && a[j].equals(a[0]))
					{
						System.out.print(j);
						System.out.print(' ');
						System.out.print(i);
						System.out.print("\n");
						a[j] = a[i] = null;
						break;
					}

				}
			}

		}
	}




	public static int Main()
	{
		String a = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n;
		n = a.length();
		line(a, n);
		return 0;
	}


}

