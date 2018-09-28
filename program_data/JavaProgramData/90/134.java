package <missing>;

public class GlobalMembers
{
	public static int k = 0;
	public static int t;
	public static void Main()
	{
		void apple(int a[],int b[],int c[]);
		int[] M = new int[100];
		int[] N = new int[100];
		int[] s = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N[i] = Integer.parseInt(tempVar3);
			}
		}
		apple(M, N, s);
		System.out.printf("%d",s[0]);
		for (i = 1;i < t;i++)
		{
			System.out.printf("\n%d",s[i]);
		}
	}
	public static void apple(int[] a, int[] b, int[] c)
	{
		int i;
		int num = new int(int a,int b);
		for (i = 0;i < t;i++)
		{
			c[i] = num(a[i], b[i]);
		}
	}
	public static int num(int a,int b)
	{
		if (a < b)
		{
			b = a;
			k = num(a, b);
		}
		else
		{
			if (b == 1 || a == 0)
			{
				k = 1;
			}
			else if (b > 1)
			{
				k = num(a, b - 1) + num(a - b, b);
			}
		}
		return (k);
	}
}

