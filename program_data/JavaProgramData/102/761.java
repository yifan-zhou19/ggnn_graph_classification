package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int min;
		String flag = new String(new char[42]);
		float[] male = new float[42];
		float[] female = new float[42];
		float h;
		String str = new String(new char[10]);
		j = 0;
		k = 0;
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
				str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Float.parseFloat(tempVar3);
			}
			if (str.charAt(0) == 'm')
			{
				male[j] = h;
				j++;
			}
			else
			{
				female[k] = h;
				k++;
			}
		}
		male[41] = 100F;
		for (i = 0;i < j;i++)
		{
			flag = tangible.StringFunctions.changeCharacter(flag, i, 1);
		}
		for (m = 0;m < j;m++)
		{
			min = 41;
			for (i = 0;i < j;i++)
			{
				if (male[i] < male[min] && flag.charAt(i) == 1)
				{
					min = i;
				}
			}
			flag = flag.substring(0, min);
			System.out.printf("%.2f ",male[min]);
		}
		female[41] = 0F;
		for (i = 0;i < k;i++)
		{
			flag = tangible.StringFunctions.changeCharacter(flag, i, 1);
		}
		for (m = 0;m < k;m++)
		{
			min = 41;
			for (i = 0;i < k;i++)
			{
				if (female[i] > female[min] && flag.charAt(i) == 1)
				{
					min = i;
				}
			}
			flag = flag.substring(0, min);
			if (m != k - 1)
			{
				System.out.printf("%.2f ",female[min]);
			}
			else
			{
				System.out.printf("%.2f",female[min]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

