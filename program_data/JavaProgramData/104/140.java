package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n1;
		int n2;
		int[] n1_ = new int[100];
		int[] n2_ = new int[100];
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		do
		{
			n1_[i] = n1;
			n1 = n1 / 2;
			i++;
		}while (n1 >= 1);
		n1_[i] = 1;
		do
		{
			n2_[j] = n2;
			n2 = n2 / 2;
			j++;
		}while (n2 >= 1);
		n2_[j] = 1;
		for (;;i--,j--)
		{
			if (n1_[i] != n2_[j])
			{
				break;
			}
		}
		System.out.printf("%d",n1_[i + 1]);
	}

}

