public class bo
{
	public String id = new String(new char[10]);
	public String au = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max;
		char maxa;
		bo[] book;
		int[] auth = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(auth,0,(Integer.SIZE / Byte.SIZE) * 26);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		book = tangible.Arrays.initializeWithDefaultboInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].au = tempVar3.charAt(0);
			}
			for (j = 0;book[i].au.charAt(j);j++)
			{
				auth[book[i].au.charAt(j) - 'A']++;
			}
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (max < auth[i])
			{
				max = auth[i];
				maxa = i + 'A';
			}
		}
		System.out.printf("%c\n",maxa);
		System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
			if (tangible.StringFunctions.strChr(book[i].au,maxa))
			{
				System.out.printf("%s\n",book[i].id);
			}
		}

		return 0;
	}
}

