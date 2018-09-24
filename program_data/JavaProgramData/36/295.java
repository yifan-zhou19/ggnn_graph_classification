package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int k;
		int m;
		int n;
		int sig = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n = a.length();
		if (a.length() == b.length())
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (b.charAt(j) == a.charAt(i))
					{
						b = b.substring(0, j);
						break;
					}

				}
				if (j == n)
				{
						System.out.print("NO");
					break;
				}
			}
			if (i == n)
			{
				System.out.print("YES");
			}

		}
		else
		{
			System.out.print("NO");
		}
	}





}

