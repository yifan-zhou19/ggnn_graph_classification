package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int reverse = int num;
	   int[] num = new int[6];
	   int i;
	   for (i = 0;i < 6;i++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   num[i] = Integer.parseInt(tempVar);
		   }
	   }
	   for (i = 0;i < 6;i++)
	   {
		   num[i] = reverse(num[i]);
	   }
	   for (i = 0;i < 6;i++)
	   {
		   System.out.printf("%d\n",num[i]);
	   }
	}

	public static int reverse(int num)
	{
		int i = 0;
		int n = 0;
		int flag;
		int[] a = new int[100];
		if (num == 0)
		{
			num = 0;
		}
		else
		{
			if (num > 0)
			{
				flag = 1;
			}
			else
			{
				flag = -1;
			}
			num = Math.abs(num);
			{
			while (num > 0)
			{
				a[i] = num % 10;
				i++;
				num = (num - num % 10) / 10;
				n++;
			}
			for (i = 0;i < n;i++)
			{
				num = num + a[i] * Math.pow(10,n - i - 1);
			}
			}
			num = num * flag;
		}
		return (num);
	}


}

