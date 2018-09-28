package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *t,i,j,n,is[10000];
		int t;
		int i;
		int j;
		int n;
		int[] is = new int[10000];
		String a = new String(new char[81]);
		String p;
		t = is;
		for (i = 1;i <= 100;i++)
		{
			*(t + i) = 1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			p = a;
			if (p < 65 || p>90 && p < 97 && p != 95 || p>122)
			{
				*(t + i) = 0;
			}
			for (j = 1;j < a.length();j++)
			{
				if (*(p.Substring(j)) < 48 || *(p.Substring(j))>57 && *(p.Substring(j)) < 65 || *(p.Substring(j))>90 && *(p.Substring(j)) < 97 && *(p.Substring(j)) != 95 || *(p.Substring(j))>122)
				{
					*(t + i) = 0;
				}
			}

		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n",*(t + i));
		}


	}
}

