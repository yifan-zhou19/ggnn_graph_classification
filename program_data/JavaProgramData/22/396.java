package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[9000];
		int n;
		int i = 0;
		int max;
		int sec;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a[i + 1] = Integer.parseInt(tempVar2);
		}
		while (a[i + 1] == ',')
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
			a[i + 1] = Integer.parseInt(tempVar4);
		}
		}
		n = i;
		max = a[0];
		for (i = 0;i <= n;i++)
		{
			if (a[i] > max)
			{
		max = a[i];
			}
		}
		sec = -1;
		for (i = 0;i <= n;i++)
		{
			if (a[i] > sec && a[i] < max)
			{
		sec = a[i];
			}
		}
		if (sec == max || sec == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",sec);
		}
	}
}

