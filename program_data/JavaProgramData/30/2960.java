package <missing>;

public class GlobalMembers
{
	public static int xiangguan(int n)
	{
		if (n % 7 == 0)
		{
	 return (0);
		}
	 else if (n % 10 == 7 || n / 10 == 7)
	 {
	 return (0);
	 }
	 else
	 {
		 return (1);
	 }
	}

	public static int Main()
	{
		int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	 int sum = 0;
	 for (i = 1;i <= n;i++)
	 {
	 if (xiangguan(i) != 0)
	 {
	 sum += i * i;
	 }
	 }
	 System.out.printf("%d",sum);
	}
}

