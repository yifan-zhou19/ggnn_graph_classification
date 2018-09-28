package <missing>;

public class GlobalMembers
{
	public static int[] aa = new int[1000];
	public static int[] ab = new int[1000];
	public static void cheng(int[] a1, int[] a2)
	{
		int i;
		int j;
	   for (i = 0;i <= 999;i++)
	   {
		   a2[i] = a2[i] + a1[i] * 2;
		if (a2[i] > 9)
		{
			a2[i] = a2[i] - 10;
		a2[i + 1]++;
		}

	   }
	   return;
	}
	public static void copy(int[] a1, int[] a2)
	{
		int i;
	 for (i = 0;i <= 999;i++)
	 {
		 a1[i] = a2[i];
	 }
	 return;
	}


	public static int Main()
	{
		int i;
		int k;
		int m;
		int n;
		int a;
		int t1;
		int t2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n <= 20)
		{
			a = 1;
		for (i = 1;i <= n;i++)
		{
			a = a * 2;
		}
		System.out.print(a);
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(aa,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ab,0,(Integer.SIZE / Byte.SIZE));
			aa[0] = 1;
			for (k = 1;k <= n;k++)
			{
				cheng(aa, ab);
				copy(aa, ab);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(ab,0,(Integer.SIZE / Byte.SIZE));
			}

		k = 999;
			while (aa[k] == 0)
			{
				k--;
			}
			for (;k >= 0;k--)
			{
				System.out.print(aa[k]);
			}
		}
		return 0;
	}


}

