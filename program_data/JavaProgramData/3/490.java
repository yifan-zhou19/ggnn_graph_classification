package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j = 0;
		int n;
		int k;
		int l;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
			if (a[i] <= k)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (l = i + 1;l < j;l++)
			{
				t = b[i] + b[l];
				if (t == k)
				{
					System.out.print("yes");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
		}
		 if (i >= (j - 1))
		 {
			 System.out.print("no");
		 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	System.out.print("\n");
	}

}

