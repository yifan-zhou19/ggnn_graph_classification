package <missing>;

public class GlobalMembers
{
	public static void f(String a, String b)
	{
		int[] n1 = new int[300];
		int[] n2 = new int[300];
		int[] n3 = new int[300];
		int i;
		int t;
		int k = 0;
		//?????????
		t = a.length();
		for (i = 0;i < t;i++)
		{
			n1[300 - t + i] = a[i] - 48;
		}
		t = b.length();
		for (i = 0;i < t;i++)
		{
			n2[300 - t + i] = b[i] - 48;
		}
		//????????????
		for (i = 0;i < 300;i++)
		{
			n3[i] = n1[i] - n2[i];
		}
		for (i = 299;i >= 0;i--)
		{
			if (n3[i] < 0)
			{
			n3[i] = n3[i] + 10;
			n3[i - 1]--;
			}
		}
			//???????0??
			//?????0???
		for (i = 0;i < 299;i++)
		{
			if (n3[i] != 0 && k == 0)
			{
				System.out.printf("%d",n3[i]);
				k++;
			}
			else if (k == 1)
			{
				System.out.printf("%d",n3[i]);
			}
		}
			System.out.printf("%d\n",n3[299]);
	}
	public static void Main()
	{
		char[][] a = new char[10][300];
		char[][] b = new char[10][300];
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
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
		}
		for (i = 0;i < n;i++)
		{
			f(a[i], b[i]);
		}
	}
}

