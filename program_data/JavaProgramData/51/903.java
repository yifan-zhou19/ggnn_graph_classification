package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int l;
		int n;
		int[] c = new int[1000];
		int m = 0;
		String a = new String(new char[1000]);
		char[][] b = new char[1000][5];
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
		l = a.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
		for (i = 0;i < l - n + 1;++i)
		{
			b[i] = a.substring(i, i + n);
		}
		for (i = 0;i < l - n + 1;++i)
		{
			for (j = i + 1;j < l - n + 1;++j)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					++c[i];
					if (c[i] > m)
					{
						m = c[i];
					}
				}
			}
		}
		if (m == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",m + 1);
			for (i = 0;i < l - n + 1;++i)
			{
				if (c[i] == m)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
	}
}

