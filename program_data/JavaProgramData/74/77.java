package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int k;
		int huiwen = int number;
		int m;
		int n;
		int i;
		int t;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		t = m;
		for (i = t;i <= n;i++)
		{
			if (sushu(i) == 1 && huiwen(i) == 1)
			{
			System.out.printf("%d",i);
			t = i;
			s++;
			break;
			}
		}
		for (i = t + 1;i <= n;i++)
		{
			if (sushu(i) == 1 && huiwen(i) == 1)
			{
				System.out.printf(",%d",i);
			}
		}
		if (s == 0)
		{
			System.out.print("no");
		}
	}
	public static int sushu(int k)
	{
		int s;
		 for (s = 2;s <= k;s++)
		 {
			if (k % s == 0)
			{
				break;
			}
		 }
		 if (k == s)
		 {
			 return (1);
		 }
		 else
		 {
			 return (0);
		 }
	}
	public static int huiwen(int number)
	{
		int num;
		int sum = 0;
		int a;
		num = number;
		for (;num != 0;)
		{
				a = num % 10;
			 num = num / 10;
			sum = sum * 10 + a;
		}
		if (sum == number)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

