package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n1;
		int n2;
		int j = 1;
		int k = 1;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i = 1;
		int m = 1;
		int number;
		int break1;
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
		if (n1 == 1 || n2 == 1)
		{
			System.out.print("1\n");
		}
		else
		{
			a[0] = n1;
			b[0] = n2;
			while (n1 > 1)
			{
			if (n1 % 2 == 0)
			{
				n1 = n1 / 2;
				a[i] = n1;
				i++;
			}
			else
			{
				n1 = (n1 - 1) / 2;
				a[i] = n1;
				i++;
			}
			j++;
			}
			while (n2 > 1)
			{
			if (n2 % 2 == 0)
			{
				n2 = n2 / 2;
				b[m] = n2;
				m++;
			}
			else
			{
				n2 = (n2 - 1) / 2;
				b[m] = n2;
				m++;
			}
			k++;
			}
			for (i = 0;i < j;i++)
			{
				for (m = 0;m < k;m++)
				{
					if (a[i] == b[m])
					{
						number = a[i];
					break1 = 0;
					break;
					}
				}
				   if (break1 == 0)
				   {
						break;
				   }
			}
					System.out.printf("%d",number);
		}
	}


}

