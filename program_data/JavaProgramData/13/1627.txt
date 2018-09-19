package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[100000];
	int[] b = new int[100000];
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
			a[i] = Integer.parseInt(tempVar2);
		}
	}

		for (i = 0;i < n;i++)
		{
		 for (j = 0;j < n;j++)
		 {
		if (b[i] == 0)
		{

		if (i != j)
		{


		if (a[i] == a[j])
		{
			b[j] = 1;
		}
		}
		else
		{
		continue;
		}
		}
		 }
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (b[i] == 0)
			{
			System.out.print(" ");
			System.out.printf("%d",a[i]);
			}
			else
			{
			continue;
			}
		}
	return 0;
	}
}

