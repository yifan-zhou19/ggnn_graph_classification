package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] it = new int[1001];
		int[] ot = new int[1001];
		int[] tr = new int[1001];
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;
		int rs;
		int trm = 0;
		for (i = 0;;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			it[i] = Integer.parseInt(tempVar);
		}
		if ((c = System.in.read()) == '\n')
		{
			break;
		}
		}
		rs = i + 1;
		for (i = 0;i < rs;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ot[i] = Integer.parseInt(tempVar2);
			}
			System.in.read();
		}





		for (i = 0;i < rs;i++)
		{
			for (j = it[i];j < ot[i];j++)
			{
				tr[j]++;
			}
		}
		for (j = 0;j < 1000;j++)
		{
			if (tr[j] > trm)
			{
				trm = tr[j];
			}
		}
		System.out.printf("%d %d",rs,trm);


	}



}

