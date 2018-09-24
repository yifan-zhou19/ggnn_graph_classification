package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c = 13;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 0;b < 12;b++)
		{
						 if ((b - 1) * (b - 3) * (b - 5) * (b - 7) * (b - 8) * (b - 10) * (b - 12) == 0)
						 {
						 c = c + 31;
						 }
						 if ((b - 4) * (b - 6) * (b - 9) * (b - 11) == 0)
						 {
						 c = c + 30;
						 }
						 if (b == 2)
						 {
						 c = c + 28;
						 }
						 if ((c + a - 1) % 7 == 5)
						 {
						 if (i != 0)
						 {
						 System.out.print("\n");
						 }
						 i++;
						 System.out.printf("%d",b + 1);
						 }
		}
	}

}

