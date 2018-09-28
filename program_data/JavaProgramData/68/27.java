package <missing>;

public class GlobalMembers
{
	//??????



	public static int ispo(int m)
	{
		int i;
		for (i = 3;i <= Math.sqrt(m);i++)
		{
			if (m % i == 0)
			{
				return 0;
			}
		}
			return 1;
	}


	public static int stevie()
	{
		int i;
		int j;
		int a;
		int b;
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 6;i <= n;i += 2)
	{
		for (j = 3;j <= (i / 2);j += 2)
		{
			if ((ispo(j)) != 0 && (ispo(i - j)) != 0)
			{
				System.out.print(i);
				System.out.print("=");
				System.out.print(j);
				System.out.print("+");
				System.out.print(i - j);
				System.out.print("\n");
				break;
			}
		}
	}


	return 1;
	}

	public static int Main()
	{
		int a;
	/*clock_t start=clock();
	
	for(int i=1;i<100;++i)*/
	a = stevie();
	//cout<<"time "<<(clock()-start)/CLK_TCK<<endl;
	return 0;
	}


}

