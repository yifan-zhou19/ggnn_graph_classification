package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] num = new int[26];
	public static int[] val = new int[26];
	public static int Main()
	{


		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			val[i] = 0;
		}
		//for(int i=0;i<k;i++)
		//	cout<<num[i]<<endl;
		for (int i = k - 1;i >= 0;i--)
		{
			if (i == k - 1)
			{
				val[i] = 1;
			}
			else
			{
				int temp = 0;
				for (int j = i;j < k;j++)
				{
					if (num[i] >= num[j] != 0 && val[j] >= temp)
					{
						temp = val[j];
		//				cout<<num[i]<<" "<<num[j]<<" "<<temp<<endl;
					}
				}
				val[i] = temp + 1;
			}


		}
	int sum = 0;
	for (int i = 0;i < k;i++)
	{
		//cout<<val[i]<<endl;
			if (val[i] >= sum)
			{
				sum = val[i];
			}
	}
	System.out.print(sum);
	System.out.print("\n");

	return 0;

	}
}

