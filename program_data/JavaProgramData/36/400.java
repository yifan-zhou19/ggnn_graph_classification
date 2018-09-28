package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int cmp = new int(char a[],char b[],int);
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("NO\n");
		}
		else
		{
		if (cmp(a, b, 0) == 1)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		}
	}

	public static int cmp(String a, String b, int n)
	{
		if (n == a.length())
		{
			return 1;
		}
		else
		{
			int j;
				for (j = 0;j < a.length();j++)
				{
					if (a[n].equals(b[j]))
					{
						break;
					}
				}
				if (j == a.length())
				{
					return 0;
				}
				else
				{
					b[j] = null;
					return cmp(a, b, n + 1);
				}
		}
	}
}

