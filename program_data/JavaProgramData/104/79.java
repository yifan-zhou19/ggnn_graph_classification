package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int count1;
		int count2;
		int[] a = new int[20];
		int[] b = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (count1 = 0;x != 0;count1++)
		{
			a[count1] = x;
			x /= 2;
		}
		for (count2 = 0;y != 0;count2++)
		{
			b[count2] = y;
			y /= 2;
		}
		i = 0;
		do
		{
			i++;
		}while (a[count1 - i] == b[count2 - i]);
		System.out.printf("%d",a[count1 - i + 1]);
	}
}

