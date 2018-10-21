package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] number = new int[300];
		int i;
		int j;
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
							 number[i] = Integer.parseInt(tempVar2);
						 }
		}
		for (i = 0;i < n;i++)
		{
						 for (j = i + 1;j < n;j++)
						 {
											if (number[i] == number[j])
											{
											number[j] = -3;
											}
						 }
		}
		System.out.printf("%d",number[0]);
		for (i = 1;i < n;i++)
		{
						 if (number[i] > -1)
						 {
						 System.out.printf(",%d",number[i]);
						 }
		}
		return 0;
	}

}

