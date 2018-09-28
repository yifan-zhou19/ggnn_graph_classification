package <missing>;

public class GlobalMembers
{
	public static int fang(int x)

	{

	int i;
	int y;

	i = 1;

	y = 1;

	while (i++<=x) //  while(i++<=x)
	{

	y = y * 10;
	}

	return (y);

	}
	 public static void Main()

	 {



	 int sum;
	 int a;
	 int b;
	 int i;
	 int t;
	 int s;
	 int p;

	 sum = 0;

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }

	 i = 4;

	 p = 10000;

	 s = a / p; // s=a/p; b=a%p;



	 while (s == 0)

	 {

	 i = i - 1;

	 p = fang(i);

	 s = a / p; // s=b/p; b=b%p;

	 }



	 t = i;



	 while (t >= 0)

	 {

	 b = a % 10;

	 a = a / 10;

	 sum = sum + fang(t) * b;

	 t = t - 1;

	 }



	 System.out.printf("%d",sum);

	 }
}

