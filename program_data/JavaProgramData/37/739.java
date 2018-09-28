package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		int i;
		int j;
		int n;
		int sum;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n > 0;n--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				for (j = 0;a.charAt(j) != '\0';j++)
				{
					if (a.charAt(j) == a.charAt(i) && j != i)
					{
					sum = sum + 1;
					break;
					}
				}
				if (sum == 0)
				{
						sum = 2;
						break;
				}
				sum = 0;
			}
			if (sum == 2)
			{
				System.out.printf("%c",a.charAt(i));
			}
			else
			{
				System.out.print("no");
			}
			System.out.print("\n");
			sum = 0;
		}
	}
}

