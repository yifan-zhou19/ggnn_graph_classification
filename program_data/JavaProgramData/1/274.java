package <missing>;

public class GlobalMembers
{
	public static int yinshu(int be,int by)
	{
		int i; //cout<<be<<' '<<by<<endl;
		int sum = 0;
		for (i = by;i * i <= be;i++)
		{
						   if (be % i == 0)
						   {
							   sum += 1 + yinshu(be / i, i);
						   }
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int num;
		int sign;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
						num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						for (j = num;j > 1;j--)
						{
							if (num % j == 0)
							{
								sign = j;
							}
						}
						System.out.print(yinshu(num, sign) + 1);
						System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

