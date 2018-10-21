package <missing>;

public class GlobalMembers
{
	//****************************
	//*??????**
	//*???????**
	//*???2012.12.15**
	//****************************
	public static int Main()
	{
		int n;
		int i;
		int k;
		int p;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct people
	//	{
	//		int a;
	//		int b;
	//	}
		peo[10000] = {0}; //a???????????  b?????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p == 0 && q == 0)
			{
				break;
			}
			peo[p].a++;
			peo[q].b++;
		}
		k = 0;
		for (i = 0; i < n; i++)
		{
			if (peo[i].a == 0 && peo[i].b == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				k = 1;
			}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

