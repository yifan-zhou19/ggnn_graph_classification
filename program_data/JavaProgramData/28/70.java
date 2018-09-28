package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int k;
		int j;
			  k = 0;
		for (i = 0;i <= 300;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = tempVar.charAt(0);
		}
			 if (String.valueOf(a[i]).length() != 0)
			 {
				 k = k + 1;
			 }
		}

		if (k > 1)
		{
			System.out.printf("%d",String.valueOf(a[0]).length());
			for (i = 1;i < k;i++)
			{
				System.out.printf(",%d",String.valueOf(a[i]).length());
			}
		}
		if (k == 1)
		{
			System.out.printf("%d",String.valueOf(a[0]).length());
		}
	}
}

