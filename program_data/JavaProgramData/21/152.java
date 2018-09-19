//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public float a;
public float c;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] num = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(401);
	public static void Main()
	{
		int n;
		int i;
		int j;
		float sum = 0F;
		float b;
		float h = 0F;
		float k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i].a = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + num[i].a;
		}
		b = sum / n;
		for (i = 0;i < n;i++)
		{
			num[i].c = Math.abs(num[i].a - b);
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1;i++)
			{
				if (num[i].c < num[i + 1].c)
				{
					num[400] = num[i];
				num[i] = num[i + 1];
				num[i + 1] = num[400];
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (num[i].c == num[0].c)
			{
				h = h + 1;
			}
		}
		for (j = 0;j < h - 1;j++)
		{
			for (i = 0;i < h - 1;i++)
			{
				if (num[i].c > num[i + 1].c)
				{
					num[400] = num[i];
				num[i] = num[i + 1];
				num[i + 1] = num[400];
				}
			}
		}
		System.out.printf("%.0f",num[0].a);
		for (i = 1;i < h + 1;i++)
		{
			System.out.printf(",%.0f",num[i].a);
		}
	}
}

