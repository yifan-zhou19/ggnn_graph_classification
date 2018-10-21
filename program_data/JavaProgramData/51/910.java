package <missing>;

public class GlobalMembers
{
	public static int strcmp(tangible.RefObject<String> a, tangible.RefObject<String> b, int n)
	{
		int i = 0;
		for (i = 0; i < n; i++)
		{
			if (a.argValue.charAt(i) != b.argValue.charAt(i))
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int n;
		int i;
		int j;
		int k;
		int x;
		int y;
		int l;
		int f;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length() + 1;
		f = 0;
		for (i = 0; i + n < l; i++)
		{
			for (j = i + 1; j + n < l; j++)
			{
				if (strcmp(a.charAt(i), a.charAt(j), n) == 1)
				{
					b.charAt(i)++;
				}
			}
			if (b.charAt(i) > f)
			{
				f = b.charAt(i);
			}
		}
		if (f == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n", f + 1);
			for (i = 0; i < l; i++)
			{
				if (b.charAt(i) == f)
				{
					for (j = 0; j < n; j++)
					{
						System.out.printf("%c", a.charAt(i + j));
					}
					System.out.print("\n");
				}
			}
		}
		//getchar();getchar();
		return 0;
	}

}

