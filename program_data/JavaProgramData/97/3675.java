package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i = 0;
	int j = 0;
	int[] pieces = new int[10];
	int[] result = new int[10];
	float value;
	float[] flag = new float[10];
	float[] mianzhi = {100F, 50F, 20F, 10F, 5F, 1F, 0F, 0F, 0F, 0F};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		value = Float.parseFloat(tempVar);
	}
	while (value >= mianzhi[i],i < 10)
	{
	pieces[i] = value / mianzhi[i];
	value = value - pieces[i] * mianzhi[i];
	i++;
	}
	for (i = 0;i < 10;i++)
	{
	if (pieces[i] >= 0)
	{
	result[j] = pieces[i];
	flag[j] = mianzhi[i];
	j++;
	}
	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("%d\n",result[i]);
	}
	}


}

