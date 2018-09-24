package <missing>;

public class GlobalMembers
{
	public static int[] an1 = new int[MAXLEN + 10];
	public static int[] an2 = new int[MAXLEN + 10];
	public static String sline1 = new String(new char[MAXLEN + 10]);
	public static String sline2 = new String(new char[MAXLEN + 10]);
	public static int ADD(int nMAXLEN, int[] a1, int[] a2)
	{
		int i = 0;
		int j = 0;
		int highest;
		for (i = 0; i <= nMAXLEN; i++)
		{
			a1[i] += a2[i];
			if (a1[i] >= 10)
			{
				a1[i] -= 10;
				a1[i + 1]++;
			}
			if (a1[i] > 0)
			{
				highest = i;
			}
		}
		return highest;
	}
	public static int Main()
	{
		int i = 0;
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2, 0, (Integer.SIZE / Byte.SIZE));
		//scanf("%s",sline1);
		//scanf("%s",sline2);
		sline1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sline2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = sline1.length();
		for (j = 0, i = len1 - 1; i >= 0; i--)
		{
			an1[j++] = sline1.charAt(i) - '0';
		}
		int len2 = sline2.length();
		for (j = 0, i = len2 - 1; i >= 0; i--)
		{
			an2[j++] = sline2.charAt(i) - '0';
		}
		int k = ADD(MAXLEN, an1, an2);
		for (i = k; i >= 0; i--)
		{
			//printf("%d",an1[i]);
			System.out.print(an1[i]);
		}
		return 0;
	}






}

