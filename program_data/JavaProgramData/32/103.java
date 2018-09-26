package <missing>;

public class GlobalMembers
{
	public static void subtract(String a, String b)
	{
		int[] re = new int[100];
		int lena;
		int lenb;
		int i;
		int j;
		int m = 0;
		lena = a.length();
		lenb = b.length();


		for (i = 0;i < lena;i++)
		{
			re[i] = a[i] - 48;
		}
		for (i = lena - 1,j = lenb - 1;j >= 0;i--,j--)
		{
			re[i] = re[i] + 48 - b[j];
			if (re[i] < 0)
			{
				re[i - 1]--;
				re[i] += 10;
			}
		}

		for (i = 0;i < lena;i++)
		{
			if (m == 0 && re[i] == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%d",re[i]);
				m = 1;
			}
		}

		System.out.print("\n");
	}




	public static int Main()
	{



		int n;
		int i;
		int k;
		char[][] inp = new char[100][100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 3 * n;
	//	printf("k=%d\n",k);
		for (i = 0;i < k;i++)
		{
	//		printf("i=%d\n",i);
			inp[i] = new Scanner(System.in).nextLine();
	//		printf("i=%d\n",i);
		}
	//	printf("len=%d\n",strlen(inp[0]));
	//	printf("str=%s\n",inp[3]);

		for (i = 0;i < n;i++)
		{
			subtract(inp[3 * i + 1], inp[3 * i + 2]);
		}

	}
}

