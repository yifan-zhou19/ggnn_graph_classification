package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] c = new int[300];
		int temp;
		int i;
		int j;
		int n;
		int s = 0;
		int max;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
	   c[0] = ',';
	  a[1] = -1;
		for (i = 1;c[i - 1] != '\0' && scanf("%c", c[i]) != EOF && scanf("%d", a[i]) != EOF;i++)
		{
			s = s + 1;

		}
		for (i = 0;i <= s;i++)
		{
			for (j = i;j <= s;j++)
			{
				if (a[i] >= a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = s;i >= 0;i--)
		{
			if (a[i] != a[s])
			{
				max = a[i];
				break;
			}
		}

		if ((a[0] == a[s]) || (a[1] == -1))
		{
		System.out.print("No");
		}
		else
		{
		System.out.printf("%d",max);
		}
	}

}

