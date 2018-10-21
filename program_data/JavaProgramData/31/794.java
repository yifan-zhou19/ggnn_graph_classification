public class link
{
	public char[][] a = new char[10][100];
	public link next;
}

package <missing>;

public class GlobalMembers
{
	public static link now;
	public static link past;
	public static int i;
	public static int n = 1;
	public static void build()
	{
		while (true)
		{
		now = new link();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			now.a[0] = tempVar.charAt(0);
		}
		if (strcmp(now.a[0],"end") == 0)
		{
			return;
		}
		for (i = 1;i < 6;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				now.a[i] = tempVar2.charAt(0);
			}
		}
		if (n == 1)
		{
			now.next = null;
		}
		else
		{
			now.next = past;
		}
		past = now;
		n++;
		}
	}
	public static void Main()
	{
		build();
		now = past;
		while (now != null)
		{
			System.out.printf("%s",now.a[0]);
			for (i = 1;i < 6;i++)
			{
				System.out.printf(" %s",now.a[i]);
			}
			System.out.print("\n");
			now = now.next;
		}
	}
}

