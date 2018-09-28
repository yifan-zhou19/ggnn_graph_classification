package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l11;
		int l21;
		int l;
		int s;
		int l1;
		int l2;
		String a = new String(new char[253]);
		String b = new String(new char[253]);
		String d = new String(new char[253]);
		int[] a1 = new int[253];
		int[] b1 = new int[253];
		int[] c = new int[253];
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a = tempVar.charAt(0);
			 }
			 String tempVar2 = ConsoleInput.scanfRead("\n");
			 if (tempVar2 != null)
			 {
				 b = tempVar2.charAt(0);
			 }
		l11 = a.length();
		l21 = b.length();
		if (l11 < l21)
		{
			d = a;
		   a = b;
		   b = d;
		}
		l1 = a.length();
		l2 = b.length();
		l = l2 - 1;
		a1[0] = 0;
		b1[0] = 0;
		for (i = l1 - 1;i >= 0;i--)
		{
			a1[i + 1] = a.charAt(i) - '0';
			if (l >= 0)
			{
				b1[i + 1] = b.charAt(l) - '0';
				l--;
			}
			else
			{
				b1[i + 1] = 0;
			}
		}
		for (i = l1; i >= 0;i--)
		{
			c[i] = a1[i] + b1[i];
			if (c[i] >= 10)
			{
				c[i] = c[i] - 10;
				a1[i - 1] = a1[i - 1] + 1;
			}
		}
			 s = 0;
		while (c[s] == 0)
		{
				s++;
		}
	//	for (i=1;i<=l1;i++)
	//		printf("%d",a1[i]);printf("\n");
	//	for (i=1;i<=l2;i++)
	//		printf("%d",b1[i]);printf("\n");
		for (i = s;i <= l1;i++)
		{
			System.out.printf("%d",c[i]);
		}
		if (s > l1)
		{
			System.out.print("0");
		}
		return 0;
	}


}

