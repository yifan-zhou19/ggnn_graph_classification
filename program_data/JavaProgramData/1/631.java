package <missing>;

public class GlobalMembers
{
	public static void decprime(int begain, int a)
	{
		int i;
		 //int u=int(sqrt(double(a)));
	//int m[10000]={};

		//if(a==2||a==3||a==5)return 1;
		//else{
			for (i = begain;i <= a;i++)
			{
			if (a % i == 0 && i <= a / i)
			{
				sum++;
				decprime(i, a / i);
			}
			if (i > a / i)
			{
				break;
			}
				//m[i]=decprime(a/i);
			//else m[i]=0;
	//sum+=m[i];
			//}
		 //return sum+1;
			}
	}
	public static int sum = 1;
	public static int Main()
	{
		int n;
		int a;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 decprime(2, a);
			 System.out.print(sum);
			 System.out.print("\n");
			 sum = 1;
		}
		return 0;
	}

}

