package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int d;
		int n;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		int[] score = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			score[i] = b;
		}
		for (i = 0;i < a;i++)
		{


			d = score[1];
			score[1] = score[0];
			for (c = 1;c < n - 1;c++)
			{
				e = score[c + 1];
				score[c + 1] = d;
				d = e;
			}
			score[0] = e;

		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",score[i]);
		}
		System.out.printf("%d",score[n - 1]);
	}


}

