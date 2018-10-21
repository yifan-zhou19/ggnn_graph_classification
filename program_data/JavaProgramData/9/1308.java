public class patient
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);

			public static int[] over60 = new int[100];
			public static int[] below60 = new int[100];
			public static int m;
			public static int k;
	public static void Main(String[] args)
	{
		void choose(struct patient * p,int n);
		int n;
		int i;
		int j;
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
			pat[i].id = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			pat[i].age = Integer.parseInt(tempVar3);
		}
		}
		choose(pat, n);
		for (j = 1;j <= m;j++)
		{
			if (over60[m - j] != over60[m - j - 1])
			{
		for (i = 0;i < n;i++)
		{

			if (pat[i].age == over60[m - j])
			{
				System.out.printf("%s\n",pat[i].id);
			}
		}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (pat[i].age < 60)
			{
				System.out.printf("%s\n",pat[i].id);
			}
		}
	}
		public static void choose(patient p, int n)
		{
			void paixu(int * a,int n);
			int i;
			for (i = 0,m = 0,k = 0;i < n;i++)
			{
				if ((p + i).age >= 60)
				{
		over60[m] = (p + i).age;
		m++;
				}
			}
		tangible.RefObject<Integer> tempRef_over60 = new tangible.RefObject<Integer>(over60);
			paixu(tempRef_over60, m);
			over60 = tempRef_over60.argValue;
		}

		public static void paixu(tangible.RefObject<Integer> a, int n)
		{
			int j;
			int i;
			int e;
			for (j = 1;j < n;j++)
			{
			for (i = 0;i < n - j;i++)
			{
				if (*(a.argValue + i) > *(a.argValue + i + 1))
				{
					e = (a.argValue + i);
					*(a.argValue + i) = *(a.argValue + i + 1);
					*(a.argValue + i + 1) = e;
				}
			}
			}
		}

}

