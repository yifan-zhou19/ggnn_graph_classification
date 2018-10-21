package <missing>;

public class GlobalMembers
{
	public static void pipei(String a)
	{
		int i;
		int j;
		int p = 0;
		char q = a[0];
		int len = a.length();
		for (i = p;i < len;i++)
		{
			if (!a[i].equals(q) && !a[i].equals('+'))
			{
				p = i;
				break;
			}
		}
		if (i == len)
		{
			return;
		}
		for (j = i - 1;j >= 0;j--)
		{
			if (a[j].equals(q))
			{
				break;
			}
		}
		System.out.print(j);
		System.out.print(' ');
		System.out.print(i);
		System.out.print("\n");
		a[j] = a[i] = '+';
		pipei(a);
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		pipei(a);
	}

}

