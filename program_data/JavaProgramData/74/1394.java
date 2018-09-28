package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int m = 1;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				m = 0;
				break;
			}
		}
		return m;
	}
	public static int huiwen(int n)
	{
		int m = 0;
		int t = n;
		int z = 0;
		while (t > 0)
		{
			  m = m * 10 + t % 10;
			  t = t / 10;
		}
	if (m == n)
	{
		z = 1;
	}
	return z;
	}
	public static void Main()
	{
		 int m;
		 int n;
		 int i;
		 int j = 0;
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
		 for (i = m;i < n + 1;i++)
		 {
			 if (sushu(i) != 0 && huiwen(i) != 0)
			 {
			   j++;
			   if (j == 1)
			   {
				   System.out.printf("%d",i);
			   }
			   else if (j > 1)
			   {
				   System.out.printf(",%d",i);
			   }
			 }
		 }
		 if (j == 0)
		 {
			 System.out.print("no");
		 }
	}
}

