package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ //de
		void seq(int m,int * seqm);
		int a;
		int b;
		int[] seqa = new int[10];
		int[] seqb = new int[10];
		int i;
		int t;
	//in
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
	//pro
		seq(a, seqa);
		seq(b, seqb);
	//ou
		for (i = 0;seqa[i] == seqb[i];i++)
		{
			t = seqa[i];
		}
		System.out.printf("%d",t);
		return 0;
	}

	public static void seq(int m, int[] seqm)
	{
		int i;
		int j;
		int[] temp = new int[10];
		temp[0] = m;
		for (i = 1;m > 1;i++)
		{
			temp[i] = m = m / 2;
		}
		for (j = i;j >= 0;j--)
		{
			seqm[j - 1] = temp[i - j];
		}



	}

}

