package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int tianji(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, int n)
	{
		if (n == 0)
		{
			return 0;
		}
		if (*(p1.argValue + n - 1) > *(p2.argValue + n - 1))
		{
			return tianji(p1, p2, n - 1) + 200;
		}
		if (*(p1.argValue + n - 1) < *(p2.argValue + n - 1))
		{
			return tianji(p1, p2.argValue+1, n - 1) - 200;
		}
		if (p1.argValue > p2.argValue)
		{
			return tianji(p1.argValue+1, p2.argValue+1, n - 1) + 200;
		}
		if (p1.argValue < p2.argValue)
		{
			return tianji(p1, p2.argValue+1, n - 1) - 200;
		}
		if (p1.argValue == p2.argValue)
		{
			if (*(p1.argValue + n - 1) == p2.argValue)
			{
				return tianji(p1, p2.argValue+1, n - 1);
			}
			else
			{
				return tianji(p1, p2.argValue+1, n - 1) - 200;
			}
		}
	}

	public static int Main()
	{
		int s;
		int i;
		int j;
		int k;
		int[] a = new int[2000];
		int[] b = new int[2000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		int n;
		int t;
		for (s = 0;s < 99;s++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 1;i < n;i++)
			{
				for (j = 0;j < n - i;j++)
				{
					if (a[j + 1] > a[j])
					{
						t = a[j];
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
					if (b[j + 1] > b[j])
					{
						t = b[j];
						b[j] = b[j + 1];
						b[j + 1] = t;
					}
				}
			}
			p1 = a;
			p2 = b;
			if (a[0] > a[n - 1] && b[0] > b[n - 1])
			{
			tangible.RefObject<Integer> tempRef_p1 = new tangible.RefObject<Integer>(p1);
			tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
				System.out.print(tianji(tempRef_p1, tempRef_p2, n));
				p2 = tempRef_p2.argValue;
				p1 = tempRef_p1.argValue;
				System.out.print("\n");
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0;
	}






}

