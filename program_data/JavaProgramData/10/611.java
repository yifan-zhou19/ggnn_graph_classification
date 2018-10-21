package <missing>;

public class GlobalMembers
{
	//?? - ????-??????????? 


	public static int Main()
	{
		int num = new int(int n,int * p);
		int n;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",num(n, p));
		System.in.read();
		System.in.read();
		System.in.read();

	}
	public static int num(int n, int[] p) //????????
	{
		int i;
		int j;
		int tem = 0;
		int a = 0;
		int[] max = new int[n];
		max[n - 1] = 1;
		for (i = n - 2;i >= 0;i--)
		{
						   tem = 0;
						   for (j = n - 1;j > i;j--)
						   {
											 if (p[i] >= p[j])
											 {
														  if (tem < max[j])
														  {
														  tem = max[j];
														  }
											 }
						   }
						   max[i] = tem + 1;
		}
		a = 0;
		for (i = 0;i < n;i++)
		{
		if (max[i] > a)
		{
			a = max[i];
		}
		}
		return a;

	}
}

