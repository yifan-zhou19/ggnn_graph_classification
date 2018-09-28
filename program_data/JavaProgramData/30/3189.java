package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long sum=0;
	int sum = 0;
	int judge = int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	if (i % 7 != 0 && judge(i) == 0)
	{
	sum += i * i;
	}
	}
	System.out.printf("%ld\n",sum);
	return 0;
	}
	public static int judge(int i)
	{
	int k;

	if (i >= 10)
	{
	do
	{
	k = i % 10;
	if (k == 7)
	{
		return 1;
	}
	i = i / 10;
	} while (i >= 10);
	}
	if (i == 7)
	{
		return 1;
	}
	else
	{
		return 0;
	}

	}
}

