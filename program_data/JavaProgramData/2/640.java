public class book
{
	public int id;
	public String writer = new String(new char[30]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1200);
	public static int Main()
	{
		int n;
		int l;
		int t;
		int[] a = new int[30];
		char m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 30;i++)
		{
			a[i] = 0;
		}
		for (int i = 0;i < n;i++)
		{
			book[i].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			book[i].writer = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = String.valueOf(book[i].writer).length();
			for (int j = 0;j < l;j++)
			{
				t = book[i].writer.charAt(j) - 65;
				a[t]++;
			}
		}
		t = a[0];
		l = 0;
		for (int i = 0;i < 26;i++)
		{
			if (a[i] > t)
			{
				l = i;
				t = a[i];
			}
		}
		m = l + 65;
		System.out.print(m);
		System.out.print("\n");
		System.out.print(t);
		System.out.print("\n");
		for (int i = 0;i < 30;i++)
		{
			a[i] = 0;
		}
		for (int i = 0;i < n;i++)
		{
			l = String.valueOf(book[i].writer).length();
			for (int j = 0;j < l;j++)
			{
				if (book[i].writer.charAt(j) == m)
				{
					System.out.print(book[i].id);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

