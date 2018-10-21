package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int sum;
		int i;
		int j;
		int d;
		int e;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		for (i = 0;a > 400;i++)
		{
		  a = a - 400;
		}
		d = (a - 1) / 4;
		e = (a - 1) / 100;
		sum = (a - 1) * 365 + d - e;
		for (j = 0;j < b;j++)
		{
		   sum = sum + month[j];
		}
		if ((a % 4 == 0 && a % 100 != 0 || a % 400 == 0) && b > 2)
		{
			sum++;
		}
		sum = sum + c;
		sum = sum % 7;
		switch (sum)
		{
		   case 1:
			   System.out.print("Mon.");
			   break;
		   case 2:
			   System.out.print("Tue.");
			   break;
		   case 3:
			   System.out.print("Wed.");
			   break;
		   case 4:
			   System.out.print("Thu.");
			   break;
		   case 5:
			   System.out.print("Fri.");
			   break;
		   case 6:
			   System.out.print("Sat.");
			   break;
		   case 0:
			   System.out.print("Sun.");
			   break;
		}
		return 0;
	}
}

