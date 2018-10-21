package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)

	{
	   int n;
	   int i;
	   int j;
	   int sum = 0;
	   int year;
	   int m1;
	   int m2;
	   int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   year = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   m1 = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   m2 = Integer.parseInt(tempVar4);
	   }
	   if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0)
	   {
		   a[1] = 29;
	   }
	   if (m1 > m2)
	   {
		   int m;
				 m = m1;
				 m1 = m2;
				 m2 = m;
	   }
		for (j = m1;j < m2;j++)
		{
		   sum = sum + a[j - 1];
		}
		if (sum % 7 == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		sum = 0;
		a[1] = 28;
	   }
	}
}

