package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
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
		int i;
		int j;
		int count1 = 0; //count1 count2?????????????????
		int count2 = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			count1++;
		}
		for (j = 0;b.charAt(j) != '\0';j++)
		{
			count2++;
		}
		int k;
		int l;
		int m;
		int n;
		int judge = 0;
		int o;
		int p;
		int judge1 = 0;
		for (k = 0;k <= count1 - count2;k++)
		{
			n = 0;
			if (a.charAt(k) == b.charAt(0))
			{
				o = m = k; //??????k?�??�??
				for (n = 0;n <= count2 - 1;n++)
				{
					if (a.charAt(m) != b.charAt(n))
					{
						break;
					}
					else if (n == count2 - 1 && a.charAt(m) == b.charAt(n))
					{
						judge = 1;
					}
					else if (a.charAt(m) == b.charAt(n) && n != count2 - 1)
					{
						m++;
					}
				}
				if (judge == 1)
				{
					for (o = k;o <= k + count2 - 1;o++)
					{
						a = tangible.StringFunctions.changeCharacter(a, o, c.charAt(o - k));
					}
					for (p = 0;p <= count1 - 1;p++)
					{
						 System.out.printf("%c",a.charAt(p));
					}
					judge1 = 1;
					break;
				} //?????????????????????????
				else if (judge == 0)
				{
					continue;
				}
			}
		}
		if (judge1 == 0)
		{
					 for (int z = 0;z <= count1 - 1;z++)
					 {
					 System.out.printf("%c",a.charAt(z));
					 }

		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		//????????�??�?????

	}

}

