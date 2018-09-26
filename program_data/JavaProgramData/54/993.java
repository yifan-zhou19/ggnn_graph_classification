package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int sum;
	 int num;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 int allocate = new int(int n,int k,int sum,int num);
	 num = n;
	 for (sum = 1;1;sum++)
	 {
	 if (allocate(n, k, sum, num) != 0)
	 {
		System.out.printf("%d",sum);
		break;
	 }
	 }
	 return 0;
	}

	public static int allocate(int n,int k,int sum,int num)
	{
		if (sum / (num) == 0 || sum % num != k)
		{
			return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		else
		{
			return allocate(n - 1, k, sum - sum / num - k, num);
		}
	}
}

