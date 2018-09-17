package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] male = new float[40];
		float[] female = new float[40];
		float[] all = new float[41];
		int count1 = 0;
		int count2 = 0;
		int n;
		int i;
		int j;
		int k;
		float s;
		float t;
		float y;
		String x = new String(new char[7]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 x = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 y = Float.parseFloat(tempVar3);
			 }
			 //printf("%s,%f\n",x,y);
			 if (x.length() == 4)
			 {
				  male[count1] = y;
				  count1++;
			 }
			 else
			 {
				  female[count2] = y;
				  count2++;
			 }
		}
			 for (i = 0;i <= count1 - 2;i++)
			 {
			   for (j = i + 1;j <= count1 - 1;j++)
			   {
					if (male[i] > male[j])
					{
					s = male[i];
					male[i] = male[j];
					male[j] = s;
					}
			   }
			 }
			 for (i = 0;i <= count2 - 2;i++)
			 {
			   for (j = i + 1;j <= count2 - 1;j++)
			   {
					if (female[i] < female[j])
					{
					t = female[i];
					female[i] = female[j];
					female[j] = t;
					}
			   }
			 }
			 for (k = 0;k <= count1 - 1;k++)
			 {
				all[k] = male[k];
			 }
			 for (k = count1;k <= count1 + count2 - 1;k++)
			 {
				all[k] = female[k - count1];
			 }
	for (k = 0;k <= count1 + count2 - 2;k++)
	{
	System.out.printf("%.2f ",all[k]);
	}
	System.out.printf("%.2f",all[count1 + count2 - 1]);
	}

}

