package <missing>;

public class GlobalMembers
{
	public static void f(int x, String a)
	{
		int s = -1;
		int i = 100;
		if (!a[x].equals(a[0]))
		{
			for (i = x - 1;i >= 0;i--)
			{
				if (!a[i].equals(a[x]))
				{
					s++;
				}
				else
				{
					s--;
				}
				if (s == 0)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(x);
					System.out.print("\n");
					break;
				}
			}
		}
		if (i != 0)
		{
			f(x + 1, a);
		}
	}
	public static int Main()
	{
		int x = 1;
		String a = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		f(x, a);
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

