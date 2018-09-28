package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] age = new int[100];
	int n;
	int i;
	float a;
	float b;
	float c;
	float d;
	float p = 0F;
	float q = 0F;
	float r = 0F;
	float s = 0F;
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
			  age[i] = Integer.parseInt(tempVar2);
		  }
		  if (age[i] <= 18)
		  {
			  p += 1;
		  }
		  if (age[i] <= 35 && age[i] >= 19)
		  {
			  q += 1;
		  }
		  if (age[i] <= 60 && age[i] >= 36)
		  {
			  r += 1;
		  }
		  if (age[i] > 60)
		  {
			  s += 1;
		  }
	   }
	   a = p / n * 100;
	   b = q / n * 100;
	   c = r / n * 100;
	   d = s / n * 100;

	System.out.printf("1-18: %.2f%%\n",a);
	System.out.printf("19-35: %.2f%%\n",b);
	System.out.printf("36-60: %.2f%%\n",c);
	System.out.printf("60??: %.2f%%\n",d);
	return 0;
	}
}

