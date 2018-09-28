package <missing>;

public class GlobalMembers
{
	public static int[] arr = new int[1000000];
	public static int[] brr = new int[1000000];
	public static int[] tot = new int[1004];
	public static int Main()
	{

		char a;
		int renshu = 0;
		int renshu1 = 0;
		char ch;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				arr[renshu] = Integer.parseInt(tempVar);
			}
			renshu++;
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				brr[renshu1] = Integer.parseInt(tempVar2);
			}
			renshu1++;
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		System.out.print(renshu);
		System.out.print(" ");
		tot[0] = 0;
		int i;
		int j;
		for (i = 1;i <= 1000;i++)
		{
			for (j = 0;j < renshu;j++)
			{
			   if (i >= arr[j] != 0 && i < brr[j])
			   {
				   tot[i]++;
			   }
			}
		}
		sort(tot,tot + 1001);
		System.out.print(tot[1000]);
		System.out.print("\n");
		return 0;
	}
}

