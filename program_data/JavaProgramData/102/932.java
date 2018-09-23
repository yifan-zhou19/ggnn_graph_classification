package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int h;
		j = 1;
		h = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] hei = new double[50];
		double[] man = new double[50];
		double[] woman = new double[50];
		char[][] xb = new char[50][10];
		int[] chang = new int[50];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xb[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				hei[i] = Double.parseDouble(tempVar3);
			}
			chang[i] = String.valueOf(xb[i]).length();
			if (chang[i] == 4)
			{
				man[j] = hei[i];
				j++;
			}
			if (chang[i] == 6)
			{
				woman[h] = hei[i];
				h++;
			}
		}
		j--;
		h--;
		int k;
		double e;
		for (k = 1;k < j;k++)
		{
			for (i = 1;i <= j - k;i++)
			{
				if (man[i] > man[i + 1])
				{
					e = man[i + 1];
					man[i + 1] = man[i];
					man[i] = e;
				}
			}
		}
		for (k = 1;k < h;k++)
		{
			for (i = 1;i <= h - k;i++)
			{
				if (woman[i] < woman[i + 1])
				{
					e = woman[i + 1];
					woman[i + 1] = woman[i];
					woman[i] = e;
				}
			}
		}
		for (i = 1;i <= j;i++)
		{
			System.out.printf("%.2lf ",man[i]);
		}
		System.out.printf("%.2lf",woman[1]);
		for (i = 2;i <= h;i++)
		{
			System.out.printf(" %.2lf",woman[i]);
		}
		return 0;
	}
}

