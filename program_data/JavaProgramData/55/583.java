package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String n = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int c = 0;
		int x;

		int i;
		int j;
		int k;
		int l = n.length();
		for (i = 0;i < l;i++)
		{
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				x = n.charAt(i) - 'A' + 10;
			}
			else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				x = n.charAt(i) - 'a' + 10;
			}
			else
			{
				x = n.charAt(i) - '0';
			}
			for (j = 1;j <= l - i - 1;j++)
			{
				x = a * x;
			}
			c += x;
		}
		int[] m = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (j = 0;;j++)
		{
			m[j] = c % b;
			c = c / b;
			if (c == 0)
			{
				break;
			}
		}
		for (k = j;k >= 0;k--)
		{
			if (m[k] >= 10)
			{
				char y;
				y = 'A' + m[k] - 10;
				System.out.printf("%c",y);
			}
			else
			{
				 System.out.printf("%d",m[k]);
			}
		}



	}
}

