package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int a;
		int j;
		int k;
		int b;
		int[] s = new int[100000];
		String zf = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < t;i++)
		{
			b = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(zf,0,(Character.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
			System.in.read();
			a = zf.length();
			for (j = 0;j < a;j++)
			{
				s[j] = 0;
			}
			for (j = 0;j < a;j++)
			{
				for (k = 0;k < a;k++)
				{
					if (zf.charAt(j) == zf.charAt(k))
					{
						s[j]++;
					}
				}
			}
			for (j = 0;j < a;j++)
			{
				if (s[j] == 1)
				{
					b = 2;
					System.out.printf("%c\n",zf.charAt(j));
					break;
				}
			}
			if (b == 1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

