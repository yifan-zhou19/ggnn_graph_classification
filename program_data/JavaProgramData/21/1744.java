package <missing>;

public class GlobalMembers
{
	public static void bubble(tangible.RefObject<Integer> p, int n)
	{
		int i = 0;
		int pass;
		int temp;

		for (pass = 1;pass <= n;pass++)
		{
			for (i = 0;i < n - pass;i++)
			{
				if ((p.argValue) > *(p.argValue+1))
				{
					temp = (p.argValue);
					(p.argValue) = *(p.argValue+1);
					*(p.argValue+1) = temp;
				}
			}
		}
		return;
	}
	public static float ffabs(float x)
	{
		if (x > 0F)
		{
			return x;
		}
		else
		{
			return -x;
		}
	}
	public static void Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num;
		int num;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp;
		int temp;
		int r = 0;
		float ave;
		float max = 0.0F;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		num = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		temp = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(num + i) = Integer.parseInt(tempVar2);
			}
			sum += *(num + i);
		}

		ave = (float)sum / (float)n;

		for (i = 0;i < n;i++)
		{
			if (ffabs((float) * (num + i) - ave) >= max)
			{
				max = ffabs((float) * (num + i) - ave);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (ffabs(ffabs((float) * (num + i) - ave) - max) < 0.0000001F)
			{
				*(temp + r) = *(num + i);
				r++;
			}
		}
		if (r == 1)
		{
			System.out.printf("%d",*(temp + 0));
		}
		else
		{
		tangible.RefObject<Integer> tempRef_temp = new tangible.RefObject<Integer>(temp);
			bubble(tempRef_temp, r);
			temp = tempRef_temp.argValue;
			for (i = 0;i < r;i++)
			{
				System.out.printf("%d%c",*(temp + i),(i != r - 1?',':'\n'));
			}
		}
	}

}

