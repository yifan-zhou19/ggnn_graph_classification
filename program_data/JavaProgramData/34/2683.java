package <missing>;

public class GlobalMembers
{
	///#include<string.h>
	public static int change(int n)
	{
		int x;
		if (n == 1)
		{
			x = 1;
		}
		else
		{
			if ((n % 2) == 0)
			{
				x = n / 2;
			System.out.printf("%d/2=%d\n",n,x);
			}
			else
			{
				x = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,x);
			}
		}
		return (x);
	}


	public static void Main()
	{
		int n;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		//if(n==1) printf("End");
		k = change(n);
		while (k != 1)
		{
			k = change(k);
		}
		System.out.print("End");
	}


}

