package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void print(char * x,int * y,int z);
		String s = new String(new char[100]);
		String p;
		int[] a = new int[100];
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		p = s;
		n = s.length();
		for (i = 0;s.charAt(i);i++)
		{
			a[i] = i + 1;
		}
		q = a[0];

	tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
	tangible.RefObject<Integer> tempRef_q = new tangible.RefObject<Integer>(q);
		print(tempRef_p, tempRef_q, n);
		q = tempRef_q.argValue;
		p = tempRef_p.argValue;
	}

	public static void print(tangible.RefObject<String> x, tangible.RefObject<Integer> y, int z)
	{
		int i;
		int j;
		int k;
		for (k = 0;k < z / 2;k++)
		{
			for (i = 0; * (x.argValue.Substring(i));i++)
			{
				if (*(x.argValue.Substring(i)) != *(x.argValue.Substring(i) + 1))
				{
					break;
				}
			}
			System.out.printf("%d %d\n",*(y.argValue + i) - 1,*(y.argValue + i + 1) - 1);

			for (j = i + 2; * (x.argValue.Substring(j));j++)
			{
				*(x.argValue.Substring(j) - 2) = *(x.argValue.Substring(j));
				   *(y.argValue + j - 2) = *(y.argValue + j);
			}
		}
	}

}

