package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] n1 = new int[100];
		int[] n2 = new int[100];
		int[] o = new int[200];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1=&m,*p2=&n;
		int p1 = m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2=&n;
		int p2 = n;
		void get(int * p1,int * p2,int m1[],int m2[]);
		void sort(int * p,int m[]);
		void cpy(int * p1,int * p2,int m1[],int m2[],int m[]);
		void put(int * p1,int * p2,int m[]);
	tangible.RefObject<Integer> tempRef_p1 = new tangible.RefObject<Integer>(p1);
	tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
		get(tempRef_p1, tempRef_p2, n1, n2);
		p2 = tempRef_p2.argValue;
		p1 = tempRef_p1.argValue;
	tangible.RefObject<Integer> tempRef_p12 = new tangible.RefObject<Integer>(p1);
		sort(tempRef_p12, n1);
		p1 = tempRef_p12.argValue;
	tangible.RefObject<Integer> tempRef_p22 = new tangible.RefObject<Integer>(p2);
		sort(tempRef_p22, n2);
		p2 = tempRef_p22.argValue;
	tangible.RefObject<Integer> tempRef_p13 = new tangible.RefObject<Integer>(p1);
	tangible.RefObject<Integer> tempRef_p23 = new tangible.RefObject<Integer>(p2);
		cpy(tempRef_p13, tempRef_p23, n1, n2, o);
		p2 = tempRef_p23.argValue;
		p1 = tempRef_p13.argValue;
	tangible.RefObject<Integer> tempRef_p14 = new tangible.RefObject<Integer>(p1);
	tangible.RefObject<Integer> tempRef_p24 = new tangible.RefObject<Integer>(p2);
		put(tempRef_p14, tempRef_p24, o);
		p2 = tempRef_p24.argValue;
		p1 = tempRef_p14.argValue;
		return 0;
	}
	public static void get(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, int[] m1, int[] m2)
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
				m1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < p2.argValue;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void sort(tangible.RefObject<Integer> p, int[] m)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < p.argValue;i++)
		{
		for (j = i + 1;j < p.argValue;j++)
		{
			if (m[i] > m[j])
			{
				k = m[i];
				m[i] = m[j];
				m[j] = k;
			}
		}
		}
	}
	public static void cpy(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, int[] m1, int[] m2, int[] m)
	{
		int i;
		int j;
		for (i = 0,j = 0;i < p1.argValue;i++,j++)
		{
			m[i] = m1[i];
		}
		for (j = 0;i < p1.argValue + p2.argValue;i++,j++)
		{
			m[i] = m2[j];
		}
	}
	public static void put(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, int[] m)
	{
		int i;
		System.out.printf("%d",m[0]);
		for (i = 1;i < p1.argValue + p2.argValue;i++)
		{
			System.out.printf(" %d",m[i]);
		}
	}

}

