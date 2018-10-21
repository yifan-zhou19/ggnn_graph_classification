package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int j;
		int l;
		int s = 0;
		int p;
		int k;
		String a = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 0;k < t;k++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		p = 0;
		for (i = 0;i < l;i++)
		{
			s = 0;
			for (j = 0;j < l;j++)
			{
				if (a.charAt(i) == a.charAt(j) && i != j)
				{
					s = 1;
					break;
				}
			}
			if (s == 0)
			{
				System.out.printf("%c\n",a.charAt(i));
				p = 1;
				break;
			}
		}

		if (p == 0)
		{
			System.out.print("no\n");
		}
		}
	}



}

