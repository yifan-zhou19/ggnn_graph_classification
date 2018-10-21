package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int chek = new int(int a,int b,int c);
		int n;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (m = n + k;;m++)
		{
			if (chek(n, k, m) == 1)
			{
				break;
			}
		}
		System.out.printf("%d",m);
		return 0;
	}
	public static int chek(int A,int B,int C)
	{
		int x = 1;
		int j = 0;
		while (C % A == B && C > A && x >= 1)
		{
			x = (C - B) / A;
			C = C - B - x;
			j++;
		}
		if (j == A)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

