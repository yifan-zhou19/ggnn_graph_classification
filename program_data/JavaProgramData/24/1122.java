package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[10000]);
		int n;
		int j = 0;
		int i = 0;
		int k = -1;
		int[] len = new int[10000];
		int max;
		int min;
		int sum = 0;
		zfc = new Scanner(System.in).nextLine();
		n = zfc.length();
		for (j = 0;j < n;j++)
		{
			len[j] = -1;
			for (i = k + 1;i < n;i++)
			{
				len[j]++;
				if (zfc.charAt(i) == 32)
				{
				   break;
				}
				if (i == n - 1)
				{
				   len[j]++;
				}
			}
			k = i;
			if (k == n)
			{
			   break;
			}
		}
		j++;
		for (i = 0;i < j;i++)
		{
			for (k = 0;k < j;k++)
			{
				if (len[i] > len[k])
				{
				   break;
				}
				else
				{
					min = i;
				}
			}
			if (k == j)
			{
			   break;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (k = 0;k < j;k++)
			{
				if (len[i] < len[k])
				{
				   break;
				}
				else
				{
					max = i;
				}
			}
			if (k == j && len[i] >= len[k])
			{
			   break;
			}
		}
		if (max == 0)
		{
		   for (i = 0;i < len[max];i++)
		   {
			   System.out.printf("%c",zfc.charAt(i));
		   }
		}
		else
		{
			for (i = 0;i < max;i++)
			{
				sum = sum + len[i] + 1;
			}
			for (i = sum;i < sum + len[max];i++)
			{
			   System.out.printf("%c",zfc.charAt(i));
			}
		}
		System.out.print("\n");
		sum = 0;
		if (min == 0)
		{
		   for (i = 0;i < len[min];i++)
		   {
			   System.out.printf("%c",zfc.charAt(i));
		   }
		}
		else
		{
			for (i = 0;i < min;i++)
			{
				sum = sum + len[i] + 1;
			}
			for (i = sum;i < sum + len[min];i++)
			{
			   System.out.printf("%c",zfc.charAt(i));
			}
		}
		return 0;
	}





}
