package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[26][1000];
	public static int[] ai = new int[26];
	public static void func()
	{
		int k;
		int i;
		int len;
		String str = new String(new char[27]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		len = str.length();
		for (i = 0;i < len;i++)
		{
			a[str.charAt(i) - 'A'][ai[str.charAt(i) - 'A']] = k;
			ai[str.charAt(i) - 'A']++;
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ai,0,(Integer.SIZE / Byte.SIZE));
		int n;
		int i;
		int i0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
		func();
		}
		for (i = 0;i < 26;i++)
		{
			if (ai[i] > max)
			{
				max = ai[i];
			i0 = i;
			}
		}
		System.out.printf("%c\n",i0 + 'A');
		System.out.printf("%d\n",max);
		for (i = 0;i < ai[i0];i++)
		{
		System.out.printf("%d\n",a[i0][i]);
		}
	}

}

