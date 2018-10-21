package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		String b = new String(new char[1000]);
		int l;
		int i;
		int j;
		int t;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 1;i < l - 1;i++)
		{
			for (j = 0;j < l;j++)
			{
				t = j + i;
				p = j;
				do
				{
						if (a.charAt(p) == a.charAt(t))
						{
							   t = t - 1;
							   p = p + 1;
						}
						 else
						 {
							 break;
						 }
				}while (t > p);
				if (t <= p)
				{
					for (q = j;q < (j + i);q++)
					{
						System.out.printf("%c",a.charAt(q));
					}
					 System.out.printf("%c\n",a.charAt(j + i));
				}
			}
		}
		return 0;
	}

}

