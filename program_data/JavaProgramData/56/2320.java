package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int a;
		int[] b = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 5;i++)
		{
			b[i] = a % 10;
			a = (int)a / 10;
		}
		i = 0;
		while (b[i] != 0)
		{
			System.out.printf("%d",b[i]);
			i++;
		}
	}
}

