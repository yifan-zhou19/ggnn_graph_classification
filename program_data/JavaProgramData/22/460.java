package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[300];
		int j;
		int judge = 0;
		int k = 0;
		char c;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		for (i = 0;i < 299 && a[i] != 0;i++)
		{
			for (j = i + 1;j < 300;j++)
			{
				if (a[i] < a[j])
				{
				k = a[j];
				a[j] = a[i];
				a[i] = k;
				judge = 1;
				}
			}
		}

		if (judge == 1)
		{

			for (i = 1;i < 300;i++)
			{
				if (a[i] != a[i - 1])
				{
			System.out.printf("%d",a[i]);
			break;
				}
			}
		}
			else
			{
				System.out.print("No");
			}

	}

}

