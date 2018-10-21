package <missing>;

public class GlobalMembers
{
	public static int[] an1 = new int[MAX_LEN + 10];
	public static int[] an2 = new int[MAX_LEN + 10];
	public static String szLine1 = new String(new char[MAX_LEN + 10]);
	public static String szLine2 = new String(new char[MAX_LEN + 10]);
	public static int Add(int nMaxLen, int[] an1, int[] an2)
	//?????? nMaxLen ???? an1?an2 ???????an1, 
	//an1[0],an2[0]?????
	{
		int nHighestPos = 0;
		for (int i = 0;i < nMaxLen; i++)
		{
			an1[i] += an2[i]; //????
			if (an1[i] >= 10)
			{ //??????
				an1[i] -= 10;
				an1[i + 1]++; //??
			}
			if (an1[i] != 0)
			{
				nHighestPos = i; //????????
			}
		}
		return nHighestPos;
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			szLine1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			szLine2 = tempVar2.charAt(0);
		}
		int i;
		int j;
		//???memeset???an1???sizeof(an1)??????0
		//sizeof(an1)????an1???
		//memset???string.h???
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2, 0, (Integer.SIZE / Byte.SIZE));
		//???szLine1???????????????an1???
		//an1[0]?????
		int nLen1 = szLine1.length();
		for (j = 0, i = nLen1 - 1;i >= 0 ; i--)
		{
			an1[j++] = szLine1.charAt(i) - '0';
		}
		int nLen2 = szLine2.length();
		for (j = 0, i = nLen2 - 1;i >= 0 ; i--)
		{
			an2[j++] = szLine2.charAt(i) - '0';
		}
		int nHighestPos = Add(MAX_LEN, an1, an2);
		for (i = nHighestPos; i >= 0; i--)
		{
			System.out.printf("%d", an1[i]);
		}
		return 0;
	}
}

