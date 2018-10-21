package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num;
		int i;
		int j = 0;
		int k = 0;
		int m;
		int n;
		float[] hight = new float[N];
		float hi;
		float[] woman = new float[N];
		float[] man = new float[N];
		final String string1 = "male";
		char[][] string = new char[N][7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				string[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				hight[i] = Float.parseFloat(tempVar3);
			}
			if (strcmp(String[i],string1) == 0)
			{
				man[j] = hight[i];
				j = j + 1;
			}
			else
			{
				woman[k] = hight[i];
				k = k + 1;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (m = i;m < j;m++)
			{
				if (man[i] > man[m])
				{
					hi = man[i];
					man[i] = man[m];
					man[m] = hi;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (n = i;n < k;n++)
			{
				if (woman[i] < woman[n])
				{
					hi = woman[n];
					woman[n] = woman[i];
					woman[i] = hi;
				}
			}
		}
			for (i = 0;i < j;i++)
			{
				System.out.printf("%4.2f ",man[i]);
			}
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%4.2f ",woman[i]);
			}
			System.out.printf("%4.2f",woman[k - 1]);
			System.out.print("\n");
	}




}

