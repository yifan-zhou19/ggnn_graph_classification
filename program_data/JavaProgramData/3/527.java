package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int s = 0;
		int i;
		int j;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i] = Integer.parseInt(tempVar3);
			 }
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			while (j < n)
			{
				if (i == j)
				{
					j++;
					continue;
				}
				else
				{
					s = a[i] + a[j];
					j++;
					if (k == s)
					{
						System.out.print("yes");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto label;
					}
				};
			};
			if ((i == n - 1) && (s != k))
			{
				System.out.print("no");
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		label:
		return (0);
	}
}

