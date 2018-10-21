package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300],i=0,j,k=0,f=1,t,s;
		int[] a = new int[300];
		int i = 0;
		int j;
		int k = 0;
		int f = 1;
		int t;
		int s;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}

		while (c = System.in.read() != '\n')
		{
			i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (i == 0)
		{
			System.out.print("No\n");
			f = 0;
		}
		else
		{
			for (j = 1;j <= i;j++)
			{
				if (a[j] == a[0])
				{
					k++;
				}
			}
			if (k == i)
			{
				System.out.print("No\n");
			f = 0;
			}
		}
		if (f != 0)
		{
			t = a[0];

			for (j = 0;j <= i;j++)
			{
				if (a[j] > t)
				{
					t = a[j];
				}
			}
			s = 0;
			for (j = 0;j <= i;j++)
			{
				if (a[j] > s && a[j] != t)
				{
					s = a[j];
				}
			}

		System.out.printf("%d\n",s);
		}
	}
}

