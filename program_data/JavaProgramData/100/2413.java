package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int[] b = new int[128];
		int i;
		int j;
		int k;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		k = a.length();
		for (i = 0;i < k;i++)
		{
			j = a.charAt(i);
			if ((j > 64 && j < 91) || (j>96 && j < 123))
			{
				b[j]++;
			}
		}
		for (j = 65;j < 91;j++)
		{
			if (b[j] > 0)
			{
				if (l == 0)
				{
					System.out.printf("%c=%d",j,b[j]);
				}
				else
				{
					System.out.printf("\n%c=%d",j,b[j]);
				}
				l++;
			}
		}
		for (j = 97;j < 123;j++)
		{
			if (b[j] > 0)
			{
				if (l == 0)
				{
					System.out.printf("%c=%d",j,b[j]);
				}
				else
				{
					System.out.printf("\n%c=%d",j,b[j]);
				}
				l++;
			}
		}
		if (l == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

