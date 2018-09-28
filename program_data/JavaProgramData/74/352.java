package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		void primechart(int * p);
		int prime = new int(int n,int * p);
		int check = new int(int n,int i);
		int[] p = new int[32001];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *ppr;
		int ppr;
		int l;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		ppr = p;
		p[2] = 1;
	tangible.RefObject<Integer> tempRef_ppr = new tangible.RefObject<Integer>(ppr);
		primechart(tempRef_ppr);
		ppr = tempRef_ppr.argValue;
		l = 0;
		for (i = m;i <= n;i++)
		{
			len = (int)Math.log10(i) + 1;
			if ((p[i] == 1) && (check(i, len)) != 0)
			{
				if (l == 0)
				{
				System.out.printf("%d",i);
				l++;
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (l == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}

	public static void primechart(tangible.RefObject<Integer> p)
	{
		int i;
		int j;
		for (i = 4;i <= 32000;i = i + 2)
		{
			*(p.argValue + i) = -1;
		}
		for (i = 3;i <= 32000;i = i + 2)
		{
			if (*(p.argValue + i) == 0)
			{
				*(p.argValue + i) = 1;
				for (j = 2 * i;j <= 32000;j = j + i)
				{
					*(p.argValue + j) = -1;
				}
			}
		}
	}

	public static int prime(int n, tangible.RefObject<Integer> p)
	{
		int i;
		for (i = 3;i <= Math.sqrt(n);i = i + 2)
		{
			if ((*(p.argValue + i) == 1) && (n % i == 0))
			{
				return 0;
			}
		}
		return 1;
	}

	public static int check(int n,int i)
	{
		int j;
		String s = new String(new char[10]);
		//printf("%d %d\n",n,i);
		for (j = 0;j <= i - 1;j++)
		{
			s = tangible.StringFunctions.changeCharacter(s, j, '0' + n % 10);
			n = n / 10;
		}
		s = tangible.StringFunctions.changeCharacter(s, i, '\0');
		for (j = 0;j <= i / 2;j++)
		{
			if (s.charAt(j) != s.charAt(i - 1 - j))
			{
				return 0;
			}
		}
		return 1;
	}
}

