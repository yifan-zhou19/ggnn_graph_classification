package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int counter;
		counter = 1;

		float sum;
		float a;
		float b;
		float c;
		float d;
		for (;counter <= m;counter++)
		{
		a = 1F;
		b = 2F;
		sum = 2F;


		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		i = 1;
		while (i < n)
		{
		a = a + b;
		c = (float)a / b;
		sum = sum + c;
		i = i + 1;
		if (i == n)
		{

		break;
		}
		else
		{
		b = a + b;
		d = (float)b / a;
		sum = sum + d;
		i = i + 1;
		}

		}

		System.out.printf("%.3f\n", sum);
		}

		return 0;
	}
}

