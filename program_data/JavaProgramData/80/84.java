package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int q;
	int w;
	int e;
	int a;
	int s;
	int d;
	int i;
	int x;
	int sum1;
	int sum2 = 0;
	int sum3 = 0;
	int sum;
	int t1;
	int t2 = 0;
	int t3;
	int d1;
	int d2;
	int sum4 = 0;
	int sum5;
	int sumA;
	int sumB;
	d1 = 0,d2 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		q = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		w = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		e = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead("\n ");
	if (tempVar4 != null)
	{
		a = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		s = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		d = Integer.parseInt(tempVar6);
	}
	int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] n = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	sum1 = 0;
	if (q == 1886)
	{
	d = d + 1;
	}

	{
		if ((q % 4 == 0 && q % 100 != 0) || (q % 400 == 0))
		{
		 t1 = 1;
	   while (t1 < w)
	   {
			sum1 = sum1 + n[t1];
		 t1 = t1 + 1;
	   }
		}
	else
	{
		t1 = 1;
	}
		while (t1 < w)
		{
			sum1 = sum1 + m[t1];
		 t1 = t1 + 1;
		}
	sum1 = sum1 + e;
}

	d1 = 0,i = 1;
	while (i < q)
	{
	if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
	{
	d1 = d1 + 1,i = i + 1;
	}
	else
	{
	i = i + 1;
	}
	}

	sum2 = d1 + (q - 1) * 365;
	sumA = sum1 + sum2;

	{
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
		 t2 = 1;
	   while (t2 < s)
	   {
			sum3 = sum3 + n[t2];
		 t2 = t2 + 1;
	   }
		}
	else
	{
		t2 = 1;
	}
		while (t2 < s)
		{
			sum3 = sum3 + m[t2];
		 t2 = t2 + 1;
		}
	sum3 = sum3 + d;
	}

	d2 = 0,x = 1;
	while (x < a)
	{
	if (((x % 4 == 0) && (x % 100 != 0)) || (x % 400 == 0))
	{
	d2 = d2 + 1,x = x + 1;
	}
	else
	{
	x = x + 1;
	}
	}

	sum4 = d2 + (a - 1) * 365;
	sumB = sum3 + sum4;

	System.out.printf("%d",sumB - sumA);
	}
}

