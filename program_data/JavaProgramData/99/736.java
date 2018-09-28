package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int i;
		float b = 0F; //bcde?????
		float c = 0F;
		float d = 0F;
		float e = 0F;
		for (i = 0;i < n;i++)
		{
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
		 if (a[i] < 19)
		 {
			 b = b + 1;
		 }
		 if (a[i] > 18 && a[i] < 36)
		 {
			 c = c + 1;
		 }
		 if (a[i] > 35 && a[i] < 61)
		 {
			 d = d + 1;
		 }
		 if (a[i] > 60)
		 {
			 e = e+1;
		 }
		}
		b = b / n * 100;
		c = c / n * 100;
		d = d / n * 100;
		e = e / n * 100;
		System.out.print("1-18: ");
		System.out.printf("%.2f",b);
		System.out.print('%');
		System.out.print("\n");
		System.out.print("19-35: ");
		System.out.printf("%.2f",c);
		System.out.print('%');
		System.out.print("\n");
		System.out.print("36-60: ");
		System.out.printf("%.2f",d);
		System.out.print('%');
		System.out.print("\n");
		System.out.print("60??: ");
		System.out.printf("%.2f",e);
		System.out.print('%');
		System.out.print("\n");
		System.in.read();
		System.in.read();
		return 0;
	}



}

