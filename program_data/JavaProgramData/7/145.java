package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int i;
		int a1;
		int b1;
		int c1;
		int n = 0;
		int m;
		int t;
		int j;
		int p = 0;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		a1 = a.length();
		b1 = b.length();
		c1 = c.length();
		for (i = 0;i < a1;i++)
		{
			for (j = 0;j < b1;j++)
			{
				if (a.charAt(i + j) == b.charAt(j))
				{
					p = p + 1;
				}
			}
			if (p == b1)
			{
				for (m = 0;m < i;m++)
				{
					System.out.printf("%c",a.charAt(m));
				}
				System.out.printf("%s",c);
				for (m = b1 + i;m < a1;m++)
				{
					System.out.printf("%c",a.charAt(m));
				}
				n = 9;
				break;
			}
			p = 0;
		}
		if (n == 0)
		{
			System.out.printf("%s",a);
		}
	}










}

