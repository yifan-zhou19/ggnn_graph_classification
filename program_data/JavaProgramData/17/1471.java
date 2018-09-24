package <missing>;

public class GlobalMembers
{
	public static void course(String a, int n)
	{
		int i;
		int j;
		int k;
		for (k = 0;k < n;k++)
		{
			if (a[k].equals(')'))
			{
			a[k] = '?';
			}
			else if (a[k].equals('('))
			{
			a[k] = '$';
			}
			else
			{
				a[k] = 32;
			}
		}
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n - 1;i++)
			{
				if (a[i].equals('$'))
				{
					for (j = i + 1;j < n;j++)
					{
						if (a[j].equals('$'))
						{
						break;
						}
						else if (a[j].equals('?'))
						{
							a[i] = 32;
							a[j] = 32;
							break;
						}
						else
						{
							continue;
						}
					}
				}
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[10000]);
		int n;
		while (scanf("%s",a) != EOF)
		{
			System.out.println(a);
			n = a.length();
			course(a, n);
			System.out.println(a);
		}
		return 0;
	}
}
