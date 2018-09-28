package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void inv(int array[],int k);
		int i;
		int n;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < a + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		inv(a, n);
		System.out.printf("%d",a[0]);
		for (p = a + 1;p < a + n;p++)
		{
			System.out.printf(" %d",*p);
		}
	}

		public static void inv(int[] array, int k)
		{
			int temp;
			int j;
			int m;
			m = k / 2;
			for (j = 0;j < m;j++)
			{
				temp = array[k - j - 1];
				array[k - j - 1] = (array + j);
				array[j] = temp;
			}
			return;
		}
}

