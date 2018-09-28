public class inf
{
	public String name = new String(new char[30]);
	public int s1; //??
	public int s2; //??
	public char a; //??
	public char b; //??
	public int num; //??
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t;
		int total = 0;
		int[] money = new int[100];
		int max = 0;
		inf[] c = tangible.Arrays.initializeWithDefaultinfInstances(100);
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
				c[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i].s1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i].s2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				c[i].a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				c[i].b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				c[i].num = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i].s1 > 80 && c[i].num > 0)
			{
				money[i] = money[i] + 8000;
			}
			if (c[i].s1 > 85 && c[i].s2 > 80)
			{
				money[i] = money[i] + 4000;
			}
			if (c[i].s1 > 90)
			{
				money[i] = money[i] + 2000;
			}
			if (c[i].s1 > 85 && c[i].b == 'Y')
			{
				money[i] = money[i] + 1000;
			}
			if (c[i].s2 > 80 && c[i].a == 'Y')
			{
				money[i] = money[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (money[i] > max)
			{
				max = money[i];
				t = i;
			}
			total += money[i];
		}
		System.out.printf("%s\n",c[t].name);
		System.out.printf("%d\n",max);
		System.out.printf("%d",total);
	}












}

