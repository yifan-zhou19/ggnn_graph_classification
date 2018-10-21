package <missing>;

public class GlobalMembers
{
	public static void plus(String a, String b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p1,* p2,*p;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p2;
		int p2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[] c = new int[100];
		int i;
		int l1;
		int l2;
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l2;i++)
		{
			c[i] = a[l1 - 1 - i] - b[l2 - i - 1];

		}
		for (i = l2;i < l1;i++)
		{
			c[i] = a[l1 - i - 1] - '0';

		}
		for (i = 0;i < l1;i++)
		{
			if (c[i] < 0)
			{
				c[i] = 10 + c[i];
				c[i + 1] = c[i + 1] - 1;
			}
		}
		p1 = c;
		p2 = p1 + l1 - 1;
		for (p = p2;p != p1;p--)
		{
			System.out.printf("%d", p);
		}
		System.out.printf("%d\n", p1);







	}



	public static void Main()
	{
		int n;
		int i;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}

		}

		for (i = 0;i < n;i++)
		{
			plus(a[i], b[i]);
		}


	}
}

