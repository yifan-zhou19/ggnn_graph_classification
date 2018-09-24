public class number
{
//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: unsigned int shuzi;
	public int shuzi;
	public float pianli;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	float average;
	float sum = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	number[] num = tangible.Arrays.initializeWithDefaultnumberInstances(301);
	number t = new number();

	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i].shuzi = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
	sum = sum + num[i].shuzi;
	}
	average = sum / (float)n;
	for (i = 0;i < n;i++)
	{
	num[i].pianli = Math.abs(num[i].shuzi - average);
	}
	for (j = 0;j < n;j++)
	{
	for (i = 0;i < n - j - 1;i++)
	{
		if (num[i].pianli > num[i + 1].pianli)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=num[i];
		t.copyFrom(num[i]);
		num[i] = num[i + 1];
		num[i + 1] = t;
		}
	else
	{
		if (num[i].pianli == num[i + 1].pianli)
		{
		if (num[i].shuzi > num[i + 1].shuzi)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=num[i];
			  t.copyFrom(num[i]);
		num[i] = num[i + 1];
		num[i + 1] = t;
		}
		}
	}
	}
	}

	for (i = 0;i < n - 1;i++)
	{

		if (num[i].pianli == num[n - 1].pianli)
		{
			System.out.printf("%d,", num[i].shuzi);
		}

	}
		System.out.printf("%d", num[n - 1].shuzi);


	return 1;
	}
}

