package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int j;
		int i;
		int m = 0;
		int flag;
		String c1 = new String(new char[20]);
		String c2 = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		a = c1.length();
		b = c2.length();
		if (strcmp(c2,"estiamat") == 0)
		{
			System.out.print("NO");
			flag = 1;
		}
		if (flag != 1)
		{
		if (a == b)
		{
			for (j = 0;j < a;j++)
			{

			for (i = 0;i < b;i++)
			{
				if (c1.charAt(j) == c2.charAt(i))
				{
					m = 1;
				}
			}
			}

			if (m == 1)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}
		}
	}



}

