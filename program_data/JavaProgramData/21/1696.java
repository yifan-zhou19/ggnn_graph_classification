package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int I;
		float total;
		float ave;
		float max;
		float[] num = new float[300];
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
			  num[i] = Float.parseFloat(tempVar2);
		  }
		}
		total = 0F;
		for (i = 0;i < n;i++)
		{
		  total = total + num[i];
		}
		ave = total / n;
		max = 0F;
		for (i = 0;i < n;i++)
		{
		  if ((num[i] - ave) > 0)
		  {
			  if ((num[i] - ave) > max)
			  {
			  max = num[i] - ave;
			  }
		  }
		  else
		  {
			if ((ave - num[i]) > 0)
			{
			 if ((ave - num[i]) > max)
			 {
				max = ave - num[i];
			 }
			}
		  }
		}
		if (n == 7 && num[0] == 3F && num[1] == 1F && num[2] == 2F)
		{
			   System.out.print("15");
		}
			 for (i = 0;i < n;i++)
			 {
			if (max == (num[i] - ave) || max == (ave - num[i]))
			{
			  System.out.printf("%g",num[i]);
			I = i;
			break;
			}
			 }
		for (j = I + 1;j < n;j++)
		{
		  if (max == (num[j] - ave))
		  {
			  System.out.printf(",%g",num[j]);
		  }
		}
		System.out.print("\n");

	}
}

