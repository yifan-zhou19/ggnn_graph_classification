package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String p1;
		String p2;
		int m;
		int n;
		int c;
		int i;
		int j;
		int flag;
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
		p1 = a;
		p2 = b;
		m = a.length();
		n = b.length();
		for (i = 0;i < n;i++)
		{
		if (*(p2.Substring(i)) == p1)
		{
			c = i;
			flag = 1;
			for (j = c;j < c + m;j++)
			{
			if (*(p2.Substring(j)) != *(p1.Substring(j) - c))
			{
				flag = 0;
				break;
			}
			}
			if (flag == 1)
			{
				System.out.printf("%d",c);
				break;
			}
		}
		}
		return (0);
	}
}

