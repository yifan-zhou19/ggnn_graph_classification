package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l1;
		int l2;
		int l3;
		int sum;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		sum = 0;
		l1 = b.length();
		l2 = c.length();
		l3 = a.length();
		for (i = 0;i < l3;i++)
		{
			for (j = i,k = 0;k < l1;k++)
			{
				if (a.charAt(j) != b.charAt(k))
				{
				break;
				}
				j++;
			}
			if (k == l1 && sum == 0)
			{
			for (j = 0;c.charAt(j) != '\0';j++)
			{
			System.out.printf("%c",c.charAt(j));
			}
			i = i + l1 - 1;
			sum = sum + 1;
			}
			else
			{
			System.out.printf("%c",a.charAt(i));
			}
		}
	}
}

