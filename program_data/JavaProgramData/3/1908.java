package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n; //?????????n??k????x?????i,j,????A
		int k;
		int x;
		int i = 1;
		int j;
		int A = 0;
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
		int[] a = new int[1000]; //????a[1000]
		for (i = 1;i <= n;i++) //?????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < n;i++) //????
		{
			for (j = i + 1;j <= n;j++) //???????a[i]?????????
			{
				if (a[i] + a[j] == k) //????????k????yes
				{
						System.out.print("yes");
						System.out.print("\n");
						A++;
						break;
				}
			}
			if (A == 1)
			{
				break;
			}
		}
		if (A == 0)
		{
			System.out.print("no");
			System.out.print("\n");
		}
		return 0;
	}
}

