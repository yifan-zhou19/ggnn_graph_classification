package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int l1;
		int l2;
		int loop;
		int t;
		int s;
		String n1 = new String(new char[410]);
		String n2 = new String(new char[410]);
		int[] a = new int[410];
		int[] b = new int[410];
		int[] c = new int[410];
		int num = char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (loop = 1;loop <= N;loop++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n2 = tempVar3.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,410 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,410 * (Integer.SIZE / Byte.SIZE));
			t = 0;
			s = 0;
			l1 = n1.length();
			l2 = n2.length();
			for (i = 0;i <= l1 - 1;i++)
			{
				a[i] = num(n1.charAt(l1 - 1 - i));
			}
			for (i = 0;i <= l2 - 1;i++)
			{
				b[i] = num(n2.charAt(l2 - 1 - i));
			}
			for (i = 0;i < 410;i++)
			{
				if (a[i] - b[i] - t >= 0)
				{
					c[i] = a[i] - b[i] - t;
					t = 0;
				}
				else
				{
					c[i] = a[i] - b[i] - t + 10;
					t = 1;
				}
			}
			for (i = 409;i >= 0;i--)
			{
				if (c[i] != 0)
				{
					s = 1;
				}
				if (s == 1)
				{
					System.out.printf("%d",c[i]);
				}
			}
			if (s == 0)
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
		return 0;
	}

	public static int num(char c)
	{
		return c - '0';
	}
}

