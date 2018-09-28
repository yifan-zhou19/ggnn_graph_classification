package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int p = 0;
		int k = 0;
		int l = 0;
		int j = 0;
		int i = 0;
		int[] num = new int[300];
		String in = new String(new char[1000]);
		for (i = 0;i < 1000;i++)
		{
			in = in.substring(0, i);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			in = tempVar.charAt(0);
		}
		i = 0;
		while (in.charAt(i) != null)
		{
			if (in.charAt(i) >= '0' && in.charAt(i) <= '9')
			{
				num[j] = num[j] * 10 + in.charAt(i) - 48;
			}
			else if ((in.charAt(i) < '0' || in.charAt(i)>'9') && (in.charAt(i - 1) >= '0' && in.charAt(i - 1) <= '9'))
			{
				j++;
			}
			i++;
		}
	//	printf("%d\n",j);
		for (i = 0;i < j;i++)
		{
			for (k = 0;k < j - i;k++)
			{
				if (num[k] >= num[k + 1])
				{
					p = num[k];
					num[k] = num[k + 1];
					num[k + 1] = p;
				}
			}
		}
	//	for(i=0;i<=j;i++) printf("%d ",num[i]);
		for (i = j - 1;i >= 0;i--)
		{
			if (num[i] == num[i + 1])
			{
				l++;
				continue;
			}
			else
			{
				System.out.printf("%d\n",num[i]);
				break;
			}

		}
		if (l == j)
		{
			System.out.print("No\n");
		}
	}


}

