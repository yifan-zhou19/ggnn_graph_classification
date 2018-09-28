package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int age;
		int max;
		int t;
		int numold;
		int numyoung;
		char[][] id = new char[101][10];
		char[][] young = new char[101][10];
		int[] x = new int[101];
		int[] r = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 101;i++)
		{
			x[i] = 0;
			r[i] = 0;
		}
		numold = 0;
		numyoung = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age = Integer.parseInt(tempVar3);
			}
			if (age >= 60)
			{
			   x[i] = age;
			   numold++;
			}
			else
			{
				 numyoung++;
				 young[numyoung] = id[i];
			}
		}
		for (i = 1;i < 101;i++)
		{
			max = 1;
			for (int j = 2;j < 101;j++)
			{
				if (x[j] > x[max])
				{
					max = j;
				}
			}
			x[max] = 0;
			t = i;
			r[i] = max;
			max = t;
		}
		for (i = 1;i <= numold;i++)
		{
			System.out.printf("%s\n",id[r[i]]);
		}
		for (i = 1;i <= numyoung;i++)
		{
			System.out.printf("%s\n",young[i]);
		}
	}

}

