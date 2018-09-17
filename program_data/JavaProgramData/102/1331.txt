package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int number;
	int lm = 0;
	int lw = 0;
	int i;
	int j;
	int m;
	int n;
	float[] height = new float[50];
	float[] hm = new float[50];
	float[] hw = new float[50];
	float k;
	char[][] sex = new char[50][10];
	char[] male = {'m', 'a', 'l', 'e', '\0'};
	char[] female = {'f', 'e', 'm', 'a', 'l', 'e', '\0'};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		number = Integer.parseInt(tempVar);
	}
	for (i = 0;i < number;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 sex[i] = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 height[i] = Float.parseFloat(tempVar3);
	 }
	}
	for (i = 0;i < number;i++)
	{
	 if (strcmp(sex[i],male) == 0)
	 {
	  hm[lm] = height[i];
	  lm++;
	 }
	 if (strcmp(sex[i],female) == 0)
	 {
	  hw[lw] = height[i];
	  lw++;
	 }
	}
	for (i = 0;i < lm;i++)
	{
	  for (j = 0;j < (lm - 1);j++)
	  {
	  if (hm[j] > hm[j + 1])
	  {
	   k = hm[j];
	   hm[j] = hm[j + 1];
	   hm[j + 1] = k;
	  }
	  }
	}
	for (i = 0;i < lw;i++)
	{
	  for (j = 0;j < (lw - 1);j++)
	  {
	  if (hw[j] < hw[j + 1])
	  {
	   k = hw[j];
	   hw[j] = hw[j + 1];
	   hw[j + 1] = k;
	  }
	  }
	}
	System.out.printf("%.2f",hm[0]);
	for (i = 1;i < lm;i++)
	{
	 System.out.printf(" %.2f",hm[i]);
	}
	for (i = 0;i < lw;i++)
	{
	 System.out.printf(" %.2f",hw[i]);
	}

	}

}

