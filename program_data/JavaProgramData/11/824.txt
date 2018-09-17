package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int j;
		int k;
		int sum = 0;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= (m - 1);i++)
		{
			 if (i == 1)
			 {
			 sum = sum + 31;
			 }
			 if (i == 3)
			 {
			 sum = sum + 31;
			 }
			 if (i == 5)
			 {
			 sum = sum + 31;
			 }
			 if (i == 7)
			 {
			 sum = sum + 31;
			 }
			 if (i == 8)
			 {
			 sum = sum + 31;
			 }
			 if (i == 10)
			 {
			 sum = sum + 31;
			 }
			  if (i == 12)
			  {
			 sum = sum + 31;
			  }
			 if (i == 4)
			 {
			 sum = sum + 30;
			 }
			 if (i == 6)
			 {
			 sum = sum + 30;
			 }
			 if (i == 9)
			 {
			 sum = sum + 30;
			 }
			 if (i == 11)
			 {
			 sum = sum + 30;
			 }
			 if (i == 2)
			 {
					  j = y % 4,k = y % 400,a = y % 100;
					  if ((a != 0 && j == 0) || (k == 0))
					  {
					  sum = sum + 29;
					  }
					  else
					  {
					  sum = sum + 28;
					  }
			 }
		}
		sum = sum + d;
		System.out.printf("%d\n",sum);
		System.in.read();
		System.in.read();
	}

}

