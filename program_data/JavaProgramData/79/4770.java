package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[80][2];
		int i;
		int j;
		int s;
		for (j = 0;;j++)
		{
			s = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[j][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j][1] = Integer.parseInt(tempVar2);
			}
			if (a[j][0] == 0)
			{
				break;
			}
		for (i = 2; i <= a[j][0]; i++)
		{
			s = (s + a[j][1]) % i;
		}
		System.out.printf("%d\n",s + 1);
		}
	}

}

