package <missing>;

public class GlobalMembers
{
	public static void mysort1(float[] array, int length)
	{
		int i = 0;
		int j = 0;
		int tmpindex = 0;
		double tmpvalue;
		for (i = 0;i < length;i++)
		{
			tmpindex = i;
			for (j = i;j < length;j++)
			{
				if (array[j] < array[tmpindex])
				{
				tmpindex = j;
				}
			}

			tmpvalue = array[tmpindex];
			array[tmpindex] = array[i];
			array[i] = tmpvalue;
		}
	}

	public static void mysort2(float[] array, int length)
	{
		int i = 0;
		int j = 0;
		int tmpindex = 0;
		double tmpvalue;
		for (i = 0;i < length;i++)
		{
			tmpindex = i;
			for (j = i;j < length;j++)
			{
				if (array[j] > array[tmpindex])
				{
				tmpindex = j;
				}
			}

			tmpvalue = array[tmpindex];
			array[tmpindex] = array[i];
			array[i] = tmpvalue;
		}
	}





	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k;
		int m;
		float[] marr = new float[40];
		float[] farr = new float[40];
		String str = new String(new char[8]);
		float height;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				height = Float.parseFloat(tempVar3);
			}
			if (strcmp(str,"male") == 0)
			{
			  marr[i] = height;

			  i++;

			}
			else
			{
			farr[j] = height;

			j++;
			}

		}


		mysort1(marr, i);
		mysort2(farr, j);

		for (m = 0;m < i;m++)
		{
		System.out.printf("%.2f ",marr[m]);
		}

		for (m = 0;m < j - 1;m++)
		{
		System.out.printf("%.2f ",farr[m]);
		}

		System.out.printf("%.2f",farr[j - 1]);







			return 0;
	}










}

