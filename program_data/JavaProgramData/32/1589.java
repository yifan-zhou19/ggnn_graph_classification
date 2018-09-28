package <missing>;

public class GlobalMembers
{
	public static int[] an1 = new int[100];
	public static int[] an2 = new int[100];
	public static String szLine1 = new String(new char[100]);
	public static String szLine2 = new String(new char[100]);
	public static void Main()
	{
		int n;
		int p;
		int i;
		int j;
		int nLen1;
		int nLen2;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 0;p < n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				szLine1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				szLine2 = tempVar3.charAt(0);
			}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2,0,(Integer.SIZE / Byte.SIZE));

		nLen1 = szLine1.length();
		j = 0;

		for (i = nLen1 - 1;i >= 0;i--)
		{
			an1[j++] = szLine1.charAt(i) - '0';
		}
		nLen2 = szLine2.length();
		j = 0;
		for (i = nLen2 - 1;i >= 0;i--)
		{
			an2[j++] = szLine2.charAt(i) - '0';
		}
		if (nLen1 > nLen2)
		{
			max = nLen1 - 1;
		}
		else
		{
			max = nLen2;
		}
		for (i = 0;i < max;i++)
		{
			an1[i] -= an2[i];
			if (an1[i] < 0)
			{
				an1[i] += 10;
				an1[i + 1]--;
			}
		}
		for (i = max;i >= 0;i--)
		{
			System.out.printf("%d",an1[i]);
		}
		System.out.print("\n");
		}

	}


}

