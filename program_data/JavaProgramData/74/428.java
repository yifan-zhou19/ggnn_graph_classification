package <missing>;

public class GlobalMembers
{
	public static int hui(int p, int a)
	{
		int r;
		int fan = 0;
		do
		{
			r = p % 10;
			fan = fan * 10 + r;
			p = p / 10;
		}while (p != 0);

		if (fan == a)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int su(int q)
	{
		int r;
		int chu = 2;
		while (chu < q)
		{
			r = q % chu;
			if (r == 0)
			{
				break;
			}
			else
			{
				chu++;
			}
		}
		if (chu == q)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int flag = 0;
		int blag = 0;
		int k = 0;
		int[] array = new int[1000];
		for (i = 0;i < 1000;i++)
		{
			array[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		 for (i = m;i <= n;i++)
		 {
			 if (hui(i, i) != 0)
			 {
				 flag = 1;
				 if (su(i) != 0)
				 {
					 blag = 1;
					 array[k] = i;
					 k++;
				 }
			 }
		 }
			 if (blag == 1)
			 {
				 for (i = 0;i < k - 1;i++)
				 {
					 System.out.printf("%d,",array[i]);
				 }
				 System.out.printf("%d",array[k - 1]);
			 }
			 else
			 {
				 System.out.print("no");
			 }


	}

}

