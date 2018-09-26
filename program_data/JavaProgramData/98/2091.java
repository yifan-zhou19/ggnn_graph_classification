package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int len;
		int sum = 0;
		char[][] dw = new char[1000][41];
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
				dw[i] = tempVar2.charAt(0);
			}
			len = String.valueOf(dw[i]).length();

			if (sum + len + 1 > 80)
			{
				System.out.print("\n");
				sum = 0;
			}
			else
			{
				if (i > 0)
				{
				   System.out.print(" ");
				   sum++;
				}
			}
			System.out.printf("%s",dw[i]);
			sum += len;
		}
		return 0;
	}
}

