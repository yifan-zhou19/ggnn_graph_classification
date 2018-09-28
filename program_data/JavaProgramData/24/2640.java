package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] a = new char[1000][50];
		int[] b = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String p1 = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = b;
		p1 = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(p1.Substring(i)) = tempVar2;
			}
			*(p + i) = String.valueOf(*(p1.Substring(i))).length();
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (*(p + j) > *(p + j + 1))
				{
					k = (p + j);
					*(p + j) = *(p + j + 1);
					*(p + j + 1) = k;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			k = String.valueOf(*(p1.Substring(i))).length();
			if (k == *(p + n - 1))
			{
				System.out.printf("%s\n",*(p1.Substring(i)));
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			k = String.valueOf(*(p1.Substring(i))).length();
			if (k == *(p + 0))
			{
				System.out.printf("%s",*(p1.Substring(i)));
				break;
			}
		}
	}




}

