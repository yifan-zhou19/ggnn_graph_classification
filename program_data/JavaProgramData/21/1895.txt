package <missing>;

public class GlobalMembers
{
	//Define Head files
	public static int[] a = new int[501]; //Array of Elements
	public static int Main()
	{
		int n;
		int x;
		double avr = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 1;x <= n;x++)
		{
			a[x] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			avr += a[x];
		}
		avr = avr / n;
		//Input Fin
		sort(a[1],a[n] + 1);


		/*for(x=1;x<=n;x++)  cout<<a[x]<<' ';
		cout<<endl<<avr;
		*/

		if (avr - a[1] > a[n] - avr)
		{
			System.out.print(a[1]);
			System.out.print("\n");
		}
		else if (avr - a[1] == a[n] - avr)
		{
			System.out.print(a[1]);
			System.out.print(',');
			System.out.print(a[n]);
			System.out.print("\n");
		}
		else
		{
			System.out.print(a[n]);
			System.out.print("\n");
		}


		return 0;
	}

}

