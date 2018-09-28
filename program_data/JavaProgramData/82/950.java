package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????n????i?j???a???b???????p???????q
		int i;
		int j;
		int a;
		int b;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	//	p = 0; //p??????0
		q = 0; //q??????0
		j = 0; //j??????0
		for (i = 1;i <= n;i++) //??n?
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90) //??????
			{
				j = j + 1; //???+1
			}
			else
			{
				j = 0;
			}
	//		p = j;
				if (j > q)
				{
					q = j;
				}
		}
		System.out.print(q);
		System.out.print("\n");
		System.in.read();
		System.in.read(); //????
		return 0;
	}
}

