package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[200]);
		String str2 = new String(new char[200]);
	int[] zhe1 = new int[200];
	int[] zhe2 = new int[200];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(zhe1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(zhe2,0,(Integer.SIZE / Byte.SIZE));
	int cases;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		cases = Integer.parseInt(tempVar);
	}
	while (cases > 0)
	{
		int n1;
		int n2;
		int i;
		int j;
		int k;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str2 = tempVar3.charAt(0);
		}
		n1 = str1.length();
		n2 = str2.length();
		for (i = 0;i < n1;i++)
		{
			zhe1[i] = str1.charAt(i) - '0';
		}
		for (i = 0;i < n1;i++)
		{
			zhe2[i] = str2.charAt(i) - '0';
		}
	for (j = n1 - 1,k = n2 - 1;j >= 0,k >= 0;j--,k--)
	{
		if (zhe1[j] >= zhe2[k])
		{
			zhe1[j] -= zhe2[k];
		}
	else
	{
		zhe1[j] = 10 + zhe1[j] - zhe2[k];
	zhe1[j - 1]--;
	}
	}
	for (i = 0;i < n1;i++)
	{
		if (zhe1[i] != 0)
		{
			break;
		}
	}
	for (j = i;j < n1;j++)
	{
		System.out.printf("%d",zhe1[j]);
	}
	System.out.print("\n");
	cases--;
	}
	}

}

