package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int i = 0;
		int j;
		int[] b = new int[3];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
			b[i] = 3;
			i++;
		}
		if (a % 5 == 0)
		{
			b[i] = 5;
			i++;
		}
		if (a % 7 == 0)
		{
			b[i] = 7;
			i++;
		}
		if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.print("n");
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d",b[j]);
			if (j < i - 1)
			{
				System.out.print(" ");
			}
		}

		   System.out.print("\n");

	}


}

