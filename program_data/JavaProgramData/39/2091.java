package <missing>;

public class GlobalMembers
{
	public static int[] money = new int[100];
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int j;
		int k;
		int z = 0;
		char[][] name = new char[100][30];
		String ganbu = new String(new char[100]);
		String xibu = new String(new char[100]);
		String t = new String(new char[30]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				ganbu = tangible.StringFunctions.changeCharacter(ganbu, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				xibu = tangible.StringFunctions.changeCharacter(xibu, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				c[i] = Integer.parseInt(tempVar7);
			}
			if (a[i] > 80 && c[i] != 0)
			{
				money[i] = money[i] + 8000;
			}
			if (a[i] > 85 && b[i] > 80)
			{
				money[i] = money[i] + 4000;
			}
			if (a[i] > 90)
			{
				money[i] = money[i] + 2000;
			}
			if (a[i] > 85 && xibu.charAt(i) == 'Y')
			{
				money[i] = money[i] + 1000;
			}
			if (b[i] > 80 && ganbu.charAt(i) == 'Y')
			{
				money[i] = money[i] + 850;
			}
		}
		for (j = 0;j < n;j++)
		{
			z = z + money[j];
		}
		for (j = n - 1;j > 0;j--)
		{
			if (money[j] > money[j - 1])
			{
				k = money[j];
				money[j] = money[j - 1];
				money[j - 1] = k;

				t = name[j];
				name[j] = name[j - 1];
				name[j - 1] = t;
			}
		}
		System.out.printf("%s\n%d\n%d\n",name[0],money[0],z);

		return 0;
	}
}

