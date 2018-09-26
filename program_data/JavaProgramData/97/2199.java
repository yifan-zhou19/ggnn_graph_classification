package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a = 0;
	  int b = 0;
	  int i = 0;
	  int t = 0;
	  int z = 0;
	  int number = 0;
	  int[] money = {100, 50, 20, 10, 5, 1};

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  b = a;

	  while (i <= 4)
	  {
		t = b % money[i];
		number = (b - t) / money[i];
		b = t - z * money[i];
		System.out.printf("%d\n",number);
		i++;
	  }
	  System.out.printf("%d",b);
	  return 0;
	}
}

