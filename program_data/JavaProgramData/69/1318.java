package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int[] b = new int[300];
	public static int[] c = new int[300];
	public static int al;
	public static int bl;
	public static String s = new String(new char[300]);

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		al = s.length();
		int i;
		int j = 0;
		for (i = al - 1; i >= 0; i--, j++)
		{
			a[j] = s.charAt(i) - '0';
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		bl = s.length();
		j = 0;
		for (i = bl - 1; i >= 0; i--, j++)
		{
			b[j] = s.charAt(i) - '0';
		}
		if (bl > al)
		{
			al = bl;
		}
		/*
		for (i = al; i >= 0; i--)
			printf("%d", b[i]);
		printf("\n");
		*/
		int carry = 0;
		for (i = 0; i <= al + 1; i++)
		{
			c[i] = a[i] + b[i] + carry;
			if (c[i] >= 10)
			{
				c[i] -= 10;
				carry = 1;
			}
			else
			{
				carry = 0;
			}
		}
		while (c[al] == 0 && al > 0)
		{
			al--;
		}
		for (i = al; i >= 0; i--)
		{
			System.out.printf("%d", c[i]);
		}
		System.out.println("");
		return 0;
	}

}

