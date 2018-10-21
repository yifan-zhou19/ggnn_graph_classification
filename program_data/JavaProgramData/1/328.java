package <missing>;

public class GlobalMembers
{
	public static int Divide(int a, int b)
	{
		int Sum = 0;
		int i = 0;
		int Flag = 0;
	   if (a != 1)
	   {
			for (i = b;i > 1;i--)
			{
			 if (a % i == 0)
			 {
			 Sum += Divide(a / i, i);
			 }
		   Flag = 1;
			}
	   }
	   if (Flag == 0 || a == 1)
	   {
			Sum = 1;
	   }
	return Sum;
	}
	public static int Main()
	{
		int Times = 0;
		int Num = 0;
		int i = 0;
		int[] Temp = new int[100];
		Times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < Times;i++)
	{
			Num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   Temp[i] = Divide(Num, Num);
	}
	for (i = 0;i < Times;i++)
	{
		   System.out.print(Temp[i]);
		   System.out.print("\n");
	}
	return 0;
	}


}

