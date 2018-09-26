package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] N1 = new int[100];
		int[] N2 = new int[100];
		int[] N = new int[200];
		int n1;
		int n2;
		void scan(int N1[],int N2[],int * p1,int * p2);
		void order(int N1[],int n1,int N2[],int n2);
		void join(int N1[],int N2[],int N[],int n1,int n2);
		void print(int N[],int n);
	tangible.RefObject<Integer> tempRef_n1 = new tangible.RefObject<Integer>(n1);
	tangible.RefObject<Integer> tempRef_n2 = new tangible.RefObject<Integer>(n2);
		scan(N1, N2, tempRef_n1, tempRef_n2);
		n2 = tempRef_n2.argValue;
		n1 = tempRef_n1.argValue;
		order(N1, n1, N2, n2);
		join(N1, N2, N, n1, n2);
		print(N, n1 + n2);
	}
	public static void scan(int[] N1, int[] N2, tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.argValue = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p2.argValue = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < p1.argValue;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < p2.argValue;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				N2[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void order(int[] N1, int n1, int[] N2, int n2)
	{
		int i;
		int j;
		int imin;
		int Nmin;
		int Nm;
		for (i = 0;i < n1;i++)
		{
			imin = i;
			Nmin = N1[i];
			for (j = i;j < n1;j++)
			{
				if (N1[j] < Nmin)
				{
					imin = j;
					Nmin = N1[j];
				}
			}
			Nm = N1[i];
			N1[i] = N1[imin];
			N1[imin] = Nm;
		}
		for (i = 0;i < n2;i++)
		{
			imin = i;
			Nmin = N2[i];
			for (j = i;j < n2;j++)
			{
				if (N2[j] < Nmin)
				{
					imin = j;
					Nmin = N2[j];
				}
			}
			Nm = N2[i];
			N2[i] = N2[imin];
			N2[imin] = Nm;
		}
	}
	public static void join(int[] N1, int[] N2, int[] N, int n1, int n2)
	{
		int i;
		for (i = 0;i < n1;i++)
		{
			N[i] = N1[i];
		}
		for (i = n1;i < n1 + n2;i++)
		{
			N[i] = N2[i - n1];
		}
	}
	public static void print(int[] N, int n)
	{
		int i;
		System.out.printf("%d",N[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",N[i]);
		}
	}
}

