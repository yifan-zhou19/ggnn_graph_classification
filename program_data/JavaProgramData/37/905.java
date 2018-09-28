package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[100][10000];
		String[] pc = new String[100];
		int t;
		int i;
		int j;
		int k;
		int len;
		int num;
		int[] n = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pn;
		int pn;
		pn = n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			pc[i] = c[i];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < t;i++)
		{
			k = 0;
			for (j = 0;j < 26;j++)
			{
				*(pn + j) = 0;
			}
			len = String.valueOf(pc[i]).length();
			for (j = 0;j < len;j++)
			{
				num = (pc[i] + j) - 97;
				*(pn + num) += 1;
			}
			for (j = 0;j < len;j++)
			{
				num = (pc[i] + j) - 97;
				if (n[num] == 1)
				{
					System.out.printf("%c\n",*(pc[i] + j));
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

