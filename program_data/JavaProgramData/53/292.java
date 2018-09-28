package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] shuzu = new int[100];

	for (int i = 0;i < n;i++)
	{
	shuzu[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (int k = 0;k < n;k++)
	{
		if (shuzu[k] == 0)
		{
			continue;
		}
		for (int j = k + 1;j < n;j++)
		{
			if (shuzu[j] == shuzu[k])
			{
				shuzu[j] = 0;
			}
		}
	}
	int t;
	for (int q = 0;q < n;q++)
	{
		if (shuzu[q] != 0)
		{
			System.out.print(shuzu[q]);
		}
		t = q;
		break;
	}

	for (int w = t + 1;w < n;w++)
	{
	 if (shuzu[w] == 0)
	 {
		 continue;
	 }
	 System.out.print(",");
	 System.out.print(shuzu[w]);
	}

	//for(i=0;i<n;i++){cout<<shuzu[i];}



	return 0;

	}
}

