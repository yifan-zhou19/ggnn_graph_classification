package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		int[] c = new int[256];
		int a;
		int b;
		int i;
		int l1;
		int l2;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
	//	printf("%d %d  ",l1,l2);
		while (l1 > 0 || l2 > 0)
		{
			if (l1 > 0)
			{
				a = s1.charAt(l1 - 1) - '0';
				l1--;
			}
			else
			{
				a = 0;
			}
		//	printf("%d  ",a);
			if (l2 > 0)
			{
				b = s2.charAt(l2 - 1) - '0';
				l2--;
			}
			else
			{
				b = 0;
			}
		//	printf("%d  ",b);
			c[l] += a + b; //??!!!
			c[l + 1] = c[l] / 10;
			c[l] = c[l] % 10;
			l++;
		//	printf("%d %d ",c[l-1],c[l]);
		}
		while (c[l] == 0 && l > 0)
		{
			l--;
		}
		for (i = l;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);
		}
		return 0;
	}

}

