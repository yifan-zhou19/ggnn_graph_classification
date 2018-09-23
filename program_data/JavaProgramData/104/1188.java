package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;
		int t1;
		int t2;
		int[] x = new int[100];
		int[] y = new int[100];
		int z;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}

		i = 0;
		do
		{
			x[i++] = a;
			a /= 2;
		} while (a > 1);
		x[i] = 1;
		t1 = i;



		j = 0;
		do
		{
			y[j++] = b;
			b /= 2;
		} while (b > 1);
		y[j] = 1;
		t2 = j;


		for (i = 0;i <= t1;i++)
		{
			for (j = 0;j <= t2;j++)
			{
				if (x[i] == y[j])
				{
					System.out.printf("%d\n",x[i]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto flag;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	flag:
	;
	}
}

