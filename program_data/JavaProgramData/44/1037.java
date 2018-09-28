package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] a = new int[11];
		int i;
		int j;
		int flag;
		int n;
		if (num == 0)
		{
			return 0;
		}
		else if (num < 0)
		{
			flag = -1;
		}
		else
		{
			flag = 1;
		}
		num = Math.abs(num);
		for (i = 0;i <= 10;i++)
		{
			a[i] = 0;
		}
		i = 0;
		while (num > 0)
		{
		  a[i] = num % 10;
		  num = num / 10;
		  i++;
		}
		i--;
		n = 0;
		for (j = 0;j <= i;j++)
		{
		n = n * 10 + a[j];
		}
		if (flag < 0)
		{
			return (-n);
		}
		else
		{
			return (n);
		}
	}
	public static int Main()
	{
		  int i;
		  int num;
		  for (i = 0;i < 6;i++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  num = Integer.parseInt(tempVar);
			  }
			num = reverse(num);
			System.out.printf("%d\n",num);
		  }
	}
}

