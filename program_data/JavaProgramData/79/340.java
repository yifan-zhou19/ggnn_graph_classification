public class monkey
{
	public int n;
	public int m;
}

package <missing>;

public class GlobalMembers
{
	public static monkey[] mon = tangible.Arrays.initializeWithDefaultmonkeyInstances(100);
	public static void Main()
	{
		int i = 0;
		int j;
		 int[] b = new int[100];
		 int wang = new int(int a,int c);
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				mon[i].n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				mon[i].m = Integer.parseInt(tempVar2);
			}
		i++;
		}while (mon[i - 1].n != 0 && mon[i - 1].m != 0);
		for (j = 0;j < i - 1;j++)
		{
			b[j] = wang(mon[j].n, mon[j].m);
		}
		for (j = 0;j < i - 1;j++)
		{
			System.out.printf("%d\n",b[j]);
		}
	}
	public static int wang(int a,int c)
	{
		int s = 0;
		int i;
		for (i = 2;i <= a;i++)
		{
			s = (s + c) % i;
		}
		return (s + 1);
	}
}

