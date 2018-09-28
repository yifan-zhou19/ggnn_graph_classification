package <missing>;

public class GlobalMembers
{
	//
	// ????4.cpp ?????
	// ?????? 1200012943
	// ??:2012.9.29
	//
	public static int Main()
	{
		int n; //??n?????
		float x1 = 0F; //??x1 x2 x3 x4??????
		float x2 = 0F;
		float x3 = 0F;
		float x4 = 0F;
			 int[] a = new int[100];
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 for (int i = 0; i < n; i++)
			 {
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] <= 18)
			{
				x1 = x1 + 1;
			}
			else if (a[i] <= 35)
			{
				x2 = x2 + 1;
			}
				 else if (a[i] <= 60)
				 {
					 x3 = x3 + 1;
				 }
					  else
					  {
						  x4 = x4 + 1;
					  }
			 }
		x1 = 100 * x1 / n; //?????
		x2 = 100 * x2 / n;
		x3 = 100 * x3 / n;
		x4 = 100 * x4 / n;
		System.out.printf("%f", "1-18: ");
		System.out.printf("%.2f", x1);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", x2);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", x3);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", x4);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

