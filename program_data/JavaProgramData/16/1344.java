package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n??,a[i]???
		int[] a = new int[5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = n % 10,a[1] = (n / 10) % 10,a[2] = (n / 100) % 10,a[3] = (n / 1000) % 10,a[4] = (n / 10000) % 10;
		//?????????
		 if (n < 10)
		 {
		System.out.print(a[0]);
		 }
		 else if (n < 100 && n >= 10)
		 {
		  System.out.print(a[0]);
		  System.out.print(a[1]);
		 }
		else if (n < 1000 && n >= 100)
		{
		System.out.print(a[0]);
		System.out.print(a[1]);
		System.out.print(a[2]);
		}
		else if (n < 10000 && n >= 1000)
		{
		System.out.print(a[0]);
		System.out.print(a[1]);
		System.out.print(a[2]);
		System.out.print(a[3]);
		}
		else
		{
			System.out.print(a[0]);
			System.out.print(a[1]);
			System.out.print(a[2]);
			System.out.print(a[3]);
			System.out.print(a[4]);
		}
	}
}

