package <missing>;

public class GlobalMembers
{
	public static int f(tangible.RefObject<Integer> p, int n)
	{
		int i;
		int k;
		k = p.argValue;
		for (i = 1;i < n;i++)
		{
			if (*(p.argValue + i) >= k)
			{
				k = (p.argValue + i);
			}
		}
		return (k);
	}
	public static void Main()
	{
		int[] s = new int[300];
		int i = 0;
		int n;
		int a;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		char c;
		p = s[0];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[0] = Integer.parseInt(tempVar);
		}
		while ((c = System.in.read()) == ',')
		{
			i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		n = i + 1;
		if (n == 1)
		{
			System.out.print("No\n");
		}
		else
		{
		tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
			a = f(tempRef_p, n);
			p = tempRef_p.argValue;
			b = 0;
			for (i = 0;i < n;i++)
			{
				if (s[i] < a && s[i] >= b)
				{
					b = s[i];
				}
			}
			if (b != 0)
			{
				System.out.printf("%d\n",b);
			}
			else
			{
				System.out.print("No\n");
			}
		}
	}

}

