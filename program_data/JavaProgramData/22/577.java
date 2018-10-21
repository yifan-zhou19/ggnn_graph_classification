package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int num;
		int i = 0;
		int j;
		int max;
		int t;
		int flag = 0;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			i++;
		}while ((c = System.in.read()) != '\n');
		num = i;
		if (num == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < num;i++)
			{
			for (j = i;j < num;j++)
			{
				if (a[i] < a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			}
		max = a[0];
		for (i = 1;i < num;i++)
		{
			if (a[i] != max)
			{
				flag++;
				break;
			}
		}
		if (flag != 0)
		{
			System.out.printf("%d\n",a[i]);
		}
		else
		{
			System.out.print("No\n");
		}
		}
		return 0;
	}
}

