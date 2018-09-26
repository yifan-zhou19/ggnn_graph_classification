package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n = 1;
		int j = 0;
		int k = 0;
		int m = 0;
		int sum = 0;
		int min = 10000;
		int max = 0;
		int temp = 0;
		int[] a = new int[2000];
		int[] b = new int[2000];
		while ((a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (System.in.read() == ',')
			{
				n++;
			}
			else
			{
				break;
			}
			i++;
		}
		i = 0;
		while ((b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (System.in.read() != ',')
			{
				break;
			}
			i++;
		}
		/*for(j=0;j<n;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
			if(b[j]>max)
			{
				max=b[j];
			}
		}*/
		for (k = 0;k < 1000;k++)
		{
			temp = 0;
			for (j = 0;j < n;j++)
			{
				if (a[j] <= k != 0 && b[j]> k)
				{
					temp++;
				}
			}
			if (temp > sum)
			{
				sum = temp;
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

