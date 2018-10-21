package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] a = new int[20];
		int j;
		int p;
		int x;
		if (num < 0)
		{
			System.out.print("-");
		num = -num;
		}
		else if (num == 0)
		{
			System.out.print(0);
		}
		for (j = 0;num > 0;j++)
		{
			a[j] = num % 10;
		num = num / 10;
		//cout<<a[j]<<' '<<j<<endl;
		}
		p = j;
		for (j = 0;j <= p;j++)
		{ //cout<<a[j];
			if (a[j] != 0)
			{
				 x = j;
				 break;
			}
		}

		for (j = x;j < p;j++)
		{
		System.out.print(a[j]);
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int reverse(int UnnamedParameter);
	public static int Main()
	{
		int i;
		int n;
		for (i = 0;i < 6;i++)
		{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		reverse(n);
		System.out.print("\n");
		}
		System.in.read();
		return 0;
	}


}

