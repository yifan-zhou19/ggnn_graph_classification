package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		int k = 1;
		int p;
		int q;
		int i;
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (k <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			p = a.length(); //??????
			q = b.length(); //??????
			i = p;
			for (;p >= 0;p--,q--)
			{
				if (q >= 0)
				{
					c[p] = a.charAt(p) - b.charAt(q);
					if (c[p] < 0)
					{
						c[p] = 10 + c[p];
						a = tangible.StringFunctions.changeCharacter(a, p - 1, a.charAt(p - 1) - 1);
					}
				}
				else if (q < 0)
				{
					c[p] = a.charAt(p) - 48;
				}
			}
			for (p = 0;p < i;p++)
			{
				System.out.printf("%d",c[p]);
			}
			k++;
			System.out.print("\n");
		}
	}


}

