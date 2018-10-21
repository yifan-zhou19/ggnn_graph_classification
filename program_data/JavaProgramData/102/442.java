package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p = 0;
		int q = 0;
		String tmp = new String(new char[10]);
		double[] man = new double[50];
		double[] woman = new double[50];
		double temp;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tmp = tempVar2.charAt(0);
			}
			if (tmp.charAt(0) == 'f')
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				woman[p++] = Double.parseDouble(tempVar3);
			}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					man[q++] = Double.parseDouble(tempVar4);
				}
			}
		}
		for (i = p - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (woman[j] < woman[j + 1])
				{
					temp = woman[j];
					woman[j] = woman[j + 1];
					woman[j + 1] = temp;
				}
			}
		}
		for (i = q - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (man[j] > man[j + 1])
				{
					temp = man[j];
					man[j] = man[j + 1];
					man[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < q;i++)
		{
			if (flag == 0)
			{
				flag = 1;
			}
			else
			{
				System.out.print(" ");
			}
			System.out.printf("%.2f",man[i]);
		}
		for (i = 0;i < p;i++)
		{
			if (flag == 0)
			{
				flag = 1;
			}
			else
			{
				System.out.print(" ");
			}
			System.out.printf("%.2f",woman[i]);
		}
	}
}

