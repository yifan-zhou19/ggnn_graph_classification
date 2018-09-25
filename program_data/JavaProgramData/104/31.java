package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[20];
		int[] a2 = new int[20];
		int A1;
		int A2;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			A2 = Integer.parseInt(tempVar2);
		}
		if (A1 == A2)
		{
			System.out.printf("%d",A2);
			return 0;
		}
		for (i = 0;A1 != 0;i++)
		{
			a1[i] = A1;
			A1 = A1 / 2;
		}
		for (j = 0;A2 != 0;j++)
		{
			a2[j] = A2;
			A2 = A2 / 2;
		}
		for (k = 0, l = 0;k < i && l < j;)
		{
			if (a1[k] == a2[l])
			{
				System.out.printf("%d",a1[k]);
				break;
			}
			else if (a1[k] > a2[l])
			{
				k++;
			}
			else
			{
				l++;
			}
		}
		return 0;
	}
}

