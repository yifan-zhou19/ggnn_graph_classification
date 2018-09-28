package <missing>;

public class GlobalMembers
{
	public static int maxlen(int x, int y)
	{
		if (x > y)
		{
		   return x;
		}
		return y;
	}
	public static int Main()
	{
		int N;
			String s1 = new String(new char[201]);
			String s2 = new String(new char[201]);
		int[] a = new int[201];
		int[] b = new int[201];
		int maxx;
		int l1;
		int l2;
		int i;
		int j;
		N = maxx = l1 = l2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int n = 0; n < N; n++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(s1, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(s2, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
			l1 = s1.length();
			l2 = s2.length();
			maxx = maxlen(l1, l2);
			for (i = maxx, j = l1 - 1; j >= 0; i--, j--)
			{
				a[i] = s1.charAt(j) - '0';
			}
			for (i = maxx, j = l2 - 1; j >= 0; i--, j--)
			{
				b[i] = s2.charAt(j) - '0';
			}
			for (i = maxx; i > 0; i--)
			{

				if (a[i] < b[i])
				{
					a[i] = a[i] + 10 - b[i];
					a[i - 1]--;
				}
				else
				{
					a[i] -= b[i];
				}
			}
			i = 0;
			while (a[i] == 0)
			{
				i++;
			}
			for (; i < maxx + 1; i++)
			{
				System.out.printf("%d", a[i]);
			}
				System.out.print("\n");
		}

		return 0;
	}

}

