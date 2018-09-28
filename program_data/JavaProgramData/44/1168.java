package <missing>;

public class GlobalMembers
{
	public static int cifang(int n)
	{
		int i;
		int t = 1;
		for (i = 0;i < n;i++)
		{
		t = t * 10;
		}
		return t;
	}
	public static int reverse(int num)
	{
		int i;
		int j;
		int k;
		int count = 0;
		int[] a = new int[100];
		for (i = 0;i < 100;i++)
		{
		a[i] = 0;
		}
		for (i = 0;num != 0;i++)
		{
		a[i] = (num % cifang(i + 1)) / cifang(i);
		num = num - a[i] * cifang(i);
		count++;
		}
		int total = 0;
		for (i = 0;i < count;i++)
		{
		total = total + a[i] * cifang(count - i - 1);
		}
		 return total;
	}
	public static int Main()
	{
		  int k;
		  int i;
		  for (i = 6;i > 0;i--)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  System.out.printf("%d\n",reverse(k));
		  }
		  System.in.read();
		  System.in.read();
	}


}

