package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static int Main()
	{
		int[] a = new int[200];
		int i = 1;
		int j;
		int max;
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		while (b == ',')
		{
			i++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				b = tempVar4.charAt(0);
			}
		} //?????i????????a[1]????
		paixu(a + 1, i); //????

			max = a[1];
			for (j = 1;j <= i;j++)
			{
				if (a[j] < max)
				{
					System.out.printf("%d",a[j]);
					break;
				}
			}
			if ((i == 1) || (j == i + 1))
			{
				System.out.print("No");
			}
			return 0;
	}
}

