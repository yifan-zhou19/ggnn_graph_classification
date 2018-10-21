package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] intime = new int[1000];
		int[] outtime = new int[1000];
		int[] trs = new int[1000];
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;
		int rs;
		int maxrs = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				intime[i] = Integer.parseInt(tempVar);
			}
			if ((c = System.in.read()) != ',')
			{
				break;
			}
		}
		rs = i + 1;
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				outtime[i] = Integer.parseInt(tempVar2);
			}
			if ((c = System.in.read()) != ',')
			{
				break;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			trs[i] = 0;
		}
		for (i = 0;i < rs;i++)
		{
			for (j = intime[i];j < outtime[i];j++)
			{
			trs[j]++;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (trs[i] > maxrs)
			{
				maxrs = trs[i];
			}
		}

		System.out.printf("%d %d",rs,maxrs);
	}
}

