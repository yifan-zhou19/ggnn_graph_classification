package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] t = new int[100];
		int i;
		int j;
		int k;
		int l = 0;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (;l < k;l++)
		{
			for (j = 0;j < 81;j++)
			{
				a[j] = System.in.read();
				if (a[j] == '\n')
				{
					a[j] = '\0';
					break;
				}
			}
			for (i = 0;i < j;i++)
			{
				if (!(a[i] > 47 && a[i] < 58 || a[i] == 95 || a[i]>64 && a[i] < 91 || a[i]>96 && a[i] < 123))
				{
					t[l] = -1;
					break;
				}
				else if (a[0] > 47 && a[0] < 58)
				{
					t[l] = -1;
					break;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",t[i] + 1);
		}
	}

}

