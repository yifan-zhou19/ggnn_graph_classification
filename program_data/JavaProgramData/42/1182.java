package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shuzu = new int[100000];
		int n;
		int num;
		int i;
		int j;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			shuzu[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
						count = 0;
						if (shuzu[i] == num)
						{
										 for (j = i + 1;j < n;j++)
										 {
											 shuzu[j - 1] = shuzu[j];
										 }
										 count++;
										 if (shuzu[i] == num)
										 {
											 i--;
										 }
						} //????????????????????
						n = n - count; //??????????
		}
	for (i = 0;i < n;i++)
	{
					System.out.print(shuzu[i]);
					if (i < n - 1)
					{
						System.out.print(" ");
					}
	}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	return 0;
	}

}

