package <missing>;

public class GlobalMembers
{
	public static int iFind(tangible.RefObject<Integer> p, int findnum)
	{
		int k;
		int sum = 0;
		for (k = 0; k < 15; k++)
		{
			if (*(p.argValue + k) == findnum)
			{
				sum++;
			}
		}
		return sum;
	}


	public static int Main()
	{
		int[] a = new int[15];
		int temp;
		int i = 0;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int sum = 0;
		p = a;
		for (j = 0; j < 15; j++)
		{
			a[j] = -1;
		}
		while ((temp, temp != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (temp != 0)
			{
				a[i] = temp;
				i++;
			}
			else
			{
				for (k = 0; k < 15; k++)
				{
				tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
					sum += iFind(tempRef_p, a[k] * 2);
					p = tempRef_p.argValue;
				}
				System.out.print(sum);
				System.out.print("\n");
				sum = 0;
				i = 0;
				for (j = 0; j < 15; j++)
				{
					a[j] = -1;
				}
			}
		}
		return 0;
	}










}

